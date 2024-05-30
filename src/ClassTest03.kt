import Chapter02.sum

class Rect(var width: Int = 1, var height: Int = 1) {
    companion object {
        fun getArea(w: Int, h: Int): Int {
            return w * h
        }
    }
}

fun main() {
    var arr: ArrayList<Rect> = ArrayList()
    var sum = 0
    for (i in 0..3) {
        print("너비와 높이 >> ")
        var (w, h) = readln().split(" ").map { it.toInt() }
        Rect(w, h)
        sum += Rect.getArea(w, h)

    }
    println("저장하였습니다...")
    println("사각형의 전체 합은 $sum")
}