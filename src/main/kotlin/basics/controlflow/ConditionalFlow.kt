package basics.controlflow

fun conditionalFlow() {
    val role: String = "USER"

    val accessLevel: String = if(role == "ADMIN") "FULL_ACCESS" else if(role == "USER") "LIMITED_ACCESS"  else "NO_ACCESS"

    val loginAttempts: Int = 2


    // without subject
    val securityRisk: String = when {
        loginAttempts == 0 -> "NONE"
        loginAttempts < 3 -> "LOW"
        loginAttempts < 7 -> "MEDIUM"

        //do not run
        loginAttempts < 7 -> "HIGH"
        else -> "RISKY"
    }

    //guard
//    when(securityRisk) {
//        is String if securityRisk.length > 10 -> println("Security risk variable is a string with more than 10 chars")
//        is Int-> println("Security risk variable is a Int")
//        //optional
//        else -> println("Security risk variable is neither String or Int")
//    }

}





// when -> alternative for if else

//1. reduces nesting
//2. clear readability
//3. can check multiple conditions

// with subject (1 -> something) and without subject (subject == 1 -> something) each branch is conditional
// need else in assignment
// no need for else when checking with enums (exhaustiveness)

// switch cannot do:
// check conditions
// check ranges
// use conditions


// guards:
// used with "if" after primary conditions - is String if securityRisk.length > 10
// cannot be used with multiple conditions (is Animal, is Dog)