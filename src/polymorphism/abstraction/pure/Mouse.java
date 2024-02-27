package polymorphism.abstraction.pure;

public class Mouse extends Animal{
    @Override
    public void sound() {
        System.out.println("찍찍");
    }

    @Override
    public void move() {
        System.out.println("샥샥");
    }
}
