package f_excercise

/*
연습문제 9: 피즈버즈 문제

문제:
1부터 100까지의 숫자를 출력하되, 다음 조건을 만족해야 합니다:
- 숫자가 3의 배수이면 "Fizz"를 출력합니다.
- 숫자가 5의 배수이면 "Buzz"를 출력합니다.
- 숫자가 3과 5의 공배수이면 "FizzBuzz"를 출력합니다.
- 그 외의 숫자는 숫자 그대로 출력합니다.

요구사항:
- `for` 반복문과 `when` 조건문을 사용하여 문제를 해결하세요.

실행 예시 (출력의 일부분):
```
1
2
Fizz
4
Buzz
Fizz
7
...
14
FizzBuzz
16
...
```
 */
fun main() {
    for (i in 1..100) {
        when {
            i % 15 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }
}