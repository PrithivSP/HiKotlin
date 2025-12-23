package datatypes

fun collections(){

    //no int list
    val roles: List<String> = listOf("ADMIN", "EDITOR", "VIEWER") // given size

    println("List of roles: $roles")

    val userRoles: MutableList<String> = mutableListOf("VIEWER") // default 10
    println("Mutable list of user roles (before): $userRoles")
    userRoles.add("EDITOR")
    println("Mutable list of user roles (after): $userRoles")

    val order: Set<String> = setOf("Ramen", "Dosa", "Dosa")
    println("Set (no duplicates): $order")

    val employeeLoginStatus: Map<String, Boolean> = mapOf(
        "EMP001" to true,
        "EMP002" to false,
        "EMP003" to true,
        "EMP003" to false // duplicate key
    )

    println("Employee login status: $employeeLoginStatus")

    //deque
    val deque = ArrayDeque(roles)

    deque.addLast("An element")
    deque.addFirst("Added first")

    println("First element  : ${deque.first()}")
    println("Last element   : ${deque.last()}")

    println("Deque contents : $deque")

}


// mutable list - default size 10

// mutable set - default size 16

// mutable map - default size 16