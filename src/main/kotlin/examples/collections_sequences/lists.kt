package examples.collections_sequences

fun main() {
    val names = listOf("Jhon", "Ringo", "Paul", "George")
    println("The first name is ${names.get(0)}") // not recommended
    println("The first name is ${names[0]}")

    val subNames = names.subList(1, 3)
    println(subNames)

    val items = mutableListOf(1, 2, 3, 4, 5)
    items[0] = 0


    items.add(6)
    items.removeAt(2)
    items.remove(99)

    println(items)
    println("size ${items.size}")
}