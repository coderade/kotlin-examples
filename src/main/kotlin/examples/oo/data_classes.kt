package examples.oo


//class Student(private val firstName: String, private val lastName: String, private val grade: Int) {
//    override fun toString(): String {
//        return "$firstName $lastName - $grade"
//    }
//
//    override fun equals(other: Any?): Boolean {
//        if(other is Student){
//            return  firstName == other.firstName &&
//                    lastName == other.lastName &&
//                    grade == other.grade
//        }
//        return false
//    }
//
//    override fun hashCode(): Int {
//        var result = firstName.hashCode()
//        result = 31 * result + lastName.hashCode()
//        result = 31 * result + grade
//        return result
//    }
//}

// data classes eliminate the dirty code
data class Student(private val firstName: String, private val lastName: String, private val grade: Int)

fun main() {
    val students = mutableListOf<Student>(
        Student("Valdeci", "Gomes", 11),
        Student("Valdeci", "Gomes", 11),
        Student("Jessica", "Prandini", 12)
    )

    println()
    println(students[0])
    println("Does ${students[0]} == ${students[1]} : ${students[0] == students[1]}")

    val maria = students[0].copy(firstName = "Maria", lastName = "Paula")
    students.add(maria)
    println()

    for (student in students) {
        println(student)
    }
}
