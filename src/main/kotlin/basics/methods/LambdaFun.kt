package basics.methods


//fun calculateTaxForBooking(price: Double) : Double {
//    return price * (18/100)
//}

fun loginTracker(): (Boolean) -> Unit {

    var failedAttempts = 0

    return { success ->
        if (!success) {
            failedAttempts++
            println("Login failed. Attempts: $failedAttempts")
        } else {
            println("Login successful")
        }
    }
}

fun calculateTotalPrice(ogPrice: Double, taxCalculator: (Double) -> Double): Double {
    return ogPrice + taxCalculator(ogPrice)
}

fun lambdaFun() {

    val calculateTaxForBooking = { price: Double ->
        price * 18 / 100.0
    }

   println(calculateTotalPrice(100.0, calculateTaxForBooking))

    //closure

    var taxPrice = 18

    val taxPriceCalculator = { price: Int ->
        price * taxPrice / 100
    }

    println(taxPriceCalculator(250))
    println(taxPriceCalculator(300))

    val loginTack = loginTracker()

    loginTack(false)
    loginTack(false)
    loginTack(false)
    loginTack(false)
    loginTack(true)
}












//the closure variables  - stored in lambda object fields (inside heap)