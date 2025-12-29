package datatypes.classesTypes

@JvmInline
value class UserId(val value: String) {
}


@JvmInline
value class OrderId(val value: String)

fun sendUserId(id: UserId) {
    println("Sending user id: ${id.value}")
}

fun sendOrderId(id: OrderId) {
    println("Sending order id: ${id.value}")
}

fun inlineClass() {
    val userId = UserId("U101")
    val orderId = OrderId("O500")

    sendUserId(userId)
    sendOrderId(orderId)

    // sendUserId(orderId) // compile-time error
    // sendOrderId(userId) //compile-time error
}










// acts as a wrapper class to ensure type safety

// for compiler user id, order id is same String


// important:
// can have only one field


// memory:
// no GC
