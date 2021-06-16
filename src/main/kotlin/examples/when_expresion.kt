package main.kotlin.examples


enum class Suit {
    Club, Diamond, Heart, Spade
}

fun main() {
    val x =1
    when(x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        3,4 -> println("x == 3 or 4")
    }



    val card = Suit.Spade
    val y = when(card) {
        Suit.Club, Suit.Spade -> println("black card")
        Suit.Diamond, Suit.Heart -> println("red card")
    }

    println("card == $card")
    println("y == $y")

    val name = "Valdeci"
    val lastName = when(name) {
        "Valdeci" -> "Gomes"
        "Bill" -> "Gates"
        "Steve" -> "Jobs"
        else -> "Unknown"
    }

    println("$name $lastName")

    var age  = 15
    val ageType = when(age){
        in 0..1 -> "baby"
        in 2..4 -> "toddler"
        in 5..12 -> "kid"
        in 13..19 -> "teenager"
        in 20..64 -> "adult"
        else -> "senior"
    }

    println("You are $ageType")
}