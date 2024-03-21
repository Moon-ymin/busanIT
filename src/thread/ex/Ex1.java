package thread.ex;

import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        RacingCar car1 = new RacingCar(1);
        RacingCar car2 = new RacingCar(2);
        RacingCar car3 = new RacingCar(3);

        car1.start();
        car2.start();
        car3.start();

        try {
            car1.join();
            car2.join();
            car3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("모든 차량의 경주가 종료되었습니다.");
    }
}

class RacingCar extends Thread {
    private int carNumber;

    public RacingCar(int carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public void run() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println("차량 " + carNumber + "이 질주중!");
            try {
                Thread.sleep(rand.nextInt(1000)); // 0~1초 사이의 임의의 시간 대기
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("차량 " + carNumber + "이 경주 마침!");
    }
}


