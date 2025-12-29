package oops.polymorphism

interface OrderService {

    fun placeOrder(orderId: String)

    // Compile-time polymorphism - overloading
    fun placeOrder(orderId: String, priority: Int)
}

class OnlineOrderService() : OrderService {

    // Runtime polymorphism - over-riding
    override fun placeOrder(orderId: String) {
        println("Placing ONLINE order with ID: $orderId")
    }

    override fun placeOrder(orderId: String, priority: Int) {
        println("Placing ONLINE order with ID: $orderId | Priority: $priority")
    }
}



fun polymorphism() {
    val onlineOrderService = OnlineOrderService();
    onlineOrderService.placeOrder("O123")
    onlineOrderService.placeOrder("O124", 1)
}