// 2024 WPU Challange
// Day 1
// https://www.codewars.com/kata/5264d2b162488dc400000001/kotlin

package spinwords

fun spinWords(input: String): String {
    if (input.isBlank()) {
        return input
    }

    val words = input.split(" ")
    val reversedWords = words.map { if (it.length >= 5) it.reversed() else it }

    return reversedWords.joinToString(" ")
}