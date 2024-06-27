package g_null_saftey

// 코틀린의 변수는 기본적으로 null을 허용하지 않는다.
// 잠재적인 NPE 문제에 대해서 안전성을 갖춤.
// null값이 필요한 경우 명시적으로 선언
// null값이 포함될 수 있는 속성이나 함수는 Safety Call을 통해서 호출
// null값이 감지될 경우 어떻게 할지 선언

fun main() {
    // non-nullable 타입 (널 불가능 타입)
    var name:String = "홍길동"
    // name = null     // 코틀린의 변수는 기본적으로 null을 허용하지 않는다.

    // nullable 타입 : 널 가능 타입, 변수 타입 선언 뒤에 '?'
    var age:Int? = 30
    age = null

    // Safety Call
    // null값이 포함될 수 있는 속성이나 함수는 Safety Call을 통해서 호출
    // 안전 호출 연산자 `?.`을 통해서 nullable에 접근
    var address:String? = "부산"
    // Java : 만약 null일 경우 null.length => NPE 발생
    println(address?.length)   // null이 아닌경우 값

    address = null
    println(address?.length)   // null인 경우 null
    // 안전호출 연산자 뒷부분을 수행하지 않음.
}