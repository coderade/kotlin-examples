package examples.collections_sequences

data class Student(val firstName: String, val grade: Int)


fun main() {
    val things = arrayOf(1, 2, 3, "one", "two") //mixed types array
//    things[0] = "zero"

    for (thing in things) {
        println(thing)
    }

    val students = arrayOf<Student>(
        Student("Valdeci", 10),
        Student("Jess", 10)
    )

    students[1] = Student("Jhon", 5)

    for (student in students) {
        println(student)
    }


    val fives = Array(5, ::fiver)
    fives.forEach { println(it) }


    println("fives has ${fives.size} elements")
    println("indices ${fives.indices}")
    println("fives last index ${fives.lastIndex}")


    val pInts = intArrayOf(1, 2, 3, 4)

}

fun fiver(idx: Int): Int {
    return idx * 5
}