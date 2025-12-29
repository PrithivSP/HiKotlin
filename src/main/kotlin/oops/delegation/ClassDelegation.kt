package oops.delegation

interface PaymentService {
    fun pay(amount: Double)
}


class PaymentServiceImp(): PaymentService {
    override fun pay(amount: Double) {
        println("Initializing Payment Service")
        println("Payment done: $amount")
    }
}


class BookingPayment(paymentService: PaymentService) {

    val paymentService: PaymentService = paymentService

    fun pay(amount: Double) {

        paymentService.pay(amount)
    }

}

//class BookingPayment(paymentService: PaymentService): PaymentService by paymentService


fun classDelegation() {
    val bookingPayment: BookingPayment = BookingPayment(PaymentServiceImp())
    bookingPayment.pay(100.0)
}






// Delegation - forwarding responsibility to other class to do a work