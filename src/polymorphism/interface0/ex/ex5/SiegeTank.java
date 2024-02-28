package polymorphism.interface0.ex.ex5;

public class SiegeTank implements Attackable{
    @Override
    public void attack() {
        System.out.println("시즈탱크가 포를 쏩니다.");
    }
}
