package main.kotlin.examples.functions

fun main() {
    val words = listOf("racecar", "civic", "level", "butter")
    words.forEach{ word -> println("$word is Palindrome? ${isPalindrome(word)}  ") }
}

fun isPalindrome(word: String): Boolean {
    fun doCharsMatch(front: Int, back: Int): Boolean {
        if (front >= back) return true
        if (word[front].uppercaseChar() != word[back].uppercaseChar()) return false
        return doCharsMatch(front + 1, back - 1)
    }
    if (word.length < 2) return true
    return doCharsMatch(0, word.lastIndex)
}
