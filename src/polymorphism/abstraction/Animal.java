package polymorphism.abstraction;

// 추상 클래스 : 부모 클래스는 제공하지만 실제 생성되면 안되는 클래스
public abstract class Animal {

    // 추상 메서드 : 추상적인 개념을 제공하는 메서드, 실체가 없고, 메서드 본문이 존재하지 않는다
    // 추상메서드는 상속받는 자식 클래스가 오버라이딩 해서 사용해야 한다.
    // 반드시 추상 클래스 내에서 정의될 수 있다
    // 상속받는 하위 클래스는 반드시 추상 메소드를 구현해야 한다
    public abstract void sound();
}
