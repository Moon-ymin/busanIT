package p_extension.ex

/*
### 확장 함수 만들기

요구사항:
1. `String` 클래스에 `startsWithChar`라는 확장 함수를 추가합니다.
2. 이 함수는 문자 하나를 파라미터로 받고, 문자열이 해당 문자로 시작하는지 boolean 값으로 반환합니다.
 */
fun main() {
    val text = "kotlin"
    println(text.startsWithChar('k'))  // 출력: true
    println(text.startsWithChar('c'))  // 출력: false
}

fun String.startsWithChar(other: Char): Boolean {
    return if (this.isNotEmpty()) {
        this[0].lowercase() == other.lowercase()    // 대소문자 구분 없게 하기
    } else {
        false
    }
    // return this[0].lowercase() == char.lowercase()
}