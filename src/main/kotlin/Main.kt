import basics.controlflow.conditionalFlow
import basics.controlflow.loops
import basics.methods.functions
import basics.methods.lambdaFun
import basics.methods.scopeFunctions
import basics.methods.tailrecFunction
import basics.methods.varargs
import datatypes.dataTypes
import basics.variables
import datatypes.arrays
import datatypes.collections
import datatypes.generic
import oops.classAndInstance.classAndInstances
import oops.classAndInstance.constructors
import oops.encapuslation.encapsulation

fun main() {
    while (true) {
        println("1. Basic")
        println("2. Datatypes")
        println("3. OOPS")
        println("0. Exit")
        print("Enter your choice: ")
        val choice: Int? = readln().toIntOrNull()
        println("\n")

        when(choice) {
            1 -> showBasic()
            2 -> showDataTypes()
            3 -> showOOPs()
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
    println("5. Tail rec function")
    println("6. Lambda function")
    println("7. Var args")
    println("8. Scope functions")
    println("0. Back")
    print("Enter your choice: ")
    val choice: Int? = readln().toIntOrNull()
    println("\n")
    when(choice) {
        1 -> variables()
        2 -> conditionalFlow()
        3 -> loops()
        4 -> functions()
        5 -> tailrecFunction()
        6 -> lambdaFun()
        7 -> varargs()
        8 -> scopeFunctions()
        0 -> return
        else -> println("Invalid choice")
    }
    println("\n")
}

fun showDataTypes() {
    println("1. Datatypes")
    println("2. Arrays")
    println("3. Collections")
    println("4. Generics")
    println("0. Back")
    print("Enter your choice: ")
    val choice: Int? = readln().toIntOrNull()
    println("\n")
    when(choice) {
        1 -> dataTypes()
        2 -> arrays()
        3 -> collections()
        4 -> generic()
        0 -> return
        else -> println("Invalid choice")
    }
    println("\n")
}

fun showOOPs() {
    println("1. Class and instances")
    println("2. Constructors")
    println("3. Encapsulation")
    print("Enter your choice: ")
    val choice: Int? = readln().toIntOrNull()
    println("\n")
    when(choice) {
        1 -> classAndInstances()
        2 -> constructors()
        3 -> encapsulation()
    }
    println("\n")
}