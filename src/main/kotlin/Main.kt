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
import datatypes.classesTypes.abstractClass
import datatypes.collections
import datatypes.generic
import oops.classAndInstance.classAndInstances
import oops.classAndInstance.constructors
import datatypes.classesTypes.dataClass
//import datatypes.classesTypes.enumClass
import datatypes.classesTypes.interfaceClass
import datatypes.classesTypes.objectClass
import datatypes.classesTypes.sealedClass
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

        when (choice) {
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
    when (choice) {
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
    fun showClassTypes() {
        println("1. Data Class")
        println("2. Object Class")
        println("3. Abstract Class")
        println("4. Interface ")
        println("5. Sealed Class")
        println("6. Enum Class")
        print("Enter your choice: ")
        val choice: Int? = readln().toIntOrNull()
        println("\n")
        when (choice) {
            1 -> dataClass()
            2 -> objectClass()
            2 -> abstractClass()
            3 -> interfaceClass()
            4 -> sealedClass()
//            5 -> enumClass()
            else -> println("Invalid choice")
        }
        println("\n")
    }
    println("1. Datatypes")
    println("2. Arrays")
    println("3. Collections")
    println("4. Generics")
    println("5. Class Types")
    println("0. Back")
    print("Enter your choice: ")
    val choice: Int? = readln().toIntOrNull()
    println("\n")
    when (choice) {
        1 -> dataTypes()
        2 -> arrays()
        3 -> collections()
        4 -> generic()
        5 -> showClassTypes()
        0 -> return
        else -> println("Invalid choice")
    }
    println("\n")
}

fun showOOPs() {

    println("1. Class and instances")
    println("2. Constructors")
    println("4. Encapsulation")
    print("Enter your choice: ")
    val choice: Int? = readln().toIntOrNull()
    println("\n")
    when (choice) {
        1 -> classAndInstances()
        2 -> constructors()
        4 -> encapsulation()
        else -> println("Invalid choice")
    }
    println("\n")

}
