package Chapter01

// String pool
fun main() {
    var str1:String = "hello"
    var str2 = "world"
    var str3 = "hello"

    println("str1 === str2: ${str1 === str2}")
    println("str1 === str3: ${str1 === str3}")

    // 객체로 생성하면 str1, str3과 다름
    var str4 = String(charArrayOf('h','e','l','l','o'))
    println("str1 === str4: ${str1 === str4}")
    println("str1 == str4: ${str1 == str4}")
}