fun main() {
    val num01 = 127                     // i=Int
    val num02 = -32768                  // Int
    val num03 = 9223372036854775807     // Long으로 추론

    println("num01: $num01, num02: $num02, num03: $num03")

    val exp01 = 3.14                    // 기본적으로 Double형으로 추론
    val exp02 = 3.14F                   // 형식문자 F에 의해 Float형으로 추론
    val exp03 = 3.13E-2                 // 왼쪽으로 소수점 자리 이동, Double로 추론
    val exp04 = 3.14e2F                 // 오른쪽으로 소수점 자리 이동, Float로 추론

    println("exp01: $exp01, exp02: $exp02, exp03: $exp03, exp04: $exp04")
}