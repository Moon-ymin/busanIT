package b_type

fun main() {
    // null 가능성
    // 코틀린의 변수는 기본적으로 null을 허용하지 않음
    // 코틀린 설계 목표 중 하나 : NPE 방지

    // 일반 변수에는 null 이 들어가지 않음
    var number = 3000L
    // number = null    // 컴파일 에러 발생

    // 타입 뒤에 ?가 붙는 널 가능 타입은 null을 담을 수 있음
    var numberNullable: Long? = 300L
    numberNullable = null
}