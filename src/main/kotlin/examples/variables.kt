package main.kotlin.examples

fun main() {
    var count: Int = 0 // The var keyword creates a mutable variable.
    val number: Int = 42 // The keyword val creates an immutable variable.
    val otherNumber = 43 // Int by default

    // Integers types
    var intValue: Int = 1234 //32 bits
    val longValue: Long = 1234L //64 bits
    var byteValue: Byte = 127 //8 bits
    var shortValue: Short = 32767 //16 bits

    // Floating point types
    val doubleValue: Double = 1234.56 //64 bits
    var floatValue: Float = 1234.56F //32 bits
    val alsoDouble = 12.1 //Double by default

    //Converting numbers
    val asInt = doubleValue.toInt()
    val asFloat = longValue.toFloat()

    val maxInt = 2_121_121_12 // using underscores as number spacers

    // Literals
    val hexadecimal = 0xFEDC
    val binary = 0b10101
    val long = 123456L

    // Character
    val letter = 'A' //Char
    val tab = '\t' //ASCI
    var infinity = '\u221E' //Unicode


}