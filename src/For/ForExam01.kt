// for문 실습 1
fun main() {
    for(i in 1..10 step 2) {        // 2씩 증가하며 출력
        println(i)
    }
    for(i in 10 downTo 0 step 2) {  // 하행 시, 2씩 감소하며 출력
        println(i)
    }
}