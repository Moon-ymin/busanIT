package b_type

fun main() {
    // 타입 추론
    // 명시적으로 타입을 선언하지 않으면, 컴파일러가 타입을 추론
    var name = "홍길동"
    var age = 30
    var isAdult = true

    // name = 30   // 추론된 Type 이 String 이기 때문에 문자열만 대입 가능
    name = "전우치"
    // age = "홍길동" // 추론된 Type이 Int 이기 때문에 숫자만 대입 가능
    age = 40

    // 명시적 타입 표시
    val byte: Byte = 127    // 예약어를 변수명으로 사용한 거 아님?
    val int: Int = 12345678
    val long: Long = 1234564523L

    // 코틀린에서는 원시타입(Primitive Type) 예약어가 존재하지 않는다
    // 정수 : Byte, Short, Int, Long
    // 실수 : Float, Double
    // 논리 : Boolean
    // 문자 : Char, String

    // 코드에서는 평범한 클래스로 보이지만 실행 시점에 Primitive Type 으로 실행
    // Boxing, Unboxing 고려 없이 코틀린이 알아서 처리

    val longVal = 100L      // Long 타입으로 추론
    val floatBal = 12.34F   // Float 타입으로 추론
    val doubleVal = 12.34   // Double 타입으로 추론
    val charVal = 'A'       // Char 타입으로 추론

    // 특수 자료형
    // 1. Any : 모든 클래스의 최상위 루트 클래스 (자바의 Object에 해당)
    var hello: Any = "Hello Kotlin"
    // Any 클래스는 hashCode(), toString(), equals() 메서드 제공
    hello.hashCode()
    hello.toString()
    hello.equals("Hello")
    // 모든 코틀린 객체를 담을 수 있고, 모든 객체는 Any를 상속받는다
    hello = 10
    hello = true

    // 2. Unit 타입 : 함수가 아무 값을 리턴하지 않을 때 (자바의 void 에 해당)
    fun printHello(message: String): Unit {
        println(message)
    }
    // Unit을 선언하지 않고 생략해도 컴파일러가 이해

    // 3. Nothing 타입 : 함수가 정상적으로 종료되지 않음(예외 발생, 무한 루프 등)
    fun failFunction(message: String): Nothing {
        // 리턴값이 없이 예외 발생 등
        throw IllegalStateException(message)
    }
}