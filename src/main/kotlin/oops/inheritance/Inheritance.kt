package oops.inheritance

interface FileLogger {

    fun format(message: String): String {
        return "[FILE] $message"
    }

    fun log(message: String) {
        println(format(message))
    }
}

interface ConsoleLogger {

    fun log(message: String) {
        println("[CONSOLE] $message")
    }
}


open class ApplicationLogger : FileLogger, ConsoleLogger {

    override fun log(message: String) {
        println("ApplicationLogger started")
        println()
        // diamond
        super<FileLogger>.log(message)
        super<ConsoleLogger>.log(message)

        println("ApplicationLogger finished")
    }
}


class SecurityLogger : ApplicationLogger() {

    override fun log(message: String) {
        println("SecurityLogger started")

        super.log("[SECURITY] $message")
        println()
        println("SecurityLogger finished")
    }
}


fun inheritance() {

    val appLogger = ApplicationLogger()
    appLogger.log("Application initialized")

    println()

    val securityLogger = SecurityLogger()
    securityLogger.log("Unauthorized access attempt detected")
}




















// Inheritance - IS A relationship

// resue the parent class properties and implementation

// open:
// parent class must explicitly use open keyword
// final by default

// methods are final by default
// to override use open keyword

// cannot inherit more than 1 class
// can inherit multiple interfaces