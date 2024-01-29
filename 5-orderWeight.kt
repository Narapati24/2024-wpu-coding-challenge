// 2024 WPU challange
// Day 5
// https://www.codewars.com/kata/55c6126177c9441a570000cc/kotlin

fun orderWeight(str: String): String {
    return str.split(" ")
        .sortedWith(compareBy({ it.map { c -> c.toInt() - '0'.toInt() }.sum() }, { it }))
        .joinToString(" ")
}