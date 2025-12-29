import basics.advantages.nullHandling
import basics.controlflow.conditionalFlow
import basics.controlflow.loops
import basics.exceptionHandling
import basics.methods.functions
import basics.methods.lambdaFun
import basics.methods.scopeFunctions
import basics.methods.tailrecFunction
import basics.methods.varargs
import datatypes.dataTypes
import basics.variables
import datatypes.arrays
import datatypes.classesTypes.abstractClass
import datatypes.classesTypes.companionObjectClass
import datatypes.collections.collections
import datatypes.generic
import oops.classAndInstance.classAndInstances
import oops.classAndInstance.constructors
import datatypes.classesTypes.dataClass
import datatypes.classesTypes.enumClass
import datatypes.classesTypes.inlineClass
import datatypes.classesTypes.interfaceClass
import datatypes.classesTypes.nestedAndInnerClass
import datatypes.classesTypes.objectClass
import datatypes.classesTypes.sealedClass
import datatypes.collections.collectionSpecificFunctions
import oops.abstraction.abstraction
import oops.classAndInstance.accessSpecifiers
import oops.delegation.classDelegation
import oops.delegation.propertiesDelegation
import oops.encapuslation.encapsulation
import oops.inheritance.inheritance
import oops.polymorphism.polymorphism


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
    println("9. Exception Handling")
    println("10. Null handling")
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
        9 -> exceptionHandling()
        10 -> nullHandling()
        0 -> return
        else -> println("Invalid choice")
    }
    println("\n")
}

fun showDataTypes() {
    fun showClassTypes() {
        while (true) {
            println("1. Data Class")
            println("2. Object Class")
            println("3. Abstract Class")
            println("4. Interface ")
            println("5. Sealed Class")
            println("6. Enum Class")
            println("7. Companion Object")
            println("8. Nested and Sealed class")
            println("9. Inline class")
            println("0. Back")
            print("Enter your choice: ")
            val choice: Int? = readln().toIntOrNull()
            println("\n")
            when (choice) {
                1 -> dataClass()
                2 -> objectClass()
                3 -> abstractClass()
                4 -> interfaceClass()
                5 -> sealedClass()
                6 -> enumClass()
                7 -> companionObjectClass()
                8 -> nestedAndInnerClass()
                9 -> inlineClass()
                0 -> return
                else -> println("Invalid choice")
            }
            println("\n")
        }
    }
    println("1. Datatypes")
    println("2. Arrays")
    println("3. Collections")
    println("4. Collection specific functions")
    println("5. Generics")
    println("6. Class Types")
    println("0. Back")
    print("Enter your choice: ")
    val choice: Int? = readln().toIntOrNull()
    println("\n")
    when (choice) {
        1 -> dataTypes()
        2 -> arrays()
        3 -> collections()
        4 -> collectionSpecificFunctions()
        5 -> generic()
        6 -> showClassTypes()
        0 -> return
        else -> println("Invalid choice")
    }
    println("\n")
}

fun showOOPs() {

    println("1. Class and instances")
    println("2. Constructors")
    println("3. Access specifiers")
    println("4. Encapsulation")
    println("5. Abstraction")
    println("6. Inheritance")
    println("7. Polymorphism")
    println("8. Class Delegation")
    println("9. Property Delegation")
    print("Enter your choice: ")
    val choice: Int? = readln().toIntOrNull()
    println("\n")
    when (choice) {
        1 -> classAndInstances()
        2 -> constructors()
        3 -> accessSpecifiers()
        4 -> encapsulation()
        5 -> abstraction()
        6 -> inheritance()
        7 -> polymorphism()
        8 -> classDelegation()
        9 -> propertiesDelegation()
        else -> println("Invalid choice")
    }
    println("\n")

}