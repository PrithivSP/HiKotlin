package threadingAndConcurrency

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun joinVsJoinAll() {


//    thread join
    val dbThread = Thread {
        println("Thread → Initializing Database on ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("Thread → Database initialized")
    }

    val cacheThread = Thread {
        println("Thread → Initializing Cache on ${Thread.currentThread().name}")
        Thread.sleep(1500)
        println("Thread → Cache initialized")
    }

    dbThread.start()
    cacheThread.start()

    // blocks main thread
    dbThread.join()
    cacheThread.join()

    println()
    println("All thread tasks completed\n")


//    coroutines join all

    runBlocking {

        val cacheJob = launch {
            println("Coroutine → Loading cache on ${Thread.currentThread().name}")
            delay(1000)
            println("Coroutine → Cache loaded")
        }

        val apiJob = launch {
            println("Coroutine → Working API on ${Thread.currentThread().name}")
            delay(1500)
            println("Coroutine → API ready")
        }

        // suspends coroutine (does NOT block thread)
        joinAll(cacheJob, apiJob)
    }

    println()
    println("\nAll Coroutines tasks completed")
}



// join() - blocks the caller until the thread is executed
// when called, the caller state is changed to WAITING
// jvm keeps checking thread.isAlive == false