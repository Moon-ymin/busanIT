package polymorphism;

public class Polymorphism1 {
    public static void main(String[] args) {
        // 부모 타입의 변수 (= 참조) 부모 타입의 객체
        SuperClass superClass = new SuperClass();
        superClass.superMethod();

        // 자식 타입의 변수 (참조) 자식 타입의 객체
        SubClass subClass = new SubClass();
        subClass.subMethod();   // 자기 자신의 메서드
        subClass.superMethod(); // 상속 : 부모의 메서드

        // 부모 타입의 변수가 자식 타입의 객체를 참조 => 다형적 참조
        SuperClass polymorph = new SubClass();
        polymorph.superMethod(); // 부모 변수 타입의 메서드 호출 가능
//        polymorph.subMethod();  // 자식 타입의 메서드 호출 불가

        // 자식 타입의 변수는 부모 객체를 담을 수 없다
//        SubClass polymorph2 = new SuperClass();   // 컴파일 오류

    }
}
