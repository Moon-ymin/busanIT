package polymorphism.ex.ex2;

public class Car extends Transport{
    @Override
    public void move() {
        System.out.println("자동차가 도로를 달립니다.");
    }
}
