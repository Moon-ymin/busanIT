package polymorphism;

public class Polymorphism4 {
    public static void main(String[] args) {
        // 다운 캐스팅의 위험성
        // 본래 객체에 맞는 다운 캐스팅은 오류 없이 수행되지만,
        // 본래 객체와 다른 다운 캐스팅은 런타임 오류가 발생한다. (컴파일 오류가 발생하지 않기에 개발자가 신경을 써야 한다.)

        // 1. 부모 타입 변수 = 자식 타입 객체
        SuperClass superClass = new SubClass();
        // 부모 타입 변수에 (자식 타입 객체를 부모 타입 변수로 참조한 변수를 대입)
        // 타입이 달라 컴파일 에러 -> 다운캐스팅을 통해 대입
        SubClass subClass = (SubClass) superClass; // 다운 캐스팅
        subClass.subMethod();

        // 2. 부모 타입 변수 = 부모 타입 객체
        SuperClass superClass1 = new SuperClass();
        // 자식 타입 변수에 대입하려는 경우, 자식 클래스에 대한 정보를 알 수 없기 때문에,
        // 심각한 런타임 오류 발생
//        SubClass subClass1 = (SubClass) superClass1(); // ClassCastException
//        subClass1.superMethod();

    }
}
