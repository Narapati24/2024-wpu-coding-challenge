// 2024 WPU challange
// Day 4
// https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/kotlin

fun persistence(num: Int) : Int {
    if (num < 10) {
        return 0
    }

    var result = 0
    var currentNum = num

    while (currentNum >= 10) {
        var product = 1
        currentNum.toString().forEach {
            product *= Character.getNumericValue(it)
        }
        currentNum = product
        result++
    }

    return result
}

fun main(){
    print(persistence(11))
}