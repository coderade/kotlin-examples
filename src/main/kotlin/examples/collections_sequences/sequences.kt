package main.kotlin.examples.collections_sequences

fun main() {
    val result = (100 until 200)
        .map { println("doubling $it"); it * 2 }
        .filter { println("filtering $it"); it % 3 == 0 }
        .first()
    println("results = $result")
    println()


    val resultSequence = (100 until 200).asSequence()
        .map { println("doubling $it"); it * 2 }
        .filter { println("filtering $it"); it % 3 == 0 }
        .first()
    println("results = $resultSequence")
    println()

    val myThrees = sequenceOf(1, 3, 4, 5, 6, 7, 8, 9, 12).filter { it % 3 == 0 }
    println("myThrees  = $myThrees")
    println("myThrees as list = ${myThrees.toList()}")
}
