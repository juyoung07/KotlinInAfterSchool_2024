package Chapter02

// 컴퓨터가 1부터 10까지의 수 중 하나의 숫자를 임의로 설정하여 저장한 후 사용자가 맞추는 게임
fun main() {
    val v_range:IntRange = 1..10
    var com:Int = v_range.random()          // 1 ~ 10사이의 랜덤 정수
    var count:Int = 0

    while (true) {
        print("컴퓨터가 생각한 수를 맞춰보세요 (1~10사이) >> ")
        var input = readln().toInt()

        count++
        if (com < input)
            println("입력한 수가 컴퓨터의 수보다 작습니다.")
        else if (com > input)
            println("입력한 수가 컴퓨터의 수보다 큽니다.")
        else
            break
    }
    println("$count 번 만에 맞췄습니다.")
}
