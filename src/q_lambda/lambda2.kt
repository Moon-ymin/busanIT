package q_lambda

// 람다 선언 단계
fun printList1(items: List<Int>) {
    // 람다함수들을 매개변수로 받는 함수 (고차함수)
    items.forEach( {item -> println(item)})
}

fun printList2(items: List<Int>) {
    // 코틀린에서 마지막 인자가 람다 표현식인 경우, 람다를 괄호 밖으로 뺄 수 있음
    // 후행 람다 trailing lambda
    // 코틀린에서 람다 고차함수를 사용할 때 권장되는 방식
    items.forEach{ item -> println(item) }
}
fun printList3(items: List<Int>) {
    // 매개변수가 하나인 경우 매개변수를 생략할 수 있음
    // 암시적 이름으로 `it` 키워드를 사용함.
    items.forEach{println(it)}
}

val printItem: (Int) -> Unit = { println(it) }
fun printList4(items: List<Int>) {
    // 람다 표현식을 변수에 할당
    // 변수의 타입으로 함수의 타입을 지정

    items.forEach(printItem)
}

fun printList5(items: List<Int>) {
    // 메서드 참조 : 함수나 프로퍼티 이름 앞에 `::` 를 붙여 메서드를 직접 참조 가능
    items.forEach(::println)
}

fun main() {
    val intList = listOf(1, 2, 3, 4)
    printList1(intList)
    printList2(intList)
    printList3(intList)
    printList4(intList)
    printList5(intList)
}