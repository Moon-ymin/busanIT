package thread;

public class Thread1 {
    public static void main(String[] args) {
        // 스레드 생성
        // 스레드를 실행할 때는 반드시 run 이 아닌 start 사용


        // 1. Thread 상속 : 단일 상속만 허용하기 때문에 다른 클래스를 상속받을 경우 사용할 수 없음
        MyThread myThread = new MyThread();
        // start 메서드를 호출하면 스레드를 시작
        myThread.start();

        // 2. Runnable 구현 : 다른 클래스를 상속 받아도 스레드 생성 가능
        // 2-1. Thread 에 매개변수로 Runnable 구현 객체를 전달
        MyRunnable myRunnable = new MyRunnable();
        Thread runnablethread = new Thread(myRunnable);
        runnablethread.start();

        // 2-2. 매개변수에 익명 객체
        Thread threadAnonymous = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("안녕하세요, 익명객체 스레드 입니다.");
            }
        });
        threadAnonymous.start();

        // 2-3. 매개변수 Runnable 람다식
        Thread threadLambda = new Thread(
                () -> System.out.println("안녕하세요, 람다 스레드 입니다.")
        );
        threadLambda.start();
    }
}

// 1. 스레드 상속 받는 방법
class MyThread extends Thread {
    // Thread 클래스를 상속받아 run 메서드 오버라이딩
    @Override
    public void run() {
        // 스레드가 실행할 코드를 작성
        System.out.println("안녕하세요, 스레드에요.");
    }
}

// 2. Runnable 인터페이스를 구현받는 방법
class MyRunnable implements Runnable {

    @Override
    public void run() {
        // 스레드가 실행할 코드를 작성
        System.out.println("안녕하세요 Runnable 스레드에요.");
    }
}