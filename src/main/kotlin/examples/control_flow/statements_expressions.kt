package examples.control_flow

fun returnsNothing() {
    println("returnsNothing() function")
}

fun main() {
    val bigger = 1000
    val smaller = 1

    val max = if (bigger > smaller) bigger else smaller
    println(max)

    val age = 35

    val boardGroup = when (age) {
        in 0..18 -> "family"
        in 65..200 -> "family"
        else -> "regular"
    }

    println("you are in the $boardGroup group")

    val fromNothing = returnsNothing()
    println("$fromNothing")

    var a = 100
    var b = 1
    // won't compile
    // a = b  = 1000


}