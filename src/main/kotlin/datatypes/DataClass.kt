package datatypes

import java.time.LocalDateTime

data class BookingDisplay(
    val booking: String,
    var theater: String,
    val screen: String,
    val movie: String,
    val show: String,
    val showDate: String,
    val showTime: String
) {
    var price: Double = 0.0

    constructor(
        booking: String,
        theater: String,
        screen: String,
        movie: String,
        show: String,
        showDate: String,
        showTime: String,
        price: Double
    ) : this(booking, theater, screen, movie, show, showDate, showTime) {
        this.price = price
    }

//    override fun toString(): String {
//        return """
//        Booking ID : $booking
//        Theater    : $theater
//        Screen     : $screen
//        Movie      : $movie
//        Show       : $show
//        Show Date  : $showDate
//        Show Time  : $showTime
//        Price      : ₹$price
//    """.trimIndent()
//    }
}

fun dataClass() {

    println("=== Data Class ===")

    val bookingDisplay1 = BookingDisplay(
        "b1",
        "PVR",
        "Screen 1",
        "Aromaley",
        "s1",
        LocalDateTime.now().toLocalDate().toString(),
        "5 PM",
        100.0
    )

    val bookingDisplay2 = BookingDisplay(
        "b1",
        "PVR",
        "Screen 1",
        "Aromaley",
        "s1",
        LocalDateTime.now().toLocalDate().toString(),
        "5 PM",
        200.0
    )

    println()
    println("=== toString() Output ===")
    println("BookingDisplay 1 : $bookingDisplay1")
    println("BookingDisplay 2 : $bookingDisplay2")

    println()
    println("=== equals() | == Comparison ===")
    println("bookingDisplay1 == bookingDisplay2 : ${bookingDisplay1 == bookingDisplay2}")

    println()
    println("=== hashCode() Values ===")
    println("bookingDisplay1.hashCode() : ${bookingDisplay1.hashCode()}")
    println("bookingDisplay2.hashCode() : ${bookingDisplay2.hashCode()}")

    println()
    println("=== copy() - no mutation ===")
    val bookingDisplay3 = bookingDisplay1.copy()
    println("Before modification:")
    println("Original : $bookingDisplay1")
    println("Copy     : $bookingDisplay3")

    bookingDisplay3.theater = "Phoenix"

    println()
    println("After modifying copy (theater = Phoenix):")
    println("Original : $bookingDisplay1")
    println("Copy     : $bookingDisplay3")

    println()
    println("=== componentN() | Destructuring Example ===")


    val (
        bookingId,
        theaterName,
        screenName,
        movieName,
        _,
        showDate,
        showTime
    ) = bookingDisplay1



    println("Booking ID  : $bookingId")
    println("Theater     : $theaterName")
    println("Screen      : $screenName")
    println("Movie       : $movieName")
    println("Show Date   : $showDate")
    println("Show Time   : $showTime")
}



//data class - used to hold data

//equals()
//hashCode()
//toString()
//copy logic

//componentN()