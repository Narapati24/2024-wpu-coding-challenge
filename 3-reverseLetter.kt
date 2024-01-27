// 2024 WPU challange
// Day3
// https://www.codewars.com/kata/58b8c94b7df3f116eb00005b/kotlin

fun reverseLetter(str: String): String = str.filter { it.isLetter() }.reversed()

fun main(){
  println(reverseLetter("awdasda5432#@%dawaw@fw@r#"))
}