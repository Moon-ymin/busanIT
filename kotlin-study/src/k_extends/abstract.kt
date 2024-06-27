package k_extends

// 추상 클래스 : open 키워드가 없어도 상속 가능
abstract class Vehicle {
    // 추상 메서드 : 상속 받은 클래스에서 구현
    abstract fun drive(): String
}

class Car : Vehicle() {
    override fun drive(): String {
        return "차를 운전합니다."
    }
}

class Truck : Vehicle() {
    override fun drive(): String {
        return "트럭을 운전합니다."
    }
}

fun main() {
    val car: Vehicle = Car()
    val truck: Vehicle = Truck()

    println(car.drive())
    println(truck.drive())
}