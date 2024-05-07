package q_lambda

import java.util.*

// closure

fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    // 결과를 담을 빈 리스트
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter.invoke(fruit)) {     // 람다식의 결과가 참인 경우
            results.add(fruit)          // 결과 리스트에 객체를 추가
        }
    }
    return results                      // 결과 리스트를 반환
}

fun main() {
    val fruits = Arrays.asList(
        Fruit("사과", 3000),
        Fruit("사과", 4000),
        Fruit("사과", 5000),
        Fruit("포도", 6000),
        Fruit("바나나", 3000)
    )

    // Java의 코드와 동일하게 사용
    var targetFruitName = "사과"
    targetFruitName = "바나나"

    // 변경되는 외부 변수를 사용하였지만, 아무런 문제 없이 동작
    // 클로저 : 람다가 시작되는 지점에 참조하고 있는 변수들을 모두 포획(캡처)
    // 람다가 일급 시민처럼 사용될 수 있음.
    //filterFruits(fruits, { fruit: Fruit -> fruit.name == targetFruitName })
    // filterFruits(fruits) { fruit: Fruit -> fruit.name == targetFruitName }
    val filterFruits = filterFruits(fruits) { it.name == targetFruitName }

    for (fruit in filterFruits) {
        println("${fruit.name} : ${fruit.price}")
    }

}