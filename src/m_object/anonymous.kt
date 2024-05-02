package m_object

// 익명 객체
// 특정 인터에핑스나 클래스를 상속받는 구현체를 1회성으로 사용할 때 쓰는 이름 없는 클래스
interface Movable {
    fun move();
    fun fly();
}
private fun move(movable: Movable) {
    movable.move()
    movable.fly()
}
// 코틀린에서 익명객체는 object : 타입명 { }
fun main() {
    move(object : Movable {
        override fun move() {
            println("움직입니다")
        }

        override fun fly() {
            println("납니다")
        }
    })
}
