package polymorphism.abstraction;

// 추상 메서드를 상속한 하위 클래스는 추상 메서드 구현이 강제된다
public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("왈왈");
    }
}
