// 2024 WPU challange
// Day1
// https://www.codewars.com/kata/534d2f5b5371ecf8d2000a08/kotlin

package kata

object KataSolution {
    fun multiplicationTable(size: Int): Array<IntArray> {
        val table = Array(size) { IntArray(size) { 0 } }

        for (i in 1..size) {
            for (j in 1..size) {
                table[i - 1][j - 1] = i * j
            }
        }
        

        return table
    }
}