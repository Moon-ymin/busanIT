package inheritance;

public class Inheritance2 {
    public static void main(String[] args) {
        PetroCar car = new PetroCar();
        car.move();

        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // 상속 오버라이딩

    }
}
