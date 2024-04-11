
fun main() {
    // 숫자를 입력 받아 1부터 해당 숫자까지 짝수의 합을 구하여 출력
    print("정수 입력 >> ")
    var input = readln().toInt()
    var sum = 0

    for (i in 1..input) {
        if (i % 2 == 0)
            sum += i
    }
    println("짝수의 합: $sum")

    // for step 해볼까
    print("정수 입력 >> ")
    input = readln().toInt()
    sum = 0

    for (i in 0..100 step 2)
        sum += i
    println("짝수의 합: $sum")

    // 숫자를 입력 받아 입력 받은 값부터 ..., 3, 2, 1로 역순으로 출력하는 코드
    print("정수 입력 >> ")
    var input2 = readln().toInt()

    for (i in input2 downTo 1)
        println(i)

}
