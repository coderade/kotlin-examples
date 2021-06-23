package main.kotlin.examples.oo

class CantCreate private constructor(val message: String){
    fun showMessage(){
        println(message)
    }

    companion object {
        const val LIGHT_SPEED = 299_792_458
        fun factory(msg: String) : CantCreate{
            return CantCreate(msg)
        }

        fun sillyPrint(self: CantCreate){
            println("Accessing ${self.message}")
        }
    }
}

fun main(){
    val c1 = CantCreate.factory("LOL")
    c1.showMessage()

    CantCreate.sillyPrint(c1)

    println("Ths speed of ligth is ${CantCreate.LIGHT_SPEED} ms/s")
}