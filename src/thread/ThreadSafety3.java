package thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafety3 {
    // Atomic 변수 (원자 변수) 클래스
    // 멀티 스레딩 환경에서 동기화 없이도, 스레드 안전 참조 가능 + 동시성 + 성능

    static int normalCount = 0;
    // int 값에 대해서 원자성을 가진 업데이트 지원
    static AtomicInteger atomicCount = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 100000; i++) {
                normalCount++;
                // 1씩 증가하는 메서드
                atomicCount.getAndIncrement();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        // 일반 타입 필드는 스레드가 동시 접근하여, 안전하지 않은 예측 불가 카운트가 되지만
        // 원자 타입 필드는 항상 예측 가능한 스레드 안전 상태를 갖는다.
        System.out.println("normalCount = " + normalCount);
        System.out.println("atomicCount = " + atomicCount);
    }
}
