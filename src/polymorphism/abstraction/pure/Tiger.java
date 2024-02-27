package polymorphism.abstraction.pure;

public class Tiger extends Animal{
    // 반드시 구현해야하는 추상 메서드
    @Override
    public void sound() {
        System.out.println("어흥");
    }

    @Override
    public void move() {
        System.out.println("호랑이가 위엄있게 움직입니다.");
    }

    // 구현 여부가 선택적인 일반 메서드
    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 먹습니다.");
    }
}
