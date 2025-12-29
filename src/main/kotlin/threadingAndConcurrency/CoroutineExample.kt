package threadingAndConcurrency

import kotlinx.coroutines.*

fun main() = runBlocking {

    println("Dashboard request started on ${Thread.currentThread().name}")

    // ------------------ Side-effect coroutine ------------------
    val analyticsJob = launch {
        delay(300)
        println("Analytics event sent")
    }

    // ------------------ Parallel data loading ------------------
    val profileDeferred = async {
        loadUserProfile()
    }

    val notificationsDeferred = async {
        loadNotifications()
    }

    val settingsDeferred = async(start = CoroutineStart.LAZY) {
        loadUserSettings()
    }

    println("Main continues while data loads")

    // Explicitly start lazy coroutine
    settingsDeferred.start()

    // ------------------ Wait for results ------------------
    val profile = profileDeferred.await()
    val notifications = notificationsDeferred.await()
    val settings = settingsDeferred.await()

    println("\n--- Dashboard Ready ---")
    println(profile)
    println(notifications)
    println(settings)

    // ------------------ Ensure side-effect completion ------------------
    analyticsJob.join()

    // ------------------ Cancellation example ------------------
    val refreshJob = launch {
        repeat(100) {
            println("Refreshing dashboard... $it")
            delay(300)
        }
    }

    delay(900)
    println("User navigated away → cancel refresh")
    refreshJob.cancel()
    refreshJob.join()

    println("Request finished")
}


suspend fun loadUserProfile(): String {
    delay(600) // simulate network wait
    return "UserProfile(name=Alex)"
}

suspend fun loadNotifications(): String {
    delay(800)
    return "Notifications(count=5)"
}

suspend fun loadUserSettings(): String {
    delay(500)
    return "Settings(theme=Dark)"
}