package Chapter04

fun main() {
    var arr = intArrayOf(1, 2, 3, 4, 5)
    for (i in 0..arr.size - 1)
        print("${arr[i]} \t")
    println()

    for (i in arr)
        print("$i \t")
    println()

    for ((i, x) in arr.withIndex())
        print("arr[$i] = $x \t")
    println()

    arr.forEach { e -> print("$e \t") }
    println()
    arr.forEach { print("$it \t") }
    println()

    arr.forEachIndexed {i, e -> println("arr[$i] = $e")}
}