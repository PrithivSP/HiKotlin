package oops.classAndInstance


open class Order {
    var status: String = "CREATED"
        private set

    var priority: Int = 1
        internal set

    var amount: Double = 0.0
        protected set

    // private setter
    fun cancelOrder() {
        this.status = "CANCELLED"
    }
}

fun updatePriority(order: Order, priority: Int) {
    order.priority = priority
}

fun accessSpecifiers() {
    val order = Order()

//     order.status = "DONE"     // private setter
    println("Order status: " + order.status)        // getter


    order.priority = 2        // internal setter (blocked outside module)
    updatePriority(order,2)
    println("Order priority: " + order.priority)      // getter


//     order.amount = 500.0      // protected setter
    println("Order Price: " + order.amount)        // getter


    order.cancelOrder()          // controlled update
    println("Order status: " + order.status)
}


// getter must be same visibility than the variable

// setter must be same or more restrictive than the variable