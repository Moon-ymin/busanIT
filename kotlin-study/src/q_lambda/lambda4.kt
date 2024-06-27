package q_lambda

// 고차함수 : 리턴 타입으로 함수를 반환하는 고차함수
fun getOperation(operator: String): (Int, Int) -> Int {
    return when (operator) {
        "add", "더하기", "+" -> { a, b -> a + b }
        "sub", "빼기", "-" -> { a, b -> a - b }
        "mul", "곱하기", "*" -> { a, b -> a * b }
        "div", "나누기", "/" -> { a, b -> a / b }
        else -> { _, _ -> 0 }
    }
}

fun main() {
    val addFunction = getOperation("+")
    println(addFunction(10, 20))

    val subFunction = getOperation("빼기")
    println(subFunction(30, 15))
    println(subFunction(100, 50))   // 코드 및 함수 재사용

    // 반환 값으로 받은 함수를 매개변수를 붙여 호출
    println(getOperation("mul")(2, 3))

    val divFunction = getOperation("나누기")

    // 람다를 호출하는 법
    println(divFunction.invoke(10, 5)) // 2
    println(divFunction(10, 5)) // 2
}