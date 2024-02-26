package polymorphism;

public class Polymorphism6 {
    public static void main(String[] args) {
        // 부모타입 변수 / 실제 인스턴스 = 부모 객체
        SuperClass superClass1 = new SuperClass();
        // 부모타입 변수 / 실제 인스턴스 = 자식 객체
        SuperClass superClass2 = new SubClass();

        // 다형적 참조 타입에 따라서 기능을 다르게 호출
        method(superClass1);
        method(superClass2);
    }

    static void method(SuperClass superClass) {
        // 기존 기능 사용
        superClass.superMethod();

        // instanceof 연산자
        // 객체가 특정 클래스의 인스턴스인지 확인하는데 사용
        // 특정 클래스(또는 하위 클래스)일 경우에 true, 아닐 경우에 false

        // 자식클래스인 경우 확장 기능 사용 : 다운캐스팅
        if (superClass instanceof SubClass) {
            SubClass subClass = (SubClass) superClass;
            subClass.subMethod();
        }
        // 아닌 경우 : 통과하여 런타임 오류 차단
    }
}