package Chapter04

import java.util.*

fun main() {
    var arr = arrayOf(8, 4, 3, 2, 5, 9, 1)
    println(arr.first())
    println(arr.last())
    println("avg : ${arr.average()}")
    println("sum : ${arr.sum()}")
    println("count : ${arr.count()}")
    println(arr.contains(4))

    val sortedNums = arr.sortedArray()
    val sortedNumsDesc = arr.sortedArrayDescending()
    println(Arrays.toString(sortedNums))
    println(Arrays.toString(sortedNumsDesc))

    var arr2 = arrayOf(0, 7, 4, 3, 2, 6, 5, 1)
    arr2.sort()
    println(Arrays.toString(arr2))
    arr2.sortDescending()
    println(Arrays.toString(arr2))
}