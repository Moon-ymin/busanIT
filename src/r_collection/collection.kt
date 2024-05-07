package r_collection

fun main() {
    // filter : 조건에 맞는 요소만 추출
    val numbers: List<Int> = listOf(1,2,3,4,5,6,7,8)
    val evens = numbers.filter { number -> number % 2 == 0}
    val odds = numbers.filter { it % 2 == 1}    // 매개변수 1개면 it
    println(evens)
    println(odds)

    // map : 각 요소 변환하여 새 컬렉션
    val doubleNumbers = numbers.map{it*2}
    println(doubleNumbers)

    // flatMap : 중첩된 컬렉션 평탄화
    val nestedNumbers: List<List<Int>> = listOf(listOf(1,2,3), listOf(10, 20, 30))
    val flatNumbers = nestedNumbers.flatMap { it }
    println(flatNumbers)

    // reduce : 누적 연산 (첫 번째 요소가 초기값)
    val sumReduce = numbers.reduce { acc, i -> acc + i }    // 1 + 2 + 3 + ... + 8 = 36
    println("sumReduce = ${sumReduce}")

    // fold : 초기값을 직접 지정하고 누적 연산 수행
    val sumFold = numbers.fold(100) { acc: Int, i: Int -> acc + i}  // 100 + 1 + 2 + ... + 8 = 136
    println("sumFold = ${sumFold}")

    // groupBy : 기준에 따라 그룹화
    val words = listOf("apple", "banana", "applemango", "blueberry", "choco", "diamond", "clock")
    val groupByMap: Map<Char, List<String>> = words.groupBy { it.first() }    // 첫번째 글자로 그룹화
    println("groupByMap = ${groupByMap}")
    // {a=[apple, applemango], b=[banana, blueberry], c=[choco, clock], d=[diamond]}

    // sortedBy : 특정 기준으로 정렬
    val names = listOf("홍길동", "김수한무거북이", "독고영재")
    val sortedBy = names.sortedBy { it }
    println("sortedBy = ${sortedBy}")

    // reversed : 역순 정렬
    val reversed = sortedBy.reversed()
    println("reversed = ${reversed}")

    // sortedWith : 사용자 정의 함수 기준으로 정렬
    val sortedWithLength = names.sortedWith(compareBy { it.length })
    println("sortedWithLength = ${sortedWithLength}")

    // 특정 조건을 충족하는 여부를 확인하는 함수

    // all : 컬렉션의 모든 요소가 조건을 충족하면 true
    val isAllEven1: Boolean = numbers.all { it % 2 == 0 } // 모든 요소가 짝수이면 참  false
    val isAllEven2: Boolean = evens.all { it % 2 == 0 } // 모든 요소가 짝수이면 참    true

    println("isAllEven1 = ${isAllEven1}, isAllEven2 = ${isAllEven2}")

    // none : 컬렉션의 모든 요소가 조건을 충족하지 않으면 true
    val isNoneEven = odds.none { it % 2 == 0 }
    println("isNoneEven = ${isNoneEven}")

    // any : 컬렉션의 하나의 요소라도 조건을 충족하면 true
    val isAnyEven = numbers.any { it % 2 == 0 }
    println("isAnyEven = ${isAnyEven}")

}