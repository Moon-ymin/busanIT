package q_lambda

fun main() {
    // 람다식 기본 구조
    // 매개변수가 2개인 경우
    val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

    // 매개변수가 없는 경우  : 매개변수 부분 생략
    val greet: () -> Unit = { println("안녕하세요~") }

    // 매개변수가 1개인 경우 : 매개변수 생략 it 키워드 지정
    val square = { x: Int -> x * x }
    val square2: (Int) -> Int = { it * it }

    // 마지막 줄의 표현식은 return 키워드 없이 자동으로 리턴값
    val add = { x: Int, y: Int ->
        println("${x} 와 ${y} 를 더합니다. ${x + y}")
        x + y       // 마지막 줄이 리턴 값
    }

    // 람다 호출
    println(sum(1, 2))
    greet()
    println("${square(3)} ${square2(3)}")
    println(add(3, 4))

    // 고차함수
    // 함수를 인자로 받는 고차함수
    fun operateNumber(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }

    println(operateNumber(5, 6, sum))     // 람다함수 변수를 대입
    println(operateNumber(7, 8) { a, b -> a * b })  // 람다함수를 직접 대입

    // 고차함수에서 매개변수가 없는 람다 사용
    fun executeTwice(action: () -> Unit) {
        action()
        action()
    }

    executeTwice { println("안녕하세요, 저는 두번 말해요.") }

}