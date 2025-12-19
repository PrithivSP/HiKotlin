import basics.advantages.NullPointerHandling
import datatypes.dataTypes
import basics.variables
import datatypes.arrays
import datatypes.collections

fun main() {
    println("1. Basic")
    println("2. Datatypes")
    print("Enter your choice: ")
    val choice: Int? = readln().toIntOrNull()
    println("\n")

    when(choice) {
        1 -> showBasic()
        2 -> showDataTypes()
        else -> println("Invalid choice")
    }

    val nullPointerHandling: NullPointerHandling = NullPointerHandling()
    nullPointerHandling.main()
}

fun showBasic() {
    println("1. Variables")
    print("Enter your choice: ")
    val choice: Int? = readln().toIntOrNull()
    println("\n")
    when(choice) {
        1 -> variables()
        else -> println("Invalid choice")
    }
}

fun showDataTypes() {
    println("1. Datatypes")
    println("2. Arrays")
    println("3. Collections")
    print("Enter your choice: ")
    val choice: Int? = readln().toIntOrNull()
    println("\n")
    when(choice) {
        1 -> dataTypes()
        2 -> arrays()
        3 -> collections()
        else -> println("Invalid choice")
    }
}