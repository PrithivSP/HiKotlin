package threadingAndConcurrency

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun calculateMemory(): Long{
    val runtime = Runtime.getRuntime();
    return (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024)
}

fun coroutineMemoryUsage() {
    System.gc()

    println("Memory at start: ${calculateMemory()} MB\n")

    for(i in 1..100) {
        val newThread = Thread {
            Thread.sleep(10)
        }
        newThread.start()
        newThread.join()
    }

    println("Memory at end: ${calculateMemory()} MB\n")

    System.gc()
    println("Memory at start: ${calculateMemory()} MB\n")
    runBlocking {
        repeat(100) {
            launch(Dispatchers.IO) {
                delay(10)
            }.join()
        }
    }

    println("Memory at end: ${calculateMemory()} MB\n")
}