package class0.ex;

public class Ex2 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Hyundai";
        car1.model = "IONIQ 5";
        car1.year = 2020;

        Car car2 = new Car();
        car2.brand = "Kia";
        car2.model = "K9";
        car2.year = 2018;

        Car[] cars = new Car[2];
        cars[0] = car1;
        cars[1] = car2;

        for ( Car car : cars ) {
            System.out.println( "[ 브랜드 : " +car.brand + ", 모델명 : " + car.model + ", 생산년도 : " + car.year +" ]" );
        }

    }
}
