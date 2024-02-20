package access_modifier;

public class Access2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.speedUP();
        car.speedUP();
        car.speedUP();
        car.speedUP();
        car.speedUP();
        car.speedUP();
        car.speedUP();

        car.speedDown();
        car.speedDown();

        // 현재 속도를 가져온다
        int currentSpeed = car.getSpeed();
        System.out.println( currentSpeed );

        // 현재 속도를 설정한다
        car.setSpeed(119);
//        int currentSpeed1 = car.getSpeed();
        System.out.println( car.getSpeed() );
        car.speedUP(); // 120
        car.speedUP(); // 제약사항

        car.getSpeed();
    }
}
