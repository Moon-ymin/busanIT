package polymorphism.abstraction.pure;

public class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("왈왈");
    }

    @Override
    public void move() {
        System.out.println("토도톡");
    }
}
