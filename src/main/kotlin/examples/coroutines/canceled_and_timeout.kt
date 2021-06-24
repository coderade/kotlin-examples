package examples.coroutines

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() {
    val time = measureTimeMillis {
//        timeOut()
      cancel()
    }
    println("$time ms")
}

suspend fun calcWithDelay(startNum: Int): Int {
    delay(1000)
    return startNum + 1
}

fun timeOut() = runBlocking {
    println("async/await beginning")
    val results = withTimeoutOrNull(2000L){
        val x1 = async { calcWithDelay(100) }
        val x2 = async { calcWithDelay(200) }
        val x3 = async { calcWithDelay(300) }
        val sum1 = listOf(x1, x2, x3).awaitAll().sum()
        println("async/await results = $sum1")
        "finished"
    } ?: "timed out"

    println("results = $results")
}

fun cancel() = runBlocking {
    val job = launch(Dispatchers.Default) {
        var i = 0
        var nextPrintTime = System.currentTimeMillis()
        while (isActive) {
            if (System.currentTimeMillis() >= nextPrintTime) {
                println("working for ${i * 100} milliseconds ...")
                nextPrintTime += 100L
                i++
            }
        }
        println("canceled job")
    }
    delay(1000L)
    println("canceling job")
    job.cancelAndJoin()
    println("done")
}
