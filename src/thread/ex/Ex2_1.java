package thread.ex;

public class Ex2_1 {
    // 겹치는 구조라서 Friend 스레드 만들어서 time, name 요소 받기
    static class Friend implements Runnable {
        String name;
        int time;

        public Friend(String name, int time) {
            this.name = name;
            this.time = time;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(time);
                System.out.println(name+"의 짐 준비 완료!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {

        Thread friendA = new Thread(new Friend("A", 2000));
        Thread friendB = new Thread(new Friend("B", 3000));
        Thread friendC = new Thread(new Friend("C", 5000));

        friendA.start();
        friendB.start();
        friendC.start();

        // 세 스레드가 모두 종료할 때까지
        // 메인스레드는 대기하고 있음
        try {
            friendA.join();
            friendB.join();
            friendC.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 모든 스레드 종료 후 메시지 출력
        System.out.println("모두 준비 완료, 여행을 출발합니다!");
    }

}
