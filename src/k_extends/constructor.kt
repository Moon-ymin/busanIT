package k_extends

// 생성자에 매개 변수로 이름을 입력받아 프로퍼티로 초기화
open class Bird(val name: String) {
    fun fly() {
        println("${name}가 납니다.")
    }
}
// 상속을 받는 경우 부모 클래스의 생성자를 받아 초기화해야 함
class Parrot(name: String) : Bird(name) {
    fun speak() {
        println("${name}가 말을 합니다.")
    }
}

fun main() {
    // 자식 클래스의 생성자에서 매개변수로 입력받은 name 이
    // 부모 클래스의 생성자를 호출하여
    // 부모 클래스의 프로퍼티 name 에 대입
    val parrot = Parrot("앵무앵무새")
    parrot.fly()
    parrot.speak()
}