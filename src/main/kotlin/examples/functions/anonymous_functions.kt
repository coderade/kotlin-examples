package examples.functions

fun main() {
    val num = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val fNum = num.filter(fun(a: Int): Boolean { return a < 7 })
    println(fNum)
    val fNum2 = num.filter(fun(a) = a < 7)
    println(fNum2)

    println()
    val getAgeLambda = lambda@{ age: Int ->
        if (age >= 65)
            return@lambda "senior discount"
        else if (age >= 21)
            return@lambda "regular"
        "underage"
    }

    val getAgeAnonymousFunction = fun(age: Int): String {
        if (age >= 65)
            return "senior discount"
        else if (age >= 21)
            return "regular"
        return "underage"
    }

    println("Client pays - Anonymous Function => ${getAgeAnonymousFunction(12)}")
    println("Client pays - Lambda => ${getAgeLambda(12)}")
}
