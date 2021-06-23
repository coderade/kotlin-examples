package examples.control_flow

fun main() {
    val bigger = 1000
    val smaller = 1

    val max = if (bigger > smaller) bigger else smaller


    // if version
    if (bigger > 10) {
        println("greater than 10")
    } else if (bigger > 100) {
        println("greater than 100")
    } else {
        println("not too big")
    }

    // when version
    when {
        bigger > 10 -> {
            println("greater than 10")
        }
        bigger > 100 -> {
            println("greater than 100")
        }
        else -> {
            println("not too big")
        }
    }

    val number = 121

    val bucket: Any = if (number > 100) {  // the best idea here is use when
        "alpha"
    } else if (number > 90) {
        println("less than 90")
        2
    } else if (number > 80) {
        1
    } else {
        0
    }

    println("bucket = $bucket")

}