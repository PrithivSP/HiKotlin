package datatypes.classesTypes

interface LoggingManager {
    val loggerType: String?
    fun log(message: String)
    fun start() {
        println("Logger Type : ${loggerType ?: "N/A"}")
        println("Status      : Started")
    }
}

class TerminalLogger(override val loggerType: String) : LoggingManager {
    override fun log(message: String) {
        println("[$loggerType] $message")
    }
}

fun interfaceClass() {
    val terminalLogger: LoggingManager = TerminalLogger("Terminal")
    // default method
    terminalLogger.start()

    // overridden method
    terminalLogger.log("Application initialized")
    terminalLogger.log("Loading sources...")
    terminalLogger.log("Loading successful")
}






// interface - to achieve full abstraction

// to achieve loose coupling
// for multiple inheritance

// cannot:
// cannot have constructor
// cannot have init block
// cannot have states

// can:
// have default method
// child class can override default methods

// properties:
// fields, methods are default by abstract

// memory:
// interface is stored in method area
// default methods are copied into implementing class