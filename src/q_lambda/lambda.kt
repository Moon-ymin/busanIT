package q_lambda

fun main() {
    // hello -> HELLO
    println("hello".uppercase())        // 메서드 호출
    println(uppercaseString("hello"))   // 이름있는 함수

    // 이름이 없는 익명 함수 : lambda
    println({string: String -> string.uppercase()}("hello"))

    // 일급 시민인 함수는 변수에 할당될 수 있음
    val upperCase = {string: String -> string.uppercase()}
    println(upperCase("hello"))
}

fun uppercaseString(string: String): String {
    return string.uppercase()
}