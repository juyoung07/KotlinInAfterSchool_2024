fun main() {
    var a = IntArray(5)             // Int 배열
    var b = Array<Int>(5){0}        // Int 배열 (제네릭구조) (선언과 동시에 초기화)

    
    var array = Array<Int>(2, {0})              // 초기값을 0으로 하는 사이즈 2인 1차원 배열
    var stringArray = Array<String>(2, {""})    // String 배열

    var intArray = IntArray(2)                  // Int 배열
    var charArray = CharArray(2, { 'a' })       // Char 배열
    var floatArray = FloatArray(2, {1.0f})      // Float 배열
    var doubleArray = DoubleArray(2)            // Double 배열
    var longArray = LongArray(2)                // Long 배열
    var booleanArray = BooleanArray(2)          // Boolean 배열
}