class Birds {
    // 프로퍼티는 초기화 필수(없으면 에러), 예외: 생성자에서 사용하는 경우 초기화 생략 가능
    // 프로퍼티는 getter와 setter 메소드가 자동으로 생성되며, 사용시에는 직접 접근함

    var name : String = " myBird"
    var wing : Int = 2
    var color = " blue "

    fun fly() = println(" Flying wing ")
    fun sing(vol:Int) = println(" Singing vol : $vol ")
}
fun main() {
    val coco : Birds = Birds()      // Birds 객체 생성
    coco.color = "red "             // 내부적으로 setter 메소드를 호출 -> coco.setColor("red")
    println("coco.color  : ${coco.color}")      // 내부적으로 getter 메소드 호출 -> coco.getColor()

    coco.fly()
    coco.sing(2)
}