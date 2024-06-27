package polymorphism.interface0.ex.ex5;

public class Observer extends Unit implements Movable{
    @Override
    public void move() {
        System.out.println("옵저버가 떠다닙니다.");
    }
}
