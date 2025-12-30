package threadingAndConcurrency

import kotlinx.coroutines.delay

class BankAccount {
    var balance = 0

    //    @Synchronized
    fun add(amount: Int) {
//        synchronized(this) {
        balance += amount
//        }
    }
}

fun concurrency() {
    val account = BankAccount()

    val t1 = Thread {
        repeat(1000) { account.add(1) }
    }

    val t2 = Thread {
        repeat(1000) { account.add(1) }
    }

    t1.start()
    t2.start()

    t1.join()
    t2.join()

    println("Final balance: ${account.balance}")

    val lock1 = Any()
    val lock2 = Any()

    val thread1 = Thread {
        synchronized(lock1) {
            synchronized(lock2) {
                println("T1 locked lock1")
                Thread.sleep(1000)
                println("Thread 1")
            }
        }
    }

    val thread2 = Thread {
        synchronized(lock2) {
            println("T2 locked lock2")
            Thread.sleep(1000)
            synchronized(lock1) {
                println("Thread 2")
            }
        }
    }

    thread1.start()
    thread2.start()

    thread1.join()
    thread2.join()
}
