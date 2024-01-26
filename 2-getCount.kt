// 2024 WPU challange
// Day2
// https://www.codewars.com/kata/54ff3102c1bad923760001f3/kotlin

//fun getCount(str: String): Int {
//    val vowels = setOf('a', 'e', 'i', 'o', 'u')
//    return str.count { it in vowels }
//}

fun getCount(str : String) = str.count { it in "aeiou" }

fun main(){
    println(getCount("wgawadegses"))
}