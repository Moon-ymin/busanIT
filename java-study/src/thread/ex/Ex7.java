package thread.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex7 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<CoffeeOrder1> coffeeOrder = Arrays.asList(
                new CoffeeOrder1("에스프레소", 2),
                new CoffeeOrder1("아메리카노", 3),
                new CoffeeOrder1("카푸치노", 5),
                new CoffeeOrder1("라떼", 4),
                new CoffeeOrder1("유자차", 6),
                new CoffeeOrder1("프라푸치노", 7),
                new CoffeeOrder1("딸기슬러시", 8)
        );

        coffeeOrder.forEach(order ->
                executorService.execute( () -> {
                    Thread thread = Thread.currentThread();
                    String startlog = String.format("%s > %s 준비 시작.",
                            thread.getName(), order.name);
                    System.out.println(startlog);

                    try {
                        thread.sleep(order.sec * 1000);
                        String endlog = String.format("%s > %s 준비 완료!",
                                thread.getName(), order.name);
                        System.out.println(endlog);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                })
        );

        // 스레드풀 종료
        executorService.shutdown();
    }
}
class CoffeeOrder1{
    String name;    // 커피 이름
    int sec;    // 준비 시간

    public CoffeeOrder1(String name, int sec) {
        this.name = name;
        this.sec = sec;
    }
}
