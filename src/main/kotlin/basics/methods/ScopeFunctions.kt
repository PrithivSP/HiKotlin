package basics.methods

class UserAccount(
    var id: String,
    var name: String,
    var email: String?,
    var balance: Double,
    var isActive: Boolean
)

fun scopeFunctions() {
    val newUserAccount = UserAccount("U1", "John", "john@zoho.com", 0.0, false)

//    let
    val emailDomain = newUserAccount.email?.let {
        it.substringAfter("@")
    }

    println("User email domain: $emailDomain")

//    run
    val taxAmount = newUserAccount.run {
        this.balance * 0.18
    }

    println("User tax: $taxAmount")

//    with
    with(newUserAccount) {
        println("User id:       $id")
        println("User name:     $name")
        println("User email id: ${this.email}")
        println("User active:   ${this.isActive}")
    }

//    apply
    newUserAccount.apply {
        balance += 100
        isActive = true
    }.also { iterator ->
//    also
        println("Updated user account $iterator")
    }

}




//  Function	Object reference	Return value	        Use when

//  let	             it	            Lambda result	   Null checks, transformations
//  run	             this	        Lambda result	   Compute something from object
//  with	         this	        Lambda result	   Group operations (non-null object)
//  apply	         this	        Object itself	   Object configuration
//  also	         it	            Object itself	   Logging / side effects
