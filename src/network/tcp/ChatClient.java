package network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        // String hostName = "localhost";
        String hostName = "10.100.203.20";
        int port = 12345;

        // 소켓 및 자원 생성
        try (Socket socket = new Socket(hostName, port);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             Scanner scanner = new Scanner(System.in);
        ) {

            // 서버로부터 메시지를 받는 스레드
            new Thread(() -> {
                try {
                    while (true) {
                        // 서버로 부터 입력 받기
                        String fromServer = in.readLine();
                        if (fromServer == null) break;      // null 처리
                        System.out.println(fromServer);     // 사용자에게 출력
                    }
                } catch (IOException e) {
                    System.out.println("서버로부터 메시지 받는 중 오류 " + e.getMessage());
                }
            }).start();

            // 메인 스레드에서는 사용자의 입력을 처리
            while (true) {
                // 사용자로부터 입력받기
                String fromConsole = scanner.nextLine();
                if (fromConsole != null) {
                    // System.out.println(fromConsole);
                    out.println(fromConsole);// 서버로 출력(보내기)
                }

                // 사용자로부터 /q를 입력받으면 종료
                if (fromConsole.equals("/q")) {
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("오류가 발생했습니다 : " + e.getMessage());
        }
    }
}