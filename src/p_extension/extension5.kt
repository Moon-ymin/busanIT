package p_extension

// 확장 프로퍼티
val String.firstChar: Char
    get() = this[0]

fun main() {
    "홍길동".lastChar()        // 확장함수
    "홍길동".firstChar         // 확장 프로퍼티
    // String 클래스의 새로운 프로퍼티를 추가해서
    // 커스텀 게터를 통해 값을 가져옴
    // 실제로 특정 클래스에 필드를 추가하지는 않고,
    // 메모리(힙)에도 존재하지 않고, 단순히 게터를 통해 값을 가져옴
    println("홍길동".firstChar)
}