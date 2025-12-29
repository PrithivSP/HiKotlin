package threadingAndConcurrency

import kotlinx.coroutines.delay
import java.util.concurrent.Executors
import kotlin.concurrent.thread

class Downloader: Thread() {
    override fun run() {
        println("Downloading files ...")
    }
}

class SpellCheck: Runnable {
    override fun run() {
        println("Checking spells ...")
    }
}

fun main() {
    println("Current thread: ${Thread.currentThread().name}")

    //1. thread class + lambda
    val downloadResources = Thread {
        println("Downloading resources...")
    }
    downloadResources.start()
    println("Resources downloaded successfully")

    Thread.sleep(1000)

    // runnable
    val task = Runnable {
        println("Task is running")
    }
    Thread(task).start()

    val executor = Executors.newFixedThreadPool(2)

    executor.execute {
        println("1. This is executed by Executor: ${Thread.currentThread().name}")
    }

    executor.execute {
        println("2. This is also executed by Executor: ${Thread.currentThread().name}")
    }

    executor.execute {
        println("3. This is executed by Executor: ${Thread.currentThread().name}")
    }

    executor.execute {
        println("4. This is executed by Executor: ${Thread.currentThread().name}}")
    }


    // callable
    val a = 10
    val incrementA1 = executor.submit<Int> {
        a + 10
    }

    val incrementA2 = executor.submit<Int> {
        a + 20
    }

    println("The result after two increment: ${incrementA1.get() + incrementA2.get()}")

    executor.shutdown()


//    val t = Thread(Runnable {
//        println("Downloading resources")
//    })
//    t.name = "Downloader"
//    t.isDaemon = false
//    t.start()

    val downloader = thread(name = "Downloader", isDaemon = false, start = false) {
        println("Downloading resources using thread() function: ${Thread.currentThread().name}")
    }

    downloader.start()
}








// 1. creating thread using lambda

// - convert the lambda to Runnable and pass that to Thread constructor
// - Thread {} - creates new Thread object
// - start() - ask JVM to allocate new OS thread, new stack
// - JVM calls run() internally on that new thread

// rules:
// - start() can be called only once,
// - Once finished the thread cannot be called
// - Exceptions inside the thread do NOT crash main thread

// memory:
// - each thread gets own stack
// - local variables live here
// - objects are created in heap which are shared


//2. Thread object by extending it

// - Thread object is created directly
// - no conversion to runnable and then runnable to Thread constructor

// other than this same as Thread

//3. Runnable
// - thread - how to do
// - runnable - what to do (logic)

// rules:
// - runnable can be reused
// - it returns no value

// Important:
// - runnable improve design, not performance

// memory:
// - a runnable object is created
// - stored in heap
// - then we have to create a Thread object with Runnable and use start()
// - Runnable reference stored inside thread object


//4. Executors
// - created thread pool
// - have fixed no of pre created threads
// - acts like a manager that assign tasks

// how:
// i. jvm - creates executor service object
// - internally creates a given no of threads
// - threads  may be created lazily on first call
// ii. executor.execute {}
// - lambda -> converted to Runnable
// -  runnable are put into queue
// iii. (internally)
// - one free thread task take the Runnable in the queue
// -  calls run() on it
// - executes on its own task
// iv. thread -finish -> go back to pool

// rules:
// - thread are not destroyed
// - no. of thread is fixed
// - always shutdown the executor after usage
// (or threads stay alive, JVM will keep running, memory leaks)

// memory:
// - executor service object
// - queue task (Runnable object)
// - Runnable (lambda object)
// - Thread object (long lived)

// 5. Callable

// - Callable is interface - an anonymous object is created implementing Callable
// - returns a value unlike runnable
// - calls call() internally, do not call call() directly

// rules:
// - Callable must be executed using ExecutorService
// - Callable runs on a thread-pool thread
// - Each submit() returns a Future
// - Result is obtained using Future.get()
// - get() blocks and guarantees memory visibility
// - Exceptions are wrapped in ExecutionException
// - Callable does NOT prevent race conditions automatically

// memory:
// - Callable object is created and stored in heap
// - ExecutorService manages worker threads (long-lived)
// - Each worker thread has its own stack during execution
// - Local variables inside call() live on thread stack
// - Result or exception is stored inside Future (heap)
// - After execution, thread returns to pool, stack is cleared

// thread()
// - same as Thread class
// - easy to configure
// - reduces no of code line

//Thread                vs              Runnable

//Cannot be inherited                  Can inherit other classes and
// other than Thread Class               interfaces along with this

// Tightly couples                      Uncoupled
// (Thread and logic)                   (Thread and Logic are separate)

// Cannot be reused                     Can be resued
// t1.start() can be
// used only once

//Only live once                        ExecutorService  -> manager
//                                      Employee -> The fixed number of threads do the job (newFixedThreadPool)

//small task                            Large applications