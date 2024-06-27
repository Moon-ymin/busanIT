package f_excercise

/* 연습문제 8: 요일별 메시지 출력

문제:
주어진 요일 리스트에 대해 각 요일이 평일인지 주말인지에 따라 다른 메시지를 출력하는 프로그램을 작성하세요.
이 문제는 코틀린의 `for` 반복문과 `when` 조건문을 함께 사용하여 해결할 수 있습니다.

요구사항:
- 요일 리스트 `days`는
`listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")`로 주어집니다.
- 각 요일에 대해 평일이면 "평일입니다."를 출력하고, 주말이면 "주말입니다!"를 출력하세요.

실행 예시:
```
Monday: 평일입니다.
Tuesday: 평일입니다.
...
Saturday: 주말입니다!
Sunday: 주말입니다!
```
 */
fun main() {
    val days = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val weekend = listOf ("Saturday", "Sunday")
    for(day in days) {
        when (day) {
            in weekend -> println("${day}: 주말입니다!")
            else -> println("${day}: 평일입니다.")
        }

    }
}