package m_object

// 싱글턴 패턴
// 단 하나의 인스턴스만 존재
object Singleton {
    var count = 0
    fun increment() { count++ }
}

fun main() {
    // Singleton()      // 생성자 호출 불가
    Singleton.increment()
    Singleton.increment()
    println(Singleton.count)
}