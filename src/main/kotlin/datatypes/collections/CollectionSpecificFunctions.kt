package datatypes.collections

data class User(
    val id: Int,
    val name: String,
    val role: String,
    val age: Int
)

fun collectionSpecificFunctions() {

//       CREATE COLLECTIONS

    // Create using listOf
    val users = listOf(
        User(1, "Alice", "ADMIN", 28),
        User(2, "Bob", "USER", 22),
        User(3, "Charlie", "USER", 30),
        User(4, "Diana", "ADMIN", 35)
    )

    // Create using buildMap
    val userEmailMap = buildMap<Int, String> {
        put(1, "alice@mail.com")
        put(2, "bob@mail.com")
        put(3, "charlie@mail.com")
    }

    println("CREATE:")
    println(users)
    println(userEmailMap)
    println()



//       TRAVERSE COLLECTIONS

    // for-loop traversal
    println("TRAVERSE (for loop):")

    for (user in users) {
        println("User name: ${user.name}")
    }

    // forEach traversal
    println("\nTRAVERSE (forEach):")
    users.forEach {
        println("User role: ${it.role}")
    }
    println()




//  ORDER / SORT COLLECTIONS

    // Sort by age (ascending)
    val sortedByAge = users.sortedBy { it.age }

    // Example 2: Sort by name (descending)
    val sortedByNameDesc = users.sortedByDescending { it.name }

    println("ORDER:")
    println("Sorted by age: $sortedByAge")
    println("Sorted by name desc: $sortedByNameDesc")
    println()




//      GROUP COLLECTIONS

    // groupBy role
    val usersByRole = users.groupBy { it.role } // map -> id, list

    // groupingBy + eachCount
    val roleCount = users.groupingBy { it.role }.eachCount()

    println("GROUP:")
    println("Users by role: $usersByRole")
    println("Role count: $roleCount")
    println()



//       TRANSFORM COLLECTIONS

    // map → extract user names
    val userNames = users.map { it.name }

    println("TRANSFORM:")
    println("User names: $userNames")
    println()




//    FILTER COLLECTIONS

    // filter users older than 25
    val olderUsers = users.filter { it.age > 25 }

    // partition admins and non-admins
    val (admins, nonAdmins) = users.partition { it.role == "ADMIN" }

    println("FILTER:")
    println("Users age > 25: $olderUsers")
    println("Admins: $admins")
    println("Non-admins: $nonAdmins")
}