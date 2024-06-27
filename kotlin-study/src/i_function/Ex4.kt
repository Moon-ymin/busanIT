package i_function

/*
### 연습문제 4: 시간 간격을 초로 변환 (Named Arguments)

문제 설명
- 아래는 주어진 시간 간격을 시간, 분, 초 단위로 입력받아 이를 초 단위로 변환하는 함수입니다.
- 대부분의 경우 모든 매개변수를 입력하지 않고, 하나 또는 두 개의 매개변수만 사용합니다.
- 나머지 매개변수는 기본적으로 0을 가정해야 합니다.
- 이 함수를 기본 매개변수 값과 이름있는 인자를 사용하여 구현하고, 코드의 가독성을 향상시키세요.

// 수정 전 코드
fun intervalInSeconds(hours: Int, minutes: Int, seconds: Int) =
    ((hours * 60) + minutes) * 60 + seconds

fun main() {
    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(0, 1, 25))
    println(intervalInSeconds(2, 0, 0))
    println(intervalInSeconds(0, 10, 0))
    println(intervalInSeconds(1, 0, 1))
}
 */
fun intervalInSeconds(hours: Int=0, minutes: Int=0, seconds: Int=0) =
    ((hours * 60) + minutes) * 60 + seconds
fun main() {
    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(minutes = 1, seconds = 25))
    println(intervalInSeconds(hours = 2))
    println(intervalInSeconds(minutes = 10))
    println(intervalInSeconds(hours = 1, seconds = 1))
}