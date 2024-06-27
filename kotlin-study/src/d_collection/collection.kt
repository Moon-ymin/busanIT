package d_collection

fun main() {
    // List, Set, Map
    // 컬렉션은 불변(immutable) 컬렉션과 가변(mutable) 컬렉션으로 구분

    // 불변 컬렉션 생성
    val immutableList = listOf("사과", "바나나", "오렌지")
    // 읽기는 가능하지만 수정은 불가능
    println(immutableList[1])
    // immutableList.add() 변경 불가

    // 가변 컬렉션 생성
    val mutableList = mutableListOf("사과", "바나나", "오렌지")
    mutableList.add("복숭아")  // 변경 가능
    println(mutableList[3])     // 인덱싱 연산자
    println(mutableList.get(3)) // get 메서드

    // Set
    val immutableSet = setOf("가", "나", "나", "다")
    println(immutableSet)   // 중복 허용 불가

    val mutableSet = mutableSetOf("가", "나", "나", "다")
    mutableSet.add("라")
    println(mutableSet)

    // Map
    // Key와 값을 key to value 로 입력
    val immutableMap = mapOf(1 to "홍길동", 2 to "전우치")
    println(immutableMap)

    val mutableMap = mutableMapOf(1 to "홍길동", 2 to "전우치")
    mutableMap.put(3, "임꺽정")
    mutableMap[4] = "유관순"
    println(mutableMap)
}