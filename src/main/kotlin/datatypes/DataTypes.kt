package datatypes

typealias str = String

private class Calculator(){
    val byte: Byte = Byte.MAX_VALUE
    val short: Short = Short.MAX_VALUE
    val int: Int = Int.MAX_VALUE
    val long: Long = Long.MAX_VALUE
    val float: Float = Float.MAX_VALUE
    val double: Double = Double.MAX_VALUE

    val addChar: Char = '+'
    val success: str = "Success"

    var any: Any = ""
}

fun dataTypes(): Unit {

    val calculatorApp: Calculator = Calculator()
    println("Maximum byte value: " + calculatorApp.byte)
    println("Maximum short value: " + calculatorApp.short)
    println("Maximum int value: " + calculatorApp.int)
    println("Maximum long value: " + calculatorApp.long)
    println("Maximum float value: " + calculatorApp.float)
    println("Maximum double value: " + calculatorApp.double)

    //auto boxing and unboxing
    val byteToInt: Int = calculatorApp.byte.toInt()
    println("Boxed from byte to int: $byteToInt")
    val intToByte: Byte = calculatorApp.int.toByte()
    println("Boxed from int to byte: $intToByte")


    calculatorApp.any = ""
    calculatorApp.any = 123
    println(calculatorApp.any)

    if (calculatorApp.any is Int) {  // "12123123" is int
        println("Any is Int type")
    }

    if (calculatorApp.success is Any) {
        println("String is Any type")
    }
}









// Int -> int (jvm representation)
// Int? -> Integer (jvm representation)