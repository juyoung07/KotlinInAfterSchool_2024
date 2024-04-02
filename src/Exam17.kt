fun main() {
    print("숫자1 입력 >> ")
    var num1:Int = readln().toInt()
    print("숫자2 입력 >> ")
    var num2:Int = readln().toInt()
    // var num2:Int = readLine()!!.toInt()
    var max = if(num1 > num2)
                  num1
              else if(num1 < num2)
                  num2
              else
                  num1

    println("max = $max")
}