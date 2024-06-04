package Chapter06

import Chapter02.max

open abstract class Calc {
    var a: Int = 0
    var b: Int = 0
    abstract fun cal(): Int
    abstract fun input()
    fun run() {
        input()
        println("계산된 값은 ${cal()}")
    }
}

class Adder : Calc() {
    override fun cal(): Int {
        return a + b
    }

    override fun input() {
        print("덧셈 연산을 위한 정수 2개 입력 >> ")
        var (x, y) = readln().split(" ").map { it.toInt() }
        a = x
        b = y
    }
}

class Sub : Calc() {
    override fun cal(): Int {
        return a - b
    }

    override fun input() {
        print("뺄셈 연산을 위한 정수 2개 입력 >> ")
        var (x, y) = readln().split(" ").map { it.toInt() }
        a = x
        b = y
    }
}

fun main() {
    var add: Adder = Adder()
    var sub: Sub = Sub()
    add.run(); sub.run()
}