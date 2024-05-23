class Users(name:String, count:Int) {
    var name: String
    var count: Int
    init {
        // 클래스 멤버변수에 생성자 매개변수 값 대입
        this.name = name
        this.count = count
    }
    fun sumFun() {
        println("name : $name, count : $count")
    }
}
fun main() {
    var user = Users("hong", 10)
    user.sumFun()
}