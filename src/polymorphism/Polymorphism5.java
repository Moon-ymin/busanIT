package polymorphism;

public class Polymorphism5 {
    public static void main(String[] args) {
        // 업 캐스팅 : 항상 안전하고 암시적으로 타입 변환이 이루어짐


        // 자식 타입 변수 = 자식 타입 객체
        SubClass subClass = new SubClass();
        // 업 캐스팅 : 부모 타입에 자식 객체(자식 타입 변수)
        SuperClass superClass = (SuperClass) subClass;
        // 캐스팅 연산자는 생략 가능 -> 대부분 생략
        SuperClass superClass1 = subClass;

        // 업캐스팅 되기 전 : 모든 기능 사용 가능
        subClass.superMethod();
        subClass.subMethod();

        // 업캐스팅 되고 난 후 : 확장된 기능은 사용 불가
        superClass.superMethod();
//        superClass.subMethod();

    }
}
