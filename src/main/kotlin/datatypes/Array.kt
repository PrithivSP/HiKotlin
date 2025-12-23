package datatypes

fun arrays() {

    val bookingId: Array<String> = Array(3) { index -> "b$index" }
    println("Array of booking id using constructor: ${bookingId.joinToString()}")

    //array size is fixed
    var userId: Array<String> = arrayOf("u1", "u2", "u3")
    userId[1] = "u3"

    println("Array of user ids: ${userId.joinToString()}")
    println("address of user ids before: $userId")
    userId += "dsf"
    println("address of user ids changed: $userId")

//    println(userId::class.simpleName)

    //nested array
    val twoDArray: Array<BooleanArray> = Array(3) { BooleanArray(3) { true } }
    println("Multi dimensional array: ${twoDArray.joinToString()}")
}










// Array<Int> -> Integer class
// BooleanArray -> boolean (primitive)