package e_control

// for문
fun main() {
    // Java 방식
    // for (int i = 1; i <= 10; i++) { ... }

    // 코틀린 : 주로 범위 연산자로 변수값 증감 (수학의 등차수열 차용)
    var sum = 0

    for (i in 1..10) {      // 마지막 값 포함
        sum += i
    }
    println("1부터 10까지 합계: $sum")

    // until : 1씩 증가 마지막 불포함
    sum = 0
    for (i in 1 until 10) {  // 마지막 값 포함하지 않음
        sum += i
    }
    println("1부터 9까지 합계: $sum")

    sum = 0
    // step : 반복의 간격을 지정하고 싶을 때
    for (i in 2..10 step 2) {
        sum += i
    }
    println("1부터 10까지 짝수 합계: $sum")

    // downTo : 1씩 감소
    for (i in 10 downTo 1) {
        print("$i ")
    }

    // 향상된 for문 : for-each문 사용 가능
    println()
    val list = listOf(10, 20, 30, 40)
    for (i in list) {
        print("$i ")
    }

    println()

    // while문 java와 동일하게 사용 가능
    var i = 1
    while (i <= 10) {
        print("$i ")
        i++
    }



}