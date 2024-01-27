// 2024 WPU challange
// Day3
// https://www.codewars.com/kata/5aba780a6a176b029800041c/kotlin

//fun maxMultiple(d: Int, b: Int): Int {
//    var ba: Int = b
//    while (ba % d != 0){
//        ba--
//    }
//    return ba
//}

fun maxMultiple(d: Int, b: Int) = b / d * d

fun main(){
    print(maxMultiple(7, 100))
}