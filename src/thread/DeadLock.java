package thread;

public class DeadLock {
    public static void main(String[] args) {
        // 자원 2개
        Object resource1 = new Object();
        Object resource2 = new Object();

        // 스레드 2개
        Thread thread1 = new Thread(() -> {
            // 스레드 1이 자원 1을 획득
            synchronized (resource1) {
                System.out.println("스레드 1이 자원 1을 획득 (잠금)");

                try {
                    Thread.sleep(1000);  // 다른 스레드가 다른 자원을 획득하는 시간 부여
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                // 스레드 1이 자원 2을 획득하기 위해 : Wait
                synchronized (resource2) {
                    System.out.println("스레드 1이 자원 2를 획득 (잠금)");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            // 스레드 2이 자원 2을 획득 : Hold
            synchronized (resource2) {
                System.out.println("스레드 2이 자원 2을 획득 (잠금)");

                try {
                    Thread.sleep(1000);  // 다른 스레드가 다른 자원을 획득하는 시간 부여
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                // 스레드 1이 자원 2을 획득하기 위해 : Wait
                synchronized (resource1) {
                    System.out.println("스레드 2이 자원 1를 획득 (잠금)");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
