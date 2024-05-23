package Chapter04

fun main() {
    var nationList:MutableMap<String, Int> = mutableMapOf<String, Int>()

    println("나라 이름과 인구를 5개 입력하세요.")
    for (i in 1..5) {
        print("나라 이름, 인구 입력 >> ")
        val (key, number) = readln().split(' ')
        var value : Int = number.toInt()
        nationList.put(key, value)
    }

    var nation : String = nationList.keys.first()   // map은 인덱스 사용 불가
    var max : Int = nationList.values.first()

    for ((key, value) in nationList) {
        if (value > max)
            max = value
            nation = key
    }

    println("제일 인구가 많은 나라는 (${nation}, ${max})")
}