package oops.classAndInstance

class Customer(name: String, val userEmail: String) {
    var userName: String = name
        get() = field.uppercase()
        set(value) {
            if (value.isNotBlank()) {
                field = value
            }
        }
}

fun classAndInstances() {
    val newUser = Customer("", "john@gmail.com")

    // getter
    println("=== Reading Customer Details ===")
    println("User Name  : ${newUser.userName}")
    println("User Email : ${newUser.userEmail}")

    println()
    println("=== Updating User Name ===")
    println("Setting userName to 'alex'")

    //setters
    newUser.userName = "alex"

    println()
    println("=== Reading Updated Details ===")
    println("User Name  : ${newUser.userName}")
    println("User Email : ${newUser.userEmail}")

}





















// class - blueprint / real world representation

// class name - unique name for the class.
// class header - constructors and parameters
// class body - contains properties and parameters


// constructor parameter -> cannot access outside class
// properties inside constructor and inside have auto generated getters and setters

// var -> getter & setter
// val -> getter only


// getters: no parameter is passed into this. use "field" to access the value. "field" is called backing field
// setters: can only take one parameter