package main.kotlin.examples.io_files

import java.util.*

fun main() {
    print("Enter text: ")
    val value = readLine() ?: ""
    println("You entered $value, length =  ${value.length}")

    print("\nEnter an integer value: ")
    val string1 = readLine() ?: ""
    val iValue: Int = string1.toIntOrNull() ?: 0
    println("You entered: $iValue")


    print("\n Enter an double value: ")
    val string2 = readLine() ?: ""
    val dValue: Double = string2.toDoubleOrNull() ?: 0.0
    println("You entered: $dValue")

    scanner()
}

fun scanner(){
    println()
    val scan = Scanner(System.`in`)
    print("\n Enter an integer number: ")
    val num1 = scan.nextInt()
    print("\n Enter an double number: ")
    val num2 = scan.nextDouble()

    println()
    println("The first number is: $num1")
    println("The second number is: $num2")
}