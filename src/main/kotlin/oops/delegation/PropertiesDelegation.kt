package oops.delegation

import kotlin.properties.Delegates


class UserService(url: String) {

    var databaseUrl: String by Delegates.vetoable(url) { property, oldValue, newValue ->
        if(newValue.isNotBlank()) {
            println("Vetoable → ${property.name} changed from '$oldValue' to '$newValue'")
            true
        } else {
            println("Vetoable → Invalid URL rejected")
            false
        }
    }

    var connectionState: String by Delegates.observable("DISCONNECTED") { property, oldValue, newValue ->
        println(property)
        println("Observable → ${property.name} changed from '$oldValue' to '$newValue'")
    }

    val databaseConnection: String by lazy {

        // database connection functions
        println("Connecting to database with url: $databaseUrl")
        connectionState = "CONNECTED"
        "Database connected to $databaseUrl"
    }

    var databaseStorageConnectionTimeout: Int by Delegates.notNull()
}


fun propertiesDelegation() {
    val userService = UserService("localhost: 3000")

    println("Database connection status: ${userService.databaseConnection}")

    userService.databaseUrl = ""
    userService.databaseUrl = "localhost: 4000"


    println("Database connection status: ${userService.databaseConnection}")
}






// vetoable is not called during constrcutor initialization