package network.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        // 서버 측에서 사용되는 ServerSocket 클래스
        // 포트 번호를 인자로 받음
        // accept() : 클라이언트의 요청을 기다리고, 요청이 들어오면
        // 해당 클라이언트와 통신을 하는 Socket 객체를 반환
        int portNumber = 50001;
        try (ServerSocket serverSocket = new ServerSocket(portNumber);
        ) {
            System.out.println("서버를 시작하고 클라이언트의 연결을 기다립니다.");
            try (
                    // 클라이언트 소켓에서 InputStream ,OutputStream을 받는다.
                    Socket clientSocket = serverSocket.accept();
                    OutputStream outputStream = clientSocket.getOutputStream();
                    PrintWriter out = new PrintWriter(outputStream, true);
                    InputStream inputStream = clientSocket.getInputStream();
                    BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
            ) {
                System.out.println("클라이언트의 연결을 받았습니다.");

                while (true) {
                    String line = in.readLine();
                    // 클라이언트로부터 입력을 받는다.
                    if (line == null) break;
                    System.out.println("서버가 클라이언트에서 받은 메시지 : " + line);

                    // 클라이언트에서 받은 메시지를 다시 클라이언트로 되돌려 보낸다.
                    out.println(line);

                }
            }
        } catch (IOException e) {
            System.out.println("오류가 발생했습니다.");
            System.out.println(e.getMessage());
        }
    }
}