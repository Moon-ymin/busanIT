package polymorphism;

public class Polymorphism3 {
    public static void main(String[] args) {
        // 일시적으로 다운 캐스팅을 사용하는 경우
        SuperClass superClass = new SubClass(); // 다형적 참조
        // 부모 타입의 변수 = 자식 타입의 객체
        superClass.superMethod();
        // 일시적으로 다운캐스팅을 사용하여 하위(확장된)클래스의 기능 호출 가능
        ((SubClass) superClass).subMethod();
    }
}
