package polymorphism.interface0.animal;

public class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("왈왈");
    }

    @Override
    public void move() {
        System.out.println("강아지가 움직입니다.");
    }
}
