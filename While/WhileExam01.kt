// 반복문 - while과 do-while
fun main() {
    var x = 0
    var sum = 0
    while (x < 10)
        sum += ++x
    println(sum)

    x = 0
    sum = 0
    while (true) {
        sum += ++x
        if (x == 10) break
    }
    println(sum)

    x = 0
    sum = 0
    do {
        sum += ++x
        if (x == 10) break
    } while (true)
    println(sum)
}