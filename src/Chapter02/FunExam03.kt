package Chapter02

fun sum5 (a: Int, b: Int): Int {
    var sum = 0
    fun calSum() {
        for (i in a..b)
            sum += i
    }
    calSum()
    return  sum
}

fun main() {
    print("시작 값 입력 >> ")
    var x = readln().toInt()
    print("끝 값 입력 >> ")
    var y = readln().toInt()
    println("$x ~ $y 까지의 합 = ${sum5(x, y)}")
}