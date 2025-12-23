package datatypes.classesTypes

abstract class PaymentProcessor() {

    abstract val paymentType: String?
    abstract fun pay(amount: Double)
    fun printPaymentDetails() {
        println("Payment Details")
        println("Payment Type : ${paymentType ?: "N/A"}")
    }
}

class UPIPaymentProcessor() : PaymentProcessor() {
    override val paymentType: String = "UPI"
    override fun pay(amount: Double) {
        println("Payment Process")
        println("Paying $amount...")
    }
}

fun abstractClass() {

    val paymentProcessor = UPIPaymentProcessor()

    paymentProcessor.printPaymentDetails()
    println()
    paymentProcessor.pay(200.0)

}

// abstract class

// to achieve partial abstraction


// cannot:
// cannot have instances
// cannot have abstract fields in constructor

// can:
// have constructor
// have init block
// have both concrete and abstract methods
// fields can be abstract
// inherit interface, abstract class, concrete class

// properties:
// open by default
// can have constructor
// concrete methods are final by default


//memory
// stored in method area

