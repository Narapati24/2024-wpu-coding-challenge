// 2024 WPU challange
// Day 4
// https://www.codewars.com/kata/51b62bf6a9c58071c600001b/kotlin

package romannumerals

fun encode(num: Int): String {
    if (num == 0) {
        return ""
    }

    require(num in 1..3999) { "Invalid input" }

    val romanNumerals = listOf(
        "M" to 1000,
        "CM" to 900,
        "D" to 500,
        "CD" to 400,
        "C" to 100,
        "XC" to 90,
        "L" to 50,
        "XL" to 40,
        "X" to 10,
        "IX" to 9,
        "V" to 5,
        "IV" to 4,
        "I" to 1
    )

    val result = StringBuilder()
    var remainingNum = num

    for ((symbol, value) in romanNumerals) {
        while (remainingNum >= value) {
            result.append(symbol)
            remainingNum -= value
        }
    }

    return result.toString()
}