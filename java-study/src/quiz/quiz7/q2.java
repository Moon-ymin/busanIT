package quiz.quiz7;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class q2 {
    /*
    pool-1-thread-2> 아메리카노 준비 시작.
    pool-1-thread-3> 카푸치노 준비 시작.
    pool-1-thread-1> 에스프레소 준비 시작.
    pool-1-thread-1> 에스프레소 준비 완료!
     */
    public static void main(String[] args) {
        ExecutorService coffeethread = Executors.newFixedThreadPool(3);

        List<CoffeeOrder> orders = Arrays.asList(
                new CoffeeOrder("에스프레소", 2),
                new CoffeeOrder("아메리카노", 3),
                new CoffeeOrder("카푸치노", 5),
                new CoffeeOrder("라떼", 4)
        );

        orders.forEach(order -> coffeethread.execute(() -> {
            Thread thread = Thread.currentThread();
            System.out.printf("%s > %s 준비 시작\n", thread.getName(), order.name);
            try {
                thread.sleep(order.time * 1000);
                System.out.printf("%s > %s 준비 완료!\n", thread.getName(), order.name);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }));
        coffeethread.shutdown();

    }
    static class CoffeeOrder{
        private String name;
        private int time;

        public CoffeeOrder(String name, int time) {
            this.name = name;
            this.time = time;
        }
    }
}
