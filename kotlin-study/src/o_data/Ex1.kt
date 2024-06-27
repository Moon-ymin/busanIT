package o_data

import java.lang.foreign.SymbolLookup

/*
### 연습문제 Enum 클래스 만들기

요구사항 1. 기본 Enum 클래스 만들기
코틀린에서 `DayOfWeek`라는 이름의 `enum` 클래스를 생성하세요.
이 클래스는 요일을 나타내며, 각 요일은
`MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, `SUNDAY`로 정의됩니다.

요구사항 2: Enum 프로퍼티 추가
문제:
앞서 만든 `DayOfWeek` `enum` 클래스에 각 요일이 주말인지 평일인지를 나타내는
`isWeekend` 불리언(boolean) 프로퍼티를 추가하세요.
`SATURDAY`와 `SUNDAY`는 주말로 `true`를, 나머지 요일은 `false`를 가집니다.

요구사항 3: Enum 메서드 추가
문제:
`DayOfWeek` 클래스에 `printDayType()` 메소드를 추가하세요.
이 메소드는 요일이 주말인지 평일인지에 따라 "Weekend" 또는 "Weekday"를 출력합니다.

요구사항 4: Enum과 When 사용
문제:
`DayOfWeek` enum을 사용하여, 입력받은 `DayOfWeek` 값에 따라 다른 활동을 추천하는
함수 `recommendActivity(day: DayOfWeek)`를 작성하세요.
예를 들어, `SATURDAY`에는 "산책하기", `SUNDAY`에는 "책 읽기" 등 요일별로 다른 활동을 추천하세요.
 */

enum class DayOfWeek(val isWeekend: Boolean = false) {
    MONDAY(), TUESDAY(), WEDNESDAY(),
    THURSDAY(), FRIDAY(),
    SATURDAY(true), SUNDAY(true);

    fun printType() {
        if (isWeekend) {
            println("Weekend")
        } else {
            println("Weekday")
        }
    }
}
private fun recommendActivity(day: DayOfWeek) {
    when (day) {
        DayOfWeek.SATURDAY -> println("산책하기")
        DayOfWeek.SUNDAY -> println("책 읽기")
        DayOfWeek.MONDAY -> println("회사 가기")
        DayOfWeek.TUESDAY -> println("장 보기")
        DayOfWeek.WEDNESDAY -> println("일찍 자기")
        DayOfWeek.THURSDAY -> println("운동 가기")
        DayOfWeek.FRIDAY -> println("TV 보기")
    }
}

fun main() {
    val sunday = DayOfWeek.SUNDAY
    val isWeekend: Boolean = sunday.isWeekend
    sunday.printType()
    DayOfWeek.THURSDAY.printType()
    recommendActivity(DayOfWeek.THURSDAY)
}