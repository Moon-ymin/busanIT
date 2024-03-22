package thread.ex;

import java.util.Random;

public class Ex1_1 {
    // 수업에서 진행한 버전
    /*
    연습문제: 경주 게임 시뮬레이션
    요구사항:

    3대의 차량(스레드)이 경주를 합니다.
    각 차량은 출발 후 랜덤하게 0~1초 사이에 한 번씩 "차량 [번호]가 질주중!" 메시지를 번 출력한 후, 경주를 마칩니다.

    출력 예시:
    차량 1이 출발했습니다.
    차량 2이 출발했습니다.
    차량 3이 출발했습니다.
    차량 3가 100m를 달렸습니다.
    차량 2가 100m를 달렸습니다.
    차량 1가 100m를 달렸습니다.
    차량 2가 200m를 달렸습니다.
    ...
    차량 3가 800m를 달렸습니다.
    차량 3가 900m를 달렸습니다.
    차량 3가 결승선을 통과했습니다!
    차량 2가 결승선을 통과했습니다!
     */
    public static void main(String[] args) {

        Thread car1 = new Thread(new Car("아반떼"));
        Thread car2 = new Thread(new Car("소나타"));
        Thread car3 = new Thread(new Car("그랜저"));

        car1.start();
        car2.start();
        car3.start();
    }

    static class Car implements Runnable {
        private String carName;

        public Car(String carName) {
            this.carName = carName;
        }

        @Override
        public void run() {
            System.out.println(carName + "가 출발했습니다.");
            for (int i = 100; i < 1000; i += 100) {
                System.out.println(carName + "가 " + i + "m를 달렸습니다.");
                try {
                    Thread.sleep(new Random().nextInt(10, 1000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(carName + "가 결승선을 통과했습니다!");
        }
    }
}
