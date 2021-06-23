package examples.collections_sequences

fun main() {
    val threes = setOf(3, 3, 3, 3) //duplicates are not allowed in sets
    println(threes) //[3]
    println("size = ${threes.size}") //size=1
    println("has a 4? ${threes.contains(4)}")

    println()
    val fSet = mutableSetOf(1, 2, 3, 4, 5)
    val bSet = mutableSetOf(5, 4, 3, 2, 1)

    println("firsts equal? ${fSet.first() == bSet.first()}")  //false
    println("fSet == bSet? ${fSet == bSet}") //true

    println()
    val fHashSet = hashSetOf(1, 2, 3, 4, 5) //in hashsets order is not preserved
    val bHashSet = hashSetOf(5, 4, 3, 2, 1)

    println("first equal? ${fHashSet.first() == bHashSet.first()}") //true
    println("fHashSet == bHashSet? ${fHashSet == bHashSet}") // true

    println()
    println("added 6? ${fSet.add(6)}") //added 6? true
    println("removed 76? ${fSet.remove(76)}") //removed 76? false

    println()
    val aList = fHashSet.toList() //[1, 2, 3, 4, 5]
    println(aList)
}