package oops.classAndInstance


class User(name: String, val userAge: Int) {

    val userName: String = name
         get() {
            return field.uppercase()
        }

    init {
        // runs after primary constructor
        println("Init block is called")
    }

    constructor(name: String) : this(name, 21) {
        println("secondary constructor is called")
    }

}

fun constructors() {

    println("=== Creating user with primary constructor ===")
    val user1 = User("john", 10)
    println("User Name : ${user1.userName}")
    println("User Age  : ${user1.userAge}")

    println()
    println("=== Creating user with secondary constructor ===")
    val user2 = User("alex")
    println("User Name : ${user2.userName}")
    println("User Age  : ${user2.userAge}")
}

// constructors - used for initializing values

// primary constructor - should be only one
//                     - constructor keyword is optional
//                     - constructor keyword is used only used with access specifiers and annotations

// secondary constructor - multiple constructor is allowed
//                      - must be delegated to primary constructor

// init block - primary constructor cannot contain logic
//            - exist only if we have primary constructor
//            - runs after primary constructor
//            - runs everytime instance is created
//            - used for validation
//            - multiple init block is allowed, run top to bottom order