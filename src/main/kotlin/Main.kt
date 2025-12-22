import basics.controlflow.conditionalFlow
import basics.controlflow.loops
import basics.methods.functions
import basics.methods.varargs
import datatypes.dataTypes
import basics.variables
import datatypes.arrays
import datatypes.collections

fun main() {
    while (true) {
        println("1. Basic")
        println("2. Datatypes")
        println("0. Exit")
        print("Enter your choice: ")
        val choice: Int? = readln().toIntOrNull()
        println("\n")

        when(choice) {
            1 -> showBasic()
            2 -> showDataTypes()
            0 -> break;
            else -> println("Invalid choice")
        }
    }
    println("\n")

//    val nullPointerHandling: NullPointerHandling = NullPointerHandling()
//    nullPointerHandling.main()
}

fun showBasic() {
    println("1. Variables")
    println("2. Conditional flow")
    println("3. Loops")
    println("4. Functions")
    println("5. Var args")
    println("0. Back")
    print("Enter your choice: ")
    val choice: Int? = readln().toIntOrNull()
    println("\n")
    when(choice) {
        1 -> variables()
        2 -> conditionalFlow()
        3 -> loops()
        4 -> functions()
        5 -> varargs()
        0 -> return
        else -> println("Invalid choice")
    }
    println("\n")
}

fun showDataTypes() {
    println("1. Datatypes")
    println("2. Arrays")
    println("3. Collections")
    println("0. Back")
    print("Enter your choice: ")
    val choice: Int? = readln().toIntOrNull()
    println("\n")
    when(choice) {
        1 -> dataTypes()
        2 -> arrays()
        3 -> collections()
        0 -> return
        else -> println("Invalid choice")
    }
    println("\n")
}