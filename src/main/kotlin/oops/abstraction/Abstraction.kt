package oops.abstraction


interface UserService {
    fun createUser(userName: String)
}


class UserServiceImpl : UserService {

    override fun createUser(userName: String) {
        println("User created with name: $userName")
    }

}


fun abstraction() {
    val userService: UserService = UserServiceImpl()

    userService.createUser("John")
}








// Abstraction - is the process of hiding complex internal details,
// operations and exposing what is essential operation to the user.
// It's all about where and how we are going to expose the logic.
// Abstraction can be achieved through 2 tools:
// 1. abstract class (partial)
// 2. interface (full abstraction)
// Why there is no class?
// We can hide the implementation with class. For ex:
// Class Payment{ void pay() { ... } }
// Class RazerPay extends Payment {}
// RazerPay razerPay = new RazerPay();
// 1. There is no definite rules for the child classes
// 2. On further update, if we want to extend child classes with Authentication, it is not possible
//Abstraction vs Encapsulation:
// Encapsulation -> Hiding sensitive data
// Abstraction - > Hiding internal logics/operations





// Abstraction - is the process of hiding complex internal details,
// operations and exposing what is essential operation to the user.
// It's all about where and how we are going to expose the logic.


// Abstraction can be achieved through 2 tools:
// 1. abstract class (partial)
// 2. interface (full abstraction)

// Why there is no class?
// We can hide the implementation with class. For ex:
// Class Payment{ void pay() { ... } }
// Class RazerPay extends Payment {}
// RazerPay razerPay = new RazerPay();

// 1. There is no definite rules for the child classes
// 2. On further update, if we want to extend child classes with Authentication, it is not possible

//Abstraction vs Encapsulation:
// Encapsulation -> Hiding sensitive data
// Abstraction - > Hiding internal logics/operations