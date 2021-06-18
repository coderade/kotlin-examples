package main.kotlin.examples.io_files

fun main(args: Array<String>){

    if(args.any()){
        println("first argument = ${args[0]}")

        for((idx, arg) in args.withIndex()){
            println("arg $idx => $arg")
        }
    }

}