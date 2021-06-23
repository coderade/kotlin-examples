package examples.oo

class Vehicle(
    private val make: String, private val model: String,
    private val year: Int, private val state: String = "CA"
) {

    override fun toString(): String {
        return "$year $make $model ($state)"
    }

    init {
        println("First initializer block - $this")
    }

    constructor(
        make: String, model: String,
        year: Int, state: String, style: String
    ) : this(make, model, year, state) {
        this.style = style
    }

    constructor(
        make: String, model: String,
        year: Int, state: String, style: String,
        status: String
    ) : this(make, model, year, state, style) {
        this.status = status
    }

    private var style: String = ""
    private var status: String = ""

}

fun main() {
    val car = Vehicle("Nissan", "Kicks", 2020)
    println(car)

    val car2 = Vehicle(state = "PR", year = 2020, make = "Honda", model = "HRV")
    println(car2)

    val car3 = Vehicle("Tesla", "Model S", 2019, "RI", style = "P100D")
    println(car3)

    val car4 = Vehicle(
        "Tesla", "Model 3", 2019, "CA", "Performance",
        "New"
    )
    println(car4)
}
