package thread;

public class Thread4 {
    // 스레드에 이름 주기
    // getName, setName 등
    // 스레드가 생성될 때 이름을 할당받음. 디버깅할 때 스레드를 구분할 때 사용
    // 개발자가 setName 등을 통해 명시적으로 이름을 지정할 수 있음
    public static void main(String[] args) {
        // 이 코드를 실행하는 메인 스레드의 스레드 객체 참조
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName() + " 스레드");

        Thread thread0 = new Thread() {
            @Override
            public void run() {
                // 인스턴스 내부에서 이름을 반환하여 출력
                System.out.println(getName() + " 스레드");
            }
        };
        String name = thread0.getName();
        thread0.start();

        Thread threadChat = new Thread() {
            @Override
            public void run() {
                // 인스턴스 내부에서 이름을 반환하여 출력
                System.out.println(getName() + " 스레드");
            }
        };

        // 작업 스레드의 이름을 변경하여 설정
        threadChat.setName("Chatting");
        threadChat.start();

        // 람다식에서 스레드를 생성하고 이름을 가져오는 경우
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " 스레드");
        }).start();

        // 생성자에서 이름을 주는 방법
        String threadName = new Thread("스레드 이름").getName();
        System.out.println("threadName = " + threadName);

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " 스레드");
        }, "스레드이름2").start();
    }
}