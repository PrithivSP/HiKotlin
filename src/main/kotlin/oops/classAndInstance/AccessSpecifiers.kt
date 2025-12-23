package oops.classAndInstance

import javax.print.attribute.standard.JobPriority

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

fun main() {
    val order = Order()

//     order.status = "DONE"     // private setter
    println(order.status)        // getter allowed


    order.priority = 2        // internal setter (blocked outside module)
    updatePriority(order,2)
    println(order.priority)      // getter allowed


//     order.amount = 500.0      // protected setter
    println(order.amount)        // getter allowed


    order.cancelOrder()          // controlled update
}


// getter must be same visibility than the variable

// setter must be same or more restrictive than the variable