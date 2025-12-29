package basics

import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main() {
    var counter = 0
    val noOfThreads = 1_000_000

    val time = measureTimeMillis {
        for (i in 1..noOfThreads) {
            thread {
                counter += i
            }
        }
    }

    println("Created $noOfThreads of threads in ${time}ms.")

}