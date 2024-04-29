package f_excercise
/*
연습문제 7: 사용자 역할 확인

문제:
사용자의 역할에 따라 시스템 접근 권한을 확인하는 프로그램을 작성하세요.
`when` 구문을 사용하여 사용자의 역할에 따라 다른 접근 권한을 출력합니다.

요구사항:
- 변수 `userRole`을 선언하고, 사용자의 역할을 나타내는 문자열("admin", "editor", "guest")
중 하나를 할당하세요.
- `userRole`에 따라 다음과 같이 접근 권한을 출력하세요:
  - "admin": "모든 접근 권한이 있습니다."
  - "editor": "콘텐츠 수정 권한이 있습니다."
  - "guest": "읽기 권한만 있습니다."
  - 기타: "알 수 없는 역할입니다."

실행 예시:
```
모든 접근 권한이 있습니다.
```
 */
fun main() {
    val userRole: String = "admin"
    when (userRole) {
        "admin" -> println("모든 접근 권한이 있습니다.")
        "editor" -> println("콘텐츠 수정 권한이 있습니다.")
        "guest" -> println("읽기 권한만 있습니다.")
        else -> println("알 수 없는 역할입니다.")
    }
}
