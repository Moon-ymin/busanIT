package thread;

public class Thread12 {
    // 종료 플래그 : 메인 스레드에서는 변경, 새 스레드에서는 참조
    // volatile 키워드 : 모든 스레드가 해당 변수의 최신 업데이트된 값을 볼 수 있도록 해줌
    // (변경된 값이 가시적 visibility)
    static volatile boolean stop = false;

    public static void main(String[] args) {
        // 1초 동안 숫자를 1씩 증가시키면서 출력하고,
        // 1초 후에 종료 플래그 발동

        // 새로운 스레드
        new Thread(() -> {
            int count = 0;
            // stop(false) 을 참조하기 위해 cache에 저장
            // 업데이트된 false -> true 값을 보지 못하여서 탈출하지 못함.
            // (대신 cache)를 봄.
            while (!stop) {
                count++;
                // 로그를 주석처리하고 실행할 경우
                // stop 플래그의 변경이 반영되지 않는다.
                //System.out.println(count);
                // 메모리 배리어 역할 (I/O) 출력을 하면서 stop 변수의 가시성을 강제
            }
            System.out.println("스레드가 종료되었습니다.");

        }).start();

        // 메인 스레드
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 1초 후 종료 플래그
        stop = true;
    }
}
