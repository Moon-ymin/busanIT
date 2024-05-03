package p_extension

// 시간을 재는 성능 측정 함수
// inline 함수이기 때문에 실제 동작시 함수 본문이 호출 지점에 직접 삽입됨
// 람다 표현식을 매개변수로 사용하여, 구현부는 호출 지점에 맡김
inline fun measureTime(block: () -> Unit) {
    val start = System.nanoTime()
    // ...
    block()
    val end = System.nanoTime()
    println("소요 시간 : ${end - start} ns")
}
fun main() {
    measureTime {
        for (i in 1..1000) {
            var num = i * i * i
        }
    }
}