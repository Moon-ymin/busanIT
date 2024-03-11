package generic.generic_interface;

// 자동차만 전문적으로 대여하는 자동차 대리점
public class CarAgency implements Rentable<Car>{
    @Override
    public Car rent() {
        System.out.println("새 자동차를 대여합니다.");
        return new Car();
    }
}
