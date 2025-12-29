package threadingAndConcurrency

import kotlinx.coroutines.*
import java.io.IOException
import kotlin.coroutines.CoroutineContext


fun main() {
    runBlocking {

        println("Main starts")

        val launchJob = launch {
            coroutineWithTread(1, 500)
        }
        println(launchJob.isActive)
        delay(1000)
        val asyncJob = async(Dispatchers.Default){
            println("Async job")
            coroutineWithTread(2, 300)
            delay(1000)
            "This is a result"
        }
        val result = asyncJob.await()
        println(result)
        joinAll(
            launchJob,
        )

        withContext(Dispatchers.Default) {
            launchJob
        }

        launchJob.cancel()

        println("Main ends")
    }

}

suspend fun coroutineWithTread(number: Int, delay: Long) {

    println("Coroutine $number starts work on ${Thread.currentThread().name}")

    delay(delay)

    println("Coroutine $number has finished work on ${Thread.currentThread().name}")
}








// suspend function - a function that can pause, resume without blocking other functions in a thread