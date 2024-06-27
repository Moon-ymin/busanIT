package polymorphism.abstraction.pure;

public class Cat extends Animal{
    @Override
    public void sound() {
        System.out.println("야옹");
    }

    @Override
    public void move() {
        System.out.println("슬금슬금");
    }
}
