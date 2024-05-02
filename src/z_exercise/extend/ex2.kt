package z_exercise.extend

/*
### 문제 2: 인터페이스 상속 충돌 해결

요구 사항:
1. `Camera`와 `Phone` 두 개의 인터페이스를 생성하세요.
   - `Camera`에는 `takePhoto()`라는 메서드가 있으며, 기본 구현으로 "사진을 찍습니다."를
   출력하도록 설정하세요.
   - `Phone`에는 `makeCall()` 메서드와 `takePhoto()` 메서드가 있으며, `takePhoto()`는
   "폰으로 사진을 찍습니다."을 출력하도록 기본 구현을 설정하세요.
2. `Smartphone` 클래스를 생성하고 두 인터페이스를 구현하세요. `takePhoto()` 메서드에서
   발생하는 충돌을 해결하여, 스마트폰의 카메라를 사용해 사진을 찍는 것을 표현하세요.
3. 메인 함수에서 `Smartphone` 클래스의 `makeCall()`과 `takePhoto()`를 호출하여 결과를
  확인하세요.
 */

interface  Camera {
    fun takePhoto() = println("사진을 찍습니다.")
}
interface Phone {
    fun makeCall()
    fun takePhoto() = println("폰으로 사진을 찍습니다.")
}
class Smartphone : Camera, Phone {
    override fun takePhoto() {
        super<Phone>.takePhoto()
    }

    override fun makeCall() {
        println("스마트 폰으로 전화를 겁니다.")
    }
}
fun main() {
    val smartphone = Smartphone()
    smartphone.makeCall()
    smartphone.takePhoto()
}
