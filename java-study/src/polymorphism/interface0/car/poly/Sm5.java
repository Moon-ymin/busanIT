package polymorphism.interface0.car.poly;

public class Sm5 implements Car{
    @Override
    public void onEngine() {
        System.out.println("Sm5 엔진을 켭니다.");
    }

    @Override
    public void offEngine() {
        System.out.println("Sm5 엔진을 끕니다.");
    }

    @Override
    public void pressAccel() {
        System.out.println("Sm5 엑셀을 밟습니다.");
    }

    @Override
    public void pressBreak() {
        System.out.println("Sm5 브레이크를 밟습니다.");
    }
}
