package main.kotlin.examples

fun main() {
    val m1 = mapOf(1 to "alpha", 2 to "beta", 3 to "gamma", 4 to "delta")
    val m2 = mapOf(4 to "delta", 3 to "gamma", 2 to "beta", 1 to "alpha")

    println("m1 == m2? ${m1 == m2}")

    println("m1[2] == ${m1[2]}")
    println("m1[5] == ${m1.getOrDefault(5, "Not present")}")

    println()
    val cars = mutableMapOf(
        "kicks sv" to 2020,
        "jeep compass" to 2016,
        "kicks sl" to 2018,
        "honda civic" to 2020
    )

    cars["honda hrv"] = 2017

    println("removed civic = ${cars.remove("honda civic")}")

    for (key in cars.keys) {
        println(key)
    }

    println("has kicks sv? ${"kicks sv" in cars}")
    println("has 2020? ${2020 in cars.values}")
}

