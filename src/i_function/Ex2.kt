package i_function

/*
### 연습문제 2: 인사말 생성기

#### 문제 설명
사용자의 이름과 옵션으로 시간(오전/오후)을 입력받아, 적절한 인사말을 반환하는 함수를 작성하세요.
시간은 기본값으로 "오전"을 가집니다.

#### 요구사항
- 함수 이름은 `greet`로 하세요.
- 이름은 필수로 받으며, 시간은 기본값을 사용할 수 있어야 합니다.
- "오전"일 경우 "Good morning, [name]!"을, "오후"일 경우 "Good afternoon, [name]!"을 반환하세요.
 */

fun greet(name: String, timeOfDay: String = "오전"): String {
    return if (timeOfDay == "오전") "Good Morning! $name" else "Good Afternoon! $name"
}
fun main() {
    println(greet("길동"))
    println(greet("몽룡", "오후"))
}