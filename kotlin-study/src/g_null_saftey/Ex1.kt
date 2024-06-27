package g_null_saftey

/*
연습문제: 사용자 도시 정보 입력 받기
문제 설명
사용자로부터 도시 이름을 입력받고, 해당 도시의 인구를 출력하는 프로그램을 작성하세요.
사용자가 아무 것도 입력하지 않거나 공백만 입력한 경우,
"알 수 없는 도시"라고 출력하고 프로그램을 종료하세요.

요구사항
- 사용자로부터 도시 이름을 입력받습니다.
- 입력받은 도시 이름이 널이거나 공백인 경우, "알 수 없는 도시"라고 출력하고
프로그램을 종료합니다.
- 널 안전성을 활용하여 입력값을 검증합니다.
- 입력받은 도시 이름에 따라 저장된 인구 정보를 출력합니다.
인구 정보가 없는 경우 "인구 정보가 없습니다."라고 출력합니다.

- 예상 입력 및 출력

사용자 입력: "Seoul"
출력: "Seoul의 인구는 10,000,000명입니다."
사용자 입력: "" (공백)
출력: "알 수 없는 도시"
사용자 입력: "New York"
출력: "인구 정보가 없습니다."
 */
fun main() {
    print("도시 이름을 입력하세요: ")
    val city:String? = readLine()

    // 입력받은 값이 null 이거나 empty("") 처리
    if (city.isNullOrEmpty()) {
        println("알 수 없는 도시")
        return
    }

    val cityPopulation: Map<String, String> = mapOf(
        "Seoul" to "10,000,000",
        "Tokyo" to "9,000,000"
    )

    val message = cityPopulation[city] ?: "인구 정보가 없습니다."
    println(message)




}