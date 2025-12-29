package basics.advantages

class User {
    // Late initialization (non-null, initialized later)
    lateinit var userName: String

    // Nullable property
    var coupon: String? = null
}

fun nullHandling() {

    val user = User()

//    println("Username: ${user.userName}")

    // late init (Late initialization)
    user.userName = "John"
    println("Username: ${user.userName}")

    // Nullable value (?)
    user.coupon = null

    // Safe call (?.)
    println("Coupon length (safe call): ${user.coupon?.length}")

    // Default value (Elvis ?:)
    val defaultLength = user.coupon?.length ?: 0
    println("Coupon length with default: $defaultLength")

    // Execute only if not null (let)
    user.coupon?.let {
        println("Coupon applied: $it")
    } ?: println("Coupon not available")

    // Elvis + run block
    val len = 10
    val computedLength: Int = user.coupon?.length ?: run {
        println("Coupon is null, executing fallback logic")
        len * 10
    }
    println("Computed length: $computedLength")


    // 100% sure non-null (!!)
    try {
        val forcedLength = user.coupon!!.length
        println("Forced coupon length: $forcedLength")
    } catch (e: NullPointerException) {
        println("NPE occurred due to !! operator")
    }
}






// Core -> crashes at runtime (java)
//        -> errors at compile time (kotlin)


//variable -> not null - compile time error if null
//         -> nullable - must handle the null