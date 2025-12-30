package oops.classAndInstance

//              constructor         constructor parameter
class Theater(var theaterId: String, name: String) {

    var theaterName: String = name

    var screens: List<String> = listOf() // direct declaration and initialization

    var theaterCity: String

    //init
    init {
        theaterCity = ""
    }

    lateinit var theaterAddress: String

    constructor(theaterId: String, theaterName: String, theaterAddress: String): this(theaterId, theaterName) {
        this.theaterAddress = theaterAddress
    }

    // late init
    lateinit var theaterBooking: List<String>

    // computational variable
    val screenSize: Int
        get() = screens.size

}

fun fieldInitializationTypes() {

    val newTheater: Theater = Theater("1", "PVR")

    // late init
    // apply function
    newTheater.apply {
        theaterBooking = listOf()
    }

}








//1. direct initialize
//2. constructor
//3. constructor parameter
//4. secondary constructor with late init
//5. late init (also apply function)
//6. init block
//7. computational variable
//8. delegate lazy