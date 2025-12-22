package basics.advantages

class User() {
    val userName: String = "";
    val coupon: String? = null;
}

class NullPointerHandling {
    fun main() {
        val user: User = User();
        val len: Int = 10;
        val length: Int = user.coupon?.length ?: run {
            len * 10;
        }
        println(user.coupon?.length ?: 0);
        println(length);
    }
}














// Core -> crashes at runtime (java)
//        -> errors at compile time (kotlin)


//variable -> not null - compile time error if null
//         -> nullable - must handle the null

