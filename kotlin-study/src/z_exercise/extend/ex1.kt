package z_exercise.extend

/*
### 문제 1: 동물 시뮬레이션

요구 사항:
1. `Animal`이라는 추상 클래스를 생성하고, 모든 동물이 공통적으로 가져야 할 `eat()` 메서드를
    추상 메서드로 선언하세요.
2. `FlyingAnimal`과 `SwimmingAnimal`이라는 두 개의 인터페이스를 생성하세요.
   - `FlyingAnimal`에는 `fly()` 메서드가 있어야 하며, 기본 구현으로 "날개짓 합니다."를
   출력하도록 설정하세요.
   - `SwimmingAnimal`에는 `swim()` 메서드가 있어야 하며, 기본 구현으로 "헤엄을 칩니다."를
   출력하도록 설정하세요.
3. `Bird`, `Fish`, `Duck` 세 클래스를 생성하여 각각 적절한 클래스와 인터페이스를 상속/구현하세요.
   - `Bird`는 `Animal`과 `FlyingAnimal`을 상속/구현해야 합니다.
   - `Fish`는 `Animal`과 `SwimmingAnimal`을 상속/구현해야 합니다.
   - `Duck`는 `Animal`, `FlyingAnimal`, `SwimmingAnimal` 모두를 상속/구현해야 합니다.
4. 각 클래스에 적절한 `eat()` 메서드의 구현을 추가하세요. 예를 들어,
    `Bird`는 "씨앗을 먹습니다."를 출력할 수 있습니다.
5. 메인 함수에서 각 동물의 행동을 테스트하는 코드를 작성하세요.

-- 메인함수 예시
fun main() {
    val bird = Bird("앵무새")
    val fish = Fish("금붕어")
    val duck = Duck("청둥오리")

    bird.eat()
    bird.fly()

    fish.eat()
    fish.swim()

    duck.eat()
    duck.fly()
    duck.swim()
}


-- 출력예시
앵무새가 씨앗을 먹습니다.
날개짓 합니다.
금붕어가 플랑크톤을 먹습니다.
헤엄을 칩니다.
청둥오리가 풀속에 있는 벌레를 먹습니다.
청둥오리가 물에서 날아오릅니다.
청둥오리가 연못을 헤엄칩니다.
 */
abstract class Animal(val name: String) {
    abstract fun eat()
}
interface FlyingAnimal {
    fun fly(): Unit { return println("날개짓 합니다.") }
}
interface SwimmingAnimal {
    fun swim(): Unit { return println("헤엄을 칩니다.")}
}
class Bird(name: String) : Animal(name), FlyingAnimal {
    override fun eat(){
        println("${name}가 씨앗을 먹습니다.")
    }

}
class Fish(name: String) : Animal(name), SwimmingAnimal {
    override fun eat() {
        println("${name}가 플랑크톤을 먹습니다.")
    }
}
class Duck(name: String) : Animal(name), FlyingAnimal, SwimmingAnimal {
    override fun eat() {
        println("${name}가 풀속에 있는 벌레를 먹습니다.")
    }

    override fun fly() {
        return println("${name}가 물에서 날아오릅니다.")
    }

    override fun swim() {
        return println("${name}가 연못을 헤엄칩니다.")
    }
}
fun main() {
    val bird = Bird("앵무새")
    val fish = Fish("금붕어")
    val duck = Duck("청둥오리")

    bird.eat()
    bird.fly()

    fish.eat()
    fish.swim()

    duck.eat()
    duck.fly()
    duck.swim()
}