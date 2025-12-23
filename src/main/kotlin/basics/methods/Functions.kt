package basics.methods

import java.time.LocalDateTime


fun constructPrintable(name: String, age: Int): String {
    return "$name is $age years old"
}

fun isAdult(age: Int) = age >= 18

fun createUserId(name: String, annotate: String = "@icici") = name + annotate

fun processRefund(amount: Int) {

    fun isValid(): Boolean {
        return amount > 0
    }

    if (isValid()) {
        println("Refund processed for amount $amount")
    } else {
        println("Invalid refund amount")
    }
}

fun execute(
    name: String,
    age: Int = 21,
    formatter: (String, Int) -> String
) {
    // check auth
    println("Start printing user")
    println(formatter(name, age))
    println("End printing user")
    // cleanup
}


inline fun measureExecution(block: () -> Unit) {
    val start = LocalDateTime.now().second
    block()
    val end = LocalDateTime.now().second
    println("Execution time: ${end - start} ms")
}



fun retryLogin(attempts: Int) {
    if (attempts == 0) {
        println("No attempts left")
        return
    }
    println("Retrying login, attempts left: $attempts")
    retryLogin(attempts - 1)
}

//fun retryLogin(attempts: Int) {
//    var a = attempts
//    while (a > 0) {
//        println("TRetrying login, attempts left")
//        a--
//    }
//}


fun String.isValidBookingId(): Boolean {
    return startsWith("B") && length > 3
}


fun <T> logValue(value: T) {
    println("Logged value: $value")
}


// ANONYMOUS FUNCTION
// Exists for explicit return control
val nameValidator = fun(name: String): Boolean {
    if (name.isBlank()) return false
    return name.length > 2
}

infix fun Int.isWithin(limit: Int): Boolean {
    return this <= limit
}



fun functions() {

    println("NORMAL FUNCTION")
    println(constructPrintable("John", 25))
    println()

    println("EXPRESSION FUNCTION")
    println("Is adult: ${isAdult(17)}")
    println()

    println("DEFAULT PARAMETER FUNCTION")
    println("User ID: ${createUserId("John", "@kvb")}")
    println()

    println("LOCAL FUNCTION")
    processRefund(500)
    processRefund(-50)
    println()


    println("HIGHER ORDER FUNCTION")
    execute("Holly", 28, ::constructPrintable)
    execute("Steve", 30) { name, age ->
        "$name aged $age (formatted by lambda)"
    }
    println()

    println("INLINE FUNCTION")
    measureExecution {

    }
    println()

    println("TAIL RECURSIVE FUNCTION")
    retryLogin(10000)
    println()

    println("EXTENSION FUNCTION")
    println("B123 valid: ${"B123".isValidBookingId()}")
    println()

    println("GENERIC FUNCTION")
    logValue(100)
    logValue("Booking successful")
    println()

    println("ANONYMOUS FUNCTION")
    println("Valid name: ${nameValidator("Kotlin")}")
    println()

    var totalLogins = 0

    val add = { x: Int ->
        totalLogins += x
    }

    add(1)
    add(1)

    println(totalLogins)

    if(12 isWithin 100) {
        println("12 is within 100")
    }


}



//1. normal functions - reduce business logic in app
//                  - logic is reused
//                  - no repeatability

//2. expression functions - to remove noise
//                      - no branching

//3. default parameter function - one function many use case

//4. local functions - some logic should not escape
//                 - if valid amount is visible everywhere (wrong)

//5. hof - to control the flow not logic
//        checkAuth()
//        println("Action")
//        cleanup()

//        checkAuth()
//        sendEmail()
//        cleanup()
// becomes:
//         -> fun secure(action: () -> Unit) {
//                      checkAuth()
//                       action()
//                       cleanup()
//               }


//6. lambdas - logic is used once
//        - no extra code
//        - logic stays near usage


//7. inline functions - because hof create function objects -> more memory
//                 -  no object
//                 -  performance optimised
//                 - just copy the code and replace there
//                 -  but if we use normal function - a function call, stack frame creation, jump to another memory location

//8. extension functions - utility feels separate
//                     - Utils.isValidEmail(email) wrong
//                     - email.isValidEmail() correct

//9. operation functions - override operators

//10. tailing(tail rec) function - means the recursion happens at last, after the recursion call nothing happens
//                              - if a recursion is safe, convert it into loop
//                              - no stack growth
//                              - no stack overflow error
//                              - why not loop then? sometimes recursion is clearer and easier to read

//11. operator function

//12. anonymous function -  better control with return type. lambdas cannot have return type directly (used with labels)

// 13. infix functions - rules: should be member function or extension function,
//                              should have only one parameter,
//                              no varargs,
//                              no default values
