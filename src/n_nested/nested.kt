package n_nested

class Outer {
    private val number: Int = 1

    // 중첩 클래스 : 클래스 내부에 클래스 선언
    // 키워드 선언 없이 사용 (클래스 안에 클래스를 만들때의 권장사항)
    // Java에서는 static 키워드를 붙인 경우에 해당
    class Nested {
        fun function() = 2    // number + 1
        // 중첩 클래스에서는 바깥 클래스의 멤버에 접근할 수 없음
        // val nestedNumber = number + 1
    }

    // 내부 클래스 (비권장사항)
    // 내부 클래스가 외부 클래스의 정부를 가지고 있어서 메모리 누수 위험
    // 코틀린에서는 inner 키워드를 사용하지 않으면 모두 중첩 클래스
    inner class Inner {
        // 바깥 클래스를 참조하는 내부 클래스에 같은 이름의 프로퍼티나 메서드가 있을 경우
        // 이름의 혼란이 생김.
        private val number = 10
        fun function() = number + 1

        fun ref() {     // 같은 이름의 멤버 참조
            println("바깥 클래스의 number : ${this@Outer.number}")
            println("안쪽 클래스의 number : ${this.number}")
        }
    }
}

fun main() {
    // Outer 클래스의 인스턴스 생성 없이 중첩 클래스를 접근하고 생성 가능
    val nested = Outer.Nested()
    println(nested.function())

    // 내부 클래스는 바깥 클래스의 인스턴스 생성 없이 생성 불가
    // val inner = Outer.Inner()
    val inner =  Outer().Inner()
    println(inner.function())    // 바깥 인스턴스의 멤버에 내부 클래스의 멤버가 접근 가능
    inner.ref()
}