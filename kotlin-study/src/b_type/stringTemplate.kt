package b_type

fun main() {
    // 자바에서 문자열을 출력하는 방식
    val name = "홍길동"
    val age = 30
    println("이름은 " + name + "이고, 나이는 " + age + "입니다.")

    // 문자열 템플릿
    println("이름은 $name 이고, 나이는 $age 입니다.")

    // ${ }를 통해서 문자열 내부에 표현식을 포함할 수 있음.
    println("이름은 ${name}이고, 나이는 ${age * 2}입니다.")
}