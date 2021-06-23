package examples.control_flow

fun main() {
    //c-style loop
    //for(int i = 0; i < 10; i++){
    //  print(i)
    // }

    for (i in 1..10) {
        println("i = $i")
    }

    val names = listOf("Jeff", "Bill", "Steve")
    for (name in names) {
        println("Current name is $name")
    }

    for ((idx, name) in names.withIndex()) {
        println("Name #${idx + 1} is $name")
    }

    println("while")
    var count = 5
    while (count > 0) {
        println(count)
        count--
    }

    println("do while")
    do {
        println(count)
        count++
    } while (count < 5)


    println("break")
    while (count > 0) {
        if (count % 2 == 0) break
        println(count)
        count--
    }

}