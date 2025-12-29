package datatypes.classesTypes

class DatabaseConnection(val url: String, val directory: String) {

    class Config(val timeOut: Int, val retryCount: Int) {
        fun printConfig() {
            println("Timeout: $timeOut sec, Retry: $retryCount times")
        }
    }

    inner class Commit {
        fun begin() {
            println("Staging started on DB: $url in $directory")
        }

        fun commit() {
            println("Stage committed on DB: $url")
        }
    }
}

fun nestedAndInnerClass() {
    // nested class
    val config = DatabaseConnection.Config(30, 3)
    config.printConfig()

    // inner class
    val db = DatabaseConnection("localhost:3000", "/home/usr")
    val commit = db.Commit()

    commit.begin()
    commit.commit()
}


// nested class

// cannot:
// cannot access instance members of outer class

// can:
// can be declared inside another class
// can have visibility modifiers
// can have constructor, init block
// can have fields and methods

// properties
// can be instantiated without outer class

// memory
// no reference to outer class
// treated as a separate class
// JVM equivalent: static nested class


// inner class

// cannot:
// cannot be created without outer class instance
// cannot be object or companion object

// can:
// can access outer class members + companion object
// can have visibility modifiers
// can have constructor, init block
// can have fields and methods

// memory:
// holds implicit reference to outer class
// stored in heap
// JVM equivalent: non - static nested class