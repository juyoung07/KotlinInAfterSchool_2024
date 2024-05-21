package Chapter04

fun main () {
    val arr: ArrayList<Int> = arrayListOf()

    println("정수 5개 입력")

    for (i in 0..4) {
        print("$i 번 데이터 >> ")
        arr.add(readln().toInt())
    }

    var max = arr.get(0)

    for (i in 0..arr.size - 1) {
        if (max <= arr.get(i))
            max = arr.get(i)
    }

    println("가장 큰 수는 $max")
}