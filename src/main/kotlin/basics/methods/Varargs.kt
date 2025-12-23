package basics.methods


fun something(vararg temp: Int) {
    for (i in temp) {
        println(i)
    }
}

fun createUser(userName: String, vararg permissions: String) {
    println("User created with username: $userName")
    println("Permissions: ")
    for (permission in permissions) {
        print(permission)
    }
}

fun logMessages(vararg messages: String) {
    for(message in messages) {
        println("Logging message: $message")
    }
}

fun varargs() {

    logMessages()
    logMessages("App starts")
    logMessages("App starts", "Fetching data from servers", "Loading user essentials")


    //with other parameters
    val adminPermissions: Array<String> = arrayOf("READ", "WRITE", "DELETE")
//    val adminPermissions: List<String> = listOf("READ", "WRITE", "DELETE")

    // spread operator
    createUser("user", *adminPermissions)

    // var args expects primitive array - intArray
    val ii: Array<Int> = arrayOf(1, 2, 3)
    something(*ii.toIntArray())
}


//

// one varargs per method
// it should be last parameters


