package h_exception

// 자바와 동일한 방식의 예외처리 try-catch-finally
fun main() {
    try {
        // 위험한 코드
        val numbers = listOf(1, 2, 3)
        numbers[1]
        // 타입 선언 순서 => 코틀린 방식
    } catch (e: IndexOutOfBoundsException ) {
        // 잡았을 때
        println(e.message)
        // 예외 발생시키기
        throw Exception("예외 발생")
    } finally {
        println("반드시 실행")
    }
}