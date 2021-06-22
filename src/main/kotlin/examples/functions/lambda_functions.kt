package main.kotlin.examples.functions

fun main() {
    val lambda: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println("5 + 10 = ${lambda(5, 10)}")

    val lambda2 = { a: Int, b: Int -> a * b }
    println("5 * 10 = ${lambda2(5, 10)}")
    println("5 * 20 = ${lambda2.invoke(5, 20)}")

    val numbers = listOf(1, 3, 5, 7, 9, 11)
    println(numbers.filter { it < 7 })

    val greet: String.() -> String = { "what's up $this?" }
    println("Valdeci".greet())
}
