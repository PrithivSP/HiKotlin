package basics

const val requestCode = 100

class Request {

//    const val requestCode = 100

    val port: String = "8080"
    val requestedTime: Long = System.currentTimeMillis()

}

fun variables() {

    val request: Request = Request()

//    request = Request()
//    request.port = 8080

    println("Port running at: ${request.port}")
    println("Requested Time (calculated at run time): ${request.requestedTime}")

    var noOfAttempts: Int = 10
    println("var variables can be changed (before): $noOfAttempts")
    noOfAttempts++
    println("var variables can be changed (after): $noOfAttempts")
    println(noOfAttempts)
}





//var -> can be modifier
//val -> cannot be modifier once initialized
//
//const -> compile time constant (only used with var)
//      -> allowed only in top level, named object, companion objects