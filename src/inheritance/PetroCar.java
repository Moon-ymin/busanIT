package inheritance;

public class PetroCar extends Car{
    /*public void move() {
        System.out.println("차량이 이동합니다");
    }*/

    PetroCar() {
        // System.out.println("PetroCar의 생성자 호출");
    }
    public void fillUp() {
        System.out.println("가솔린 차량이 기름을 주유합니다");
    }
}
