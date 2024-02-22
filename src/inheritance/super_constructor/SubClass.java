package inheritance.super_constructor;

public class SubClass extends SuperClass{
    // 상속을 받으면, 생성자의 첫줄에 super(...)를 사용해서 부모 클래스 생성자를 호출해야한다
    // 매개변수가 없는 생성자(기본 생성자)의 경우 super()의 생략이 가능하다
    public SubClass() {
        super(100 ); // 부모 생성자 호출 (생략 가능)
//        super(100, "abc"); // 위에거랑 다르다. 왜다르게?
        System.out.println("자식 생성자");
    }


}
