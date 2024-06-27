package k_extends

// 기본 클래스 : 상속 불가 open 키워드 통해 상속 허용
open class Animal {
    // 메서드도 기본적으로 final(오버라이딩 불가) 상태
    // 오버라이딩을 하려면 open 키워드 추가
    open fun eat() {
        println("동물이 먹습니다")
    }
}

class Dog: Animal() {
    // 애노테이션이 아닌 `override` 키워드로 오버라이딩
    override fun eat() {
        println("개가 먹이를 먹습니다.")
    }
}

fun main() {
    val dog = Dog()
    dog.eat()
}