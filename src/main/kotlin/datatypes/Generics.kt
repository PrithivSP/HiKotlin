package datatypes

class Utils<T>(private val collection: List<T>) {

    fun findElement(el: T?): Pair<Int, T?> {
        for(index in collection.indices) {
            if(collection[index] == el) {
                return Pair(index, el)
            }
        }
        return Pair(-1, null)
    }

}

//lower bound
fun logItemsLowerBound(logs: MutableList<in Int>) { // contravariance
    logs.add(123)
}

//upper bound
//fun logItems(logs: MutableList<out Number>) - co variance
fun <T: Number> logItemsUpperBound(logs: MutableList<T>) {
    println(logs)
}


// star projection
fun printConsole(elements: List<*>) {
    println("Printing elements: ")
    for (element in elements) {
        println(element)
    }
}

fun generic() {

    val stringUtil = Utils(listOf("u1", "u2"))
    println("Element found: ${stringUtil.findElement("u2")}")

    val intUtil = Utils(listOf(250, 350, 500))
    println("Element found: ${intUtil.findElement(500)}")

    //upper bound
    logItemsUpperBound(mutableListOf(10))
    logItemsUpperBound(mutableListOf(10.1))

//    logItemsUpperBound(mutableListOf("Hello, it is a log"))

    //lower bound
    logItemsLowerBound(mutableListOf<Int>())
    logItemsLowerBound(mutableListOf<Number>())
    logItemsLowerBound(mutableListOf<Any>())

//    logItemsLowerBound((mutableListOf<String>()))


    printConsole(listOf(1, "2", 2.0, Unit))
}




// Upper bound (T : Number) - covariance
// - T and its children allowed
// - read safe
// - write restricted

//works with both producer

// Lower bound (in Int) - contravariance
// - Int and its parents allowed
// - write safe
// - read restricted (Any?)

//works with only consumer

// Star project (*)
// - if we want to pass a list with multiple datatypes we can use star projection
// - read only