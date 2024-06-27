package polymorphism.interface0.animal2;

public class Penguin extends Animal implements Swimmable, Flyable {
    @Override
    public void sound() {
        System.out.println("펭펭");
    }

    @Override
    public void swim() {
        System.out.println("펭귄이 수영합니다");
    }

    @Override
    public void fly() {
        System.out.println("펭귄이 파다닥 날개짓을 합니다");
    }
}
