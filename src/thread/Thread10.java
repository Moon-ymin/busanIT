package thread;

public class Thread10 {
    // 멀티 스레드는 객체를 공유해서 작업할 수 있음.
    // 하나의 자원을 여러개의 스레드가 공유해서 작업하는 경우
    // Race Condition (경쟁 상태) => 예상치 못한 결과 발생
    static int count = 0;

    // 동기화를 위한 자물쇠 객체
    static final Object lock = new Object();

    // 동기화 synchronized 블록
    // 해당 블록에 대해 한 번에 하나의 스레드만 접근할 수 있도록 하여
    // 경쟁상태를 예방할 수 있다. (데이터 손실, 오류를 막을 수 있음)

    public static void main(String[] args) {

        Thread incrementer = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                // 동기화 블록
                synchronized (lock) {
                    count++;
                    // System.out.println("증가 = " + count);
                }
            }
        });

        Thread decrementer = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                synchronized (lock) {
                    count--;
                    // System.out.println("감소 = " + count);
                }
            }
        });

        incrementer.start();
        decrementer.start();

        try {
            Thread.sleep(1000);
            System.out.println("count : " + count);
        } catch (InterruptedException e) {
        }
    }
}