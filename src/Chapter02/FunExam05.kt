package Chapter02

// vararg : 가변인자 함수
fun sum (vararg nums: Int): Int {
    var sum = 0
    for (number in nums)
        sum += number
    return sum
}
fun main() {
    var n1 = sum(1)
    var n2 = sum(1, 2, 3, 4, 5)
    var ar = intArrayOf(2, 4, 6, 8)

    var n3 = sum(*ar)   // 배열의 값 전달

    println(n1)
    println(n2)
    println(n3)
}