package main.kotlin.examples

fun firstOperand(): Boolean {
    println("firstOperand")
    return false;
}

fun secondOperand(): Boolean {
    println("secondOperand")
    return true;
}

fun main() {
    demoBoolean()
    demoChar()
}

private fun demoBoolean() {
    println("Boolean examples:")

    var willExercise = false
    val bigNumber = 1_000_000
    val smallNumber = 2

    println("is big bigger? ${bigNumber > smallNumber}")
    println("")

    if(firstOperand() || secondOperand()){
        println("at least one operand is true")
    }

    println("")

    if(firstOperand() || secondOperand()){
        println("at least one operand is true")
    }

    println("")

    if(firstOperand() && secondOperand()){
        println("Both operands are true")
    }

    println("Will exercise? ${!willExercise}")

}

private fun demoChar() {
    println("Char examples:")

    val letter = 'A' //Char
    val tab = '\t' //ASCI
    val infinity = '\u221E' //Unicode

    println("letter = $letter")
    println("Tabbed $tab over")
    println("Infinity = $infinity")

    val lineFeed = 10.toChar()
    println("line feed = $lineFeed next line")
}