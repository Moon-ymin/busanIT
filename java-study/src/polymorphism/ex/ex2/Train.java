package polymorphism.ex.ex2;

public class Train extends Transport{
    @Override
    public void move() {
        System.out.println("기차가 철로를 따라 질주합니다.");
    }
}
