package threadingAndConcurrency

fun threadFunctions() {

    val downloadSource = Thread {

        println("Thread name: ${Thread.currentThread().name}")
        println("Thread state: ${Thread.currentThread().state}")

        try {

            println("Downloading resources...")
            Thread.sleep(5000)
            println("Downloaded resources...")

        } catch (e: Exception) {

            println("Exception caught: ${e.message}")

        }

        println("Thread interrupted: ${Thread.currentThread().isInterrupted}")
    }


    println("Before start state: ${downloadSource.state}")
    println()
    println("---Starting thread---")

    downloadSource.start() // start

    Thread.sleep(2000)

    println("Current thread is Alive: ${downloadSource.isAlive}")


    downloadSource.interrupt() // interrupt

    downloadSource.join() // join


    println("Current thread is Alive: ${downloadSource.isAlive}")
    println("After start state: ${downloadSource.state}")
}







// join() - blocks the caller until the thread is executed
// when called, the caller state is changed to WAITING
// jvm keeps checking thread.isAlive == false