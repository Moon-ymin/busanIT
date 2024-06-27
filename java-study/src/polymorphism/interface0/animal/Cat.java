package polymorphism.interface0.animal;

// 인터페이스를 상속받을 때는 extends(확장)가 아닌 implements(구현)라는 키워드를 사용
public class Cat implements Animal, Pet{
    @Override
    public void sound() {
        System.out.println("야옹");
    }

    @Override
    public void move() {
        System.out.println("고양이가 움직입니다.");
    }

    @Override
    public void charming() {
        System.out.println("꾹꾹이");
    }
}
