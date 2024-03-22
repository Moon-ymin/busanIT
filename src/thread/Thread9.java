package thread;

public class Thread9 {
    // 멀티 스레드는 객체를 공유해서 작업할 수 있음.
    // 하나의 자원을 여러개의 스레드가 공유해서 작업하는 경우
    // Race Condition (경쟁 상태) => 예상치 못한 결과 발생
    static int count = 0;

    public static void main(String[] args) {
        Thread incrementer = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {

                count++;
            }
            System.out.println("증가 = " + count);
        });

        Thread decrementer = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                count--;
            }
            System.out.println("감소 = " + count);
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
