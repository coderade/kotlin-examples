package examples.oo

// Example of how inheritance is not a good idea

abstract class Person1(val firstName: String, val ssn: String) {
    abstract fun getName(): String
}

open class Employee1(
    firstName: String,
    ssn: String,
    val jobTitle: String,
    val hourlyRate: Double
) :
    Person1(firstName, ssn) {

    var totalHours = 0.0

    override fun getName(): String {
        return firstName
    }

    fun trackHours(hours: Double) {
        totalHours += hours
    }

    fun doWork() {
        println("Doing ${this.jobTitle} work")
    }
}

class Salaried(
    firstName: String,
    ssn: String,
    jobTitle: String,
    val monthlySalary: Double
) : Employee1(
    firstName,
    ssn,
    jobTitle,
    0.0
) {}

fun main() {
    val hourly = Employee1("abel", "111-22-3333", "bit wrangler", 42.42)
    println("My name is ${hourly.getName()}")
    hourly.doWork()

    val salaried = Salaried("beth", "222-33-4444", "program manager", 12500.0)
    println("My name is ${salaried.getName()}")
    salaried.doWork()
}