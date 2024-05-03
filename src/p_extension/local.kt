package p_extension

// 지역함수
fun main() {
    val name = "코틀린"

    // 함수 내부에 함수 선언 가능
    fun kotlinFun() {
        println("안녕하세요 ${name}")        // 외부 함수의 자원 사용
    }

    kotlinFun() // 정의된 내부에서 호출 가능
}
// kotlinFun() // 정의된 함수 외부에서는 사용 불가