fun main() {
    var arr = intArrayOf(1, 2, 3, 4, 5)
    for (i in 0..arr.size-1)
        print("${arr[i]} \t")

    println()

    for (i in arr)
        print("$i \t")
}