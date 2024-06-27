package p_extension

fun registerUser(name: String, age: Int) {
    // 유효성 검증 로직
    fun validateInput(input: String) {
        if (input.isNullOrEmpty()) {
            throw IllegalArgumentException("유효한 입력이 아닙니다.")
        }
        if (input.length > 100) {
            throw IllegalArgumentException("너무 긴 이름입니다.")
        }
    }

    validateInput(name)  // 이름에 대한 유효성 검사

    if (age < 18) {
        throw IllegalArgumentException("나이는 19세 이상이어야 합니다.")
    }

    println("회원이 가입되었습니다 : $name, $age 세")
}

fun main() {
    registerUser("홍길동", 30)     // 정상 입력
    try {
        registerUser("", 30)      // 비정상 입력
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
    // 지역함수는 해당 지역에서만 호출 가능
    // validationInput("abcd")

}