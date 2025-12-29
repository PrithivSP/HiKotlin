package basics

class ConfigNotFoundException(message: String): RuntimeException(message)

fun loadConfig(): String {

    val configPath = "./home/config.txt"

    return try {
        val file = configPath

        if (!file.contains("./home")) {
            throw ConfigNotFoundException("Config file not found at path: $configPath")
        }

        file

    } catch (e: ConfigNotFoundException) {

        // Meaningful handling: log and rethrow
        println("CRITICAL ERROR: ${e.message}")
        throw e

    } catch (e: Exception) {

        // Unexpected error (IO, permission, etc.)
        println("Unexpected error while loading config")
        throw RuntimeException("Startup failed due to unexpected error", e)
    }
}


fun exceptionHandling() {
    println("Starting Application ...")

    val configContent: String = try {
        loadConfig()
    } catch (e: Exception) {
        println()
        throw e // fail fast
    } finally {

    }

    println("Config loaded successfully")
    print("Application started with config: $configContent")
}





// Throwable
//  |
//  |
//  | - Exception: - problem in our application due to program logic or external input
//                 - file not found, invalid input
//          |
//          |
//          |
//          |
//          |   - Checked exception (no forceful handling in kotlin): checked by compiler - IOException, SQLException, FileNotFoundException
//          |
//          |   - Unchecked exception: occur at runtime and not checked by compiler - NullPointerException, IllegalArgumentException
//  |
//  |
//  |
//  | - Error: - serious system-level failure that your application cannot recover from
//             - StackOverFlowError, OutOfMemoryError



// why
//In java the compiler forces you to handle the checked exception.
//Because, checked exception can break our app during runtime due to external input.
//But in kotlin we removed this because, handling exception means we are not focusing on meaning fully handling it.
//In java, it just increases the boilerplate and fake handling and also forces caller function to use throws keyword.
//In kotlin if we want to intentionally handle then can handle. If not it should fail fast and not fake handling.