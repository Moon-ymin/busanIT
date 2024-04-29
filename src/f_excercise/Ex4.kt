package f_excercise

/*
연습문제 4: 맵의 활용

문제:
`Map`을 생성하고 특정 작업을 수행하여 결과를 출력하세요.

요구사항:
1. 문자열을 키로 하고 정수를 값으로 하는 맵 `ages`를 생성하고, 초기값으로 `{"Tom": 30, "Jane": 25}`를 할당하세요.
2. 맵에 `"Sam"`의 나이 `28`을 추가하세요.
3. `"Jane"`의 나이를 `26`으로 업데이트하세요.
4. 모든 엔트리를 출력하세요.

실행 예시:
```
초기 맵: {Tom=30, Jane=25}
수정 후 맵: {Tom=30, Jane=26, Sam=28}
 */
fun main() {
    val ages = mutableMapOf("Tom" to 30, "Jane" to 25)
    println("초기 맵: $ages")
    ages.put("Sam", 28) // ages["Sam"] = 28
    ages["Jane"] = 26
    print("수정 후 맵: $ages")
}
