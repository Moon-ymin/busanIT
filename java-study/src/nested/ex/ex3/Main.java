package nested.ex.ex3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // 바깥 인스턴스 객체 생성

        // 타이어 생성
        Car.Tire tire = car.new Tire(); // 인스턴스 중첩 class

        // 엔진 생성
        Car.Engine engine = new Car.Engine(); // static 중첩 class

    }
}
