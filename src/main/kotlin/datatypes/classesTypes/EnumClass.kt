package datatypes.classesTypes


enum class BookingStatus() {
    BOOKED,
    CANCELLED;

    // method
    fun getCode(): Int {
        return this.ordinal
    }
}


fun enumClass() {
    val currentBookingStatus = BookingStatus.CANCELLED

    println("Current Booking status: $currentBookingStatus")

    when (currentBookingStatus) {
        BookingStatus.BOOKED -> println("Ticket is confirmed")
        BookingStatus.CANCELLED -> println("Booking is cancelled")
    }

    println("Ordinal for current Booking: ${currentBookingStatus.getCode()}")

}


// enum - defined constants with fields and methods


// cannot:
// cannot inherit from another class (enums already extend Enum)
// cannot create instances using constructor (no BookingStatus())
// cannot extend enum constants outside the enum body
// cannot have different inheritance hierarchies per constant
// cannot be open or sealed
// cannot use generics
// cannot have abstract state (only abstract functions allowed)

//can:
// can inherit interface
// use when exhaustively without else
// implement interfaces

// properties
// constructor parameters become properties
// while used with when and implemented all cases - no else branch due to exhaustiveness (because compiler knows all constants)


// sealed vs enum
// choose enum when
// if each type has different fields
// if each type has different behaviour
// if instances carry runtime data


// memory:
// enum metadata is stored in method area
// enum constants lives in heap
// exactly one instance per constant
// created during at class loading
