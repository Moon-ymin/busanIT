package quiz.quiz7;

import java.util.Random;

public class q3 {

    public static void main(String[] args) {
        Thread car1 = new Thread(new Car("차량 1"));
        Thread car2 = new Thread(new Car("차량 2"));
        Thread car3 = new Thread(new Car("차량 3"));

        car1.start();
        car2.start();
        car3.start();
    }
    static class Car extends Thread {
        private String name;

        public Car(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(name+"이 출발했습니다.");
            for (int i = 1; i < 10; i++) {
                System.out.printf("%s이 %dm를 달렸습니다.\n", name, i*100);
                try {
                    Thread.sleep(new Random().nextInt(10,1000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(name + "이 결승선을 통과했습니다!");

        }
    }
}
