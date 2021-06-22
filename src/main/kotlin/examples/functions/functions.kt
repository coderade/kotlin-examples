package main.kotlin.examples.functions

fun main() {
    greeter("Valdeci")
    println("volume is ${volume(10, 5)}")
    println("volume is ${volumeX(width = 10, height = 13)}")
}

//normal function version
//fun greeterNormal(name: String): String {
//    return "Hello $name"
//}

//compact function version
fun greeter(name: String) = "Hello $name"

fun volume(length: Int, width: Int, height: Int = 10) = length * width * height

fun volumeX(length: Int = 10, width: Int, height: Int) = length * width * height
