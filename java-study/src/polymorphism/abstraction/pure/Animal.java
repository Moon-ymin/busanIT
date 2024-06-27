package polymorphism.abstraction.pure;

// 추상 클래스
public abstract class Animal {
    // 순수 추상 클래스
    // 모든 메서드가 추상 메서드인 클래스
    // 실행 로직, 구현부는 전혀 가지고 있지 않고 껍데기 역할만 제공
    // Java에서는 순수 추상 클래스 ⇒ 인터페이스 개념으로 사용한다

    // 추상 클래스
    public abstract void sound();

    public abstract void move();

    // 일반 메서드 : 본문을 가지는 메서드
    // 본문을 가지는 메서드가 있으면, 순수 추상 클래스가 아니다
    public void eat() {
        System.out.println("동물이 먹습니다.");
    }

}
