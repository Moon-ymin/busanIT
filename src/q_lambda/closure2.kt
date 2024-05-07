package q_lambda

fun counter(): () -> Int {
    var count = 0
    return {count++}
    // 매개변수가 없고 반환타입이 정수인 람다식을 리턴
    // 클로저에 의해서 `count` 라고 하는 람다식 외부의 변수가 캡쳐됨
}

fun main() {
    // counter 함수는 람다 함수(counter 내부에 있는 함수) 를 반환하고,
    // 내부 함수는 count 변수를 캡처
    // counter() 함수가 종료된 이후에도 counter1 람다 함수를 통해 count 변수가 계속해서 증가하는 것을 확인 가능 (생성될 때의 환경을 기억)
    val counter1: () -> Int = counter()
    println(counter1())         // 출력 : 0
    println(counter1())         // 출력 : 1
    println(counter1())         // 출력 : 2

    // counter()가 호출되는 순간 생성되는 순간의 환경(var count=0)을 기억
    val counter2 = counter()
    println(counter2())     // 0
    println(counter2())     // 1
    println(counter2())     // 2
}

