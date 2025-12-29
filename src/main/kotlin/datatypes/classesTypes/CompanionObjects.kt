package datatypes.classesTypes

class Order(val orderId: String, val amount: Double) {

    init {
        incrementCounter()
    }

    fun printOrderDetails() {
        println("Order ID    : $orderId")
        println("Amount      : $amount")
        println("Total Orders: ${getOrderCount()}")
    }

    companion object {

        private var orderCounter: Int = 0

        fun incrementCounter() {
            orderCounter++
        }

        fun getOrderCount(): Int {
            return orderCounter
        }

//        const val ORDER_TYPE = "ONLINE"
    }
}


fun companionObjectClass() {
    val order1 = Order("ORD-1", 500.0)
    order1.printOrderDetails()
    val order2 = Order("ORD-2", 1200.0)
    println()
    order2.printOrderDetails()

}





// companion object  to define a class level members (act as a single ton)

// important
// only one companion object is allowed per class
// can have fields, methods, init block


// cannot:
// access instance fields and methods


// can:
// can have const
// can have access specifiers
// instance methods can access methods inside companion object


// memory:
// metadata stored in method area
// singleton instance stored in heap
