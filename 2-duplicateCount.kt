// 2024 WPU challange
// Day2
// https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/kotlin

// fun duplicateCount(text: String): Int {
//   // Create a mutable map to store character counts
//   val charCount = mutableMapOf<Char, Int>()

//   // Convert the input string to lowercase to make it case-insensitive
//   val lowercaseText = text.toLowerCase()

//   // Iterate through each character in the lowercase string
//   for (char in lowercaseText) {
//       // Update the count in the map
//       charCount[char] = charCount.getOrDefault(char, 0) + 1
//   }

//   // Count the characters that occur more than once
//   return charCount.values.count { it > 1 }
// }

fun duplicateCount(text: String) = text.groupBy(Char::toLowerCase).count { it.value.count() > 1 }

fun main(){
    println(duplicateCount("wwdswfasf"))
}