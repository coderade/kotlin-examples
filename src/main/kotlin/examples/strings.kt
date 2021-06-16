package main.kotlin.examples

fun main() {
    val greeting = "Hello there"
    val owe = 50

    val jes = "I owe Jes \$$owe dollars"
    println(jes)

    val infinity = "The infinity symbol is \u221E"
    println(infinity)

    println("[$greeting] is ${greeting.length} characters long")

    var bad = greeting.get(2)
    var letter = greeting[1]

    val compare1 = "beta"
    val compare2 = "alpha"

    println("Comparing $compare1 with $compare2 ==> ${compare1.compareTo(compare2)}")

    val sub = greeting.subSequence(6,9)
    println("sub = $sub")


    for(single in greeting){
        print(" $single")
    }

    val rawString = """
        Kotlin is fun.
        Kotlin in pragmatig.
    """

    println(rawString)

}