package examples.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() {
    val syncTime = measureTimeMillis {
        synchronous()
    }
    println("synchronous calling time $syncTime ms")

    val asyncTime = measureTimeMillis {
        asyncAwait()
    }
    println("synchronous calling time $asyncTime ms")
}

suspend fun longCalc(startNum: Int): Int {
    delay(1000)
    return startNum + 1
}

fun synchronous() = runBlocking {
    val x1 = longCalc(100)
    val x2 = longCalc(200)
    val x3 = longCalc(300)
    val sum = listOf(x1, x2, x3).sum()

    println("sync results = $sum")
}

fun asyncAwait() = runBlocking {
    val x1 = async {longCalc(100)}
    val x2 = async {longCalc(200)}
    val x3 = async {longCalc(300)}
    val sum = listOf(x1, x2, x3).awaitAll().sum()

    println("async results = $sum")
}