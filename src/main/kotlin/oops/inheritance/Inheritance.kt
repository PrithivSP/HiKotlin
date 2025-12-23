package oops.inheritance

open class Logger {
    val message: String
    fun log() {

    }

    constructor(message: String) {
        this.message = message
    }
}

class TerminalLogger : Logger {
    constructor(message: String) : super("upper") {

    }
}

fun inheritance() {
//    ter TerminalLogger
}