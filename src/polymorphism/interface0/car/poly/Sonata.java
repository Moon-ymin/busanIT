package polymorphism.interface0.car.poly;

public class Sonata implements Car{
    public void onEngine() {
        System.out.println("소나타 엔진을 켭니다.");
    }

    public void offEngine() {
        System.out.println("소나타 엔진을 끕니다.");
    }

    public void pressAccel() {
        System.out.println("소나타 엑셀을 밟습니다.");
    }

    public void pressBreak() {
        System.out.println("소나타 브레이크를 밟습니다.");
    }
}
