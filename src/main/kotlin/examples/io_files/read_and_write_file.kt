package examples.io_files

import java.io.File

fun main() {
    val res = "./resources"
    val pets = "pets.txt"
    val petFile = File("${res}/${pets}")

    val file = File("${res}/text.txt")
    file.forEachLine { println(it) }

    val writeFile = File("${res}/write.txt")
    writeFile.writeText("Kotlin = happiness")

    val petList = listOf("cat", "dog", "bird", "fish")
    petList.forEach { petFile.appendText("$it\n") }

    val newPets = mutableListOf<String>()
    petFile.forEachLine { newPets.add(it) }
    println()
    println(newPets)

    val fileExists = petFile.exists()
    println("\nFile ${petFile.absolutePath} exists? $fileExists")
}