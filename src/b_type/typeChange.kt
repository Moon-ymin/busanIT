package b_type

fun main() {
    // 자료형 반환
    var number: Int = 50
    // 자바의 더 큰 범위로 타입 변환(프로모션) 발생하지 않음
    // 명시적으로 타입 변환 필요
    var bigNumber: Long = number.toLong()

    // 명시적 변환으로 다운 캐스팅
    var ByteNumber: Byte = number.toByte()

    // 문자열로 변경하고 싶을 경우
    var string: String = number.toString()

    // 변환 타입에 맞는 값이 아닐 경우 런타입 Exception 발생
    val name: String = "홍길동"
    // val name: String = "100"
    val longNumber: Long = name.toLong()
    println(longNumber)
}