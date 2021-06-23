package examples.oo

//Composition of classes, check the inheritance.kt file to compare different approach of creating classes

interface IWorker {
    val jobTitle: String
    fun trackHours(hours: Double)
    fun doWork()
}

interface IBeing {
    val firstName: String
    fun getName(): String
}

class Worker(override val jobTitle: String) : IWorker {
    private var totalHours = 0.0

    override fun trackHours(hours: Double) {
        totalHours += hours
    }

    override fun doWork() {
        println("Doing ${this.jobTitle} work.")
    }
}

class Being(override val firstName: String) : IBeing {
    override fun getName(): String {
        return firstName
    }
}

interface IPayment {
    fun calcPay(): Double
}

class HourlyPay(private val hourlyRate: Double) : IPayment {
    override fun calcPay(): Double {
        return hourlyRate
    }
}

class SalariedPay(private val yearlyRate: Double) : IPayment {
    override fun calcPay(): Double {
        return yearlyRate
    }
}

class Employee(worker: IWorker, being: IBeing, pay: IPayment) :
    IWorker by worker, IBeing by being, IPayment by pay {
}

class NoPay() : IPayment {
    override fun calcPay(): Double {
        return 0.0
    }
}

fun main() {
    val hourly = Employee(
        Worker("bit wrangler"),
        Being("abel"),
        HourlyPay(42.42)
    )
    println("My name is ${hourly.getName()}")
    hourly.doWork()

    val salaried = Employee(
        Worker("program manager"),
        Being("beth"),
        SalariedPay(100_000.0)
    )
    println("My name is ${salaried.getName()}")
    salaried.doWork()

    val rescueDog = Employee(
        Worker("rescue dog"),
        Being("fido"),
        NoPay()
    )
    println("My name is ${rescueDog.getName()}")
    rescueDog.doWork()
}
