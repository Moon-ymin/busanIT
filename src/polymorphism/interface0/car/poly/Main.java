package polymorphism.interface0.car.poly;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();
        // 역할(인터페이스) 타입 = 구체적인 객체
        Car avante = new Avante();
        driver.setCar(avante);
        driver.drive();

        Car sonata = new Sonata();
        driver.setCar(sonata);
        driver.drive();

        // Open Closse Principle
        // 차량이 추가될 경우 => 확장에는 열려있다.
        // 메인 메서드의 실행문 이외의 코드는 변경할 필요가 없어진다.
        Car sm5 = new Sm5();
        // 클라이언트 쪽 코드(Driver)는 전혀 수정할 필요가 없다 -> 수정에 닫혀있다.
        driver.setCar(sm5);
        driver.drive();
    }
}
