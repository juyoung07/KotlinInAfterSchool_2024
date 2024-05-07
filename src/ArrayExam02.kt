fun main() {
    var arr1 = Array<Int>(5){i -> i}
    for (i in 0 until 5)
        print("${arr1[i]} \t")

    println()

    var arr2 = IntArray(5){i -> i * i}
    for (i in arr2)     // 자바 for-each : for(변수 : 배열이름)
        print("$i \t")
}