package m_object

// 기본 생성자의 접근제한을 private으로 하고 싶을 경우 constructor 키워드 명시해야 함
class MathUtil private constructor () {
    // companion object 내부 메서드는 Java 의 static 메서드처럼 사용된다.
    companion object {
        fun add(a: Int, b: Int): Int = a + b
    }
}
fun main() {
    println(MathUtil.add(1, 2))
}