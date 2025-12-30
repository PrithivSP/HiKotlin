package threadingAndConcurrency

import kotlinx.coroutines.*

fun coroutineExample() = runBlocking {

    println("Dashboard request started on ${Thread.currentThread().name}")

    // Side-effect coroutine
    val analyticsJob = launch(Dispatchers.IO) {
        delay(2000)
        println("Analytics event sent")
    }

    // Parallel data loading

    val profileDeferred = async {
        loadUserProfile()
    }

    val notificationsDeferred = async {
        loadNotifications()
    }

    val settingsDeferred = async(Dispatchers.IO, start = CoroutineStart.LAZY) {
        loadUserSettings()
    }

    println("Main continues while data loads")

    // Explicitly start lazy coroutine

    settingsDeferred.start()

    // Wait for results

    val profile = profileDeferred.await()
    val notifications = notificationsDeferred.await()
    val settings = settingsDeferred.await()

    println("\n--- Dashboard Ready ---")
    println()
    println(profile)
    println(notifications)
    println(settings)
    println()

    // side-effect completion

    analyticsJob.join()

    // cancellation example

    val refreshJob = launch {
        repeat(500) {
            println("Refreshing dashboard... $it")
            delay(800)
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
    return "UserProfile (name=Alex)"
}

suspend fun loadNotifications(): String {
    delay(800)
    return "Notifications (count=5)"
}

suspend fun loadUserSettings(): String {
    delay(500)
    return "Settings (theme=Dark)"
}