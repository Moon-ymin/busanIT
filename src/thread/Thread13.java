package thread;

public class Thread13 {
    // wait, notify : 스레드 간의 통신을 위해 사용되는 메커니즘.
    // Object 클래스의 메서드 일부로 모든 객체에서 사용할 수 있음
    // 동기화된 블럭 또는 동기화 메서드에서만 호출 가능
    // wait() : 대기상태로 만듬
    // notify() : 대기중인 스레드 하나를 깨움
    // notifyAll() : 대기중인 모든 스레드를 깨움
    public static void main(String[] args) {
        // 공유 객체 : 두 스레드가 모두 사용하는 객체
        Object lock = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("스레드 1 : lock을 쓸 수 있을 때까지 대기합니다.");
                // Runnable -> Waiting
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                // 알람을 받고 다른 스레드의 동기화 블록이 종료되면 실행 재개
                System.out.println("스레드 1 : 알림 받았습니다.");
            }
        });
        Thread thread2 = new Thread(() -> {
            // 스레드 1이 대기상태로 들어가고 스레드 2가 lock(공유 객체)을 사용할 수 있게 됨
            synchronized (lock) {
                System.out.println("스레드 2 : lock 객체 다 썼음을 알립니다.");
                // lock 객체를 기다리고 있는 대기 중인 스레드에게 알림
                lock.notify();
                // notify 호출 후에도 동기화 블록 종료할 떄까지는 계속 사용
                System.out.println("스레드 2 : 알리고 동기화 블록 종료 중입니다 ");
            }
        });

        thread1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
    }
}