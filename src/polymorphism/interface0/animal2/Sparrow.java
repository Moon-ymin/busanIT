package polymorphism.interface0.animal2;

public class Sparrow extends Animal implements Flyable {
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("참새가 날아다닙니다");
    }
}
