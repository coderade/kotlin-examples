package examples.collections_sequences

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 5, 6, 7, 7, 8)
    val set = setOf(10, 20, 30, 40, 50)
    val map = mapOf(1 to 10, 2 to 20, 3 to 30)

    println("list = $list")
    val tList = list.map { it * 2 }
    println("list.map {it*2} = $tList")
    println("tList last  ${tList.last { it > 2 }}")

    println()
    println("map = $map")
    val tMap = map.map { Pair(it.key, it.value * 10) }.toMap()
    println("map.map{ Pair(it.key, it.value * 10)}.toMap() = $tMap")

    println()
    println("list = $list")
    val fList = list.filter { it % 2 == 1 }
    println("odd values => list.filter { it % 2 == 1 } = $fList")

    println()
    println("set = $set")
    println("set sorted descending = ${set.sortedDescending()}")
    val fSet = set.filter { it > 100 }
    println("is fSet empty? = ${fSet.isEmpty()}")

    println()
    println("list = $list")
    println("list to set = ${list.toSet()}")
    println("set = $set")
    println("set to list = ${set.toList()}")

}
