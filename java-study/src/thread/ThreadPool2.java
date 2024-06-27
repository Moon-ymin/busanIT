package thread;

import java.util.concurrent.*;
import java.util.stream.IntStream;

public class ThreadPool2 {
    public static void main(String[] args) {
        // 스레드풀에 스레드 갯수를 지정하여 생성
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // 스레드 풀 작업...
        IntStream.rangeClosed(1, 100).forEach( num ->
                {
                    int idx = num;
                    Future<Integer> future = executorService.submit(
                            () -> {
                                int sum = 0;
                                for (int i = 1; i < idx; i++) {
                                    sum += i;
                                }
                                String log = String.format("[%s] 1~%d 합 계산",
                                        Thread.currentThread().getName(), idx-1);
                                System.out.println(log);
                                return sum;
                            });
                    try {
                        Integer result = future.get();
                        System.out.println("result = " + result);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } catch (ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                }
        );

        // 스레드풀 종료
        executorService.shutdown();
    }
}
