package main.kotlin.examples.oo

class PlainShort {}

class ShortClass

class WithConstructor constructor(name: String, age: Int) {}

class WithoutConstructor(name: String, age: Int) {}

class MandatoryWithConstructor internal constructor(name: String, age: Int) {}

class CourseProperties(courseTitle: String) {
    val title = courseTitle
}

class Person(val firstName: String, lastName: String, var age: Int)

class Course(courseTitle: String){
    private val title = courseTitle
    private var description = ""

    get(){
        return if (field.isBlank()) "no description" else "$field!"
    }

    fun show(){
        println(title)
    }

    override fun toString(): String {
        return "$title - $description"
    }
}

fun main() {
    val course = Course("Kotlin Training")
//    course.description = "secrets you want to know"

    course.show()
    println(course)
}