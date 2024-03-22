package thread;


import java.util.Scanner;

public class Thread7 {
    public static void main(String[] args) {
        // 스레드의 대기와 정지
        Thread tazanThread = new Thread(new TazanSong(10), "시끄러운어린이");

        tazanThread.start();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();

            if (input.equals("끝났니")) {
                System.out.println("노래 끝났어?");
                // isAlive() : 스레드 종료 여부에 따라, 진행중이면 true, 종료되면 false
                if (tazanThread.isAlive()) {
                    System.out.println("아니, 계속할거야");
                } else {
                    System.out.println("끝났어.");
                }
            }

            if (input.equals("듣자")) {
                System.out.println("일단 끝날때까지 듣자");
                try {
                    // 해당 스레드의 작업이 종료될때까지 현재 스레드를 대기 시킴
                    // 스레드의 작업 순서를 조정할 수 있음.
                    tazanThread.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            if (input.equals("그만해")) {
                System.out.println("이제 그만~");
                // stop : 해당 스레드를 강제 종료
                // 스레드가 강제종료 될 경우, 데이터가 오염되거나 리소스가 샐 위험이 존재 ->  depreacated -> 자바 2버전부터 금지
                // tazanThread.stop();
                tazanThread.interrupt();
            }

            if (input.equals("q")) break;
            // 입력한 내용을 메아리로 반복
            System.out.println(Thread.currentThread().getName() + " : " + input);
        }
    }
}