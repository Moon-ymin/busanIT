package polymorphism.interface0.ex.ex5;

public class Marine extends Unit implements Attackable, Movable{
    @Override
    public void attack() {
        System.out.println("마린이 총을 쏩니다.");
    }

    @Override
    public void move() {
        System.out.println("마린이 이동합니다.");
    }
}
