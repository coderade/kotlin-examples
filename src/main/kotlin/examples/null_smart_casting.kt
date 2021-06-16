package main.kotlin.examples

data class Person(var firstName: String, var lastName: String)

fun main() {
//    val person1 : Person = null // won' workst
    val person2: Person? = null // define a nullable type by adding a question mark to the end of a non-nullable type

    val greeting: String? = "Hello there"

    println("He says $greeting")
    if (greeting != null) {
        println("null validation -> He says $greeting")
    }

    println("greeting length= ${greeting?.length}")

    val len = greeting?.length ?: 0 // if null len will be equal 0
    println("Length = $len")


    val badLen = greeting!!.length // unsafe nullable type (T?) conversion to a non-nullable type (T),
    // !! will throw NullPointerException if the value is null.

    val safeGreeting: String? = greeting as? String
    println(safeGreeting)

}