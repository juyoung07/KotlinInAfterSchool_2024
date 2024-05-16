package Chapter04

import java.util.*

fun main() {
    val items = arrayOf<String>("Dog", "Cat", "Lion", "Kangaroo", "Po")
    items.sortBy { item -> item.length }
    println(Arrays.toString(items))
    items.sortByDescending { item -> item.length }
    println(Arrays.toString(items))
}