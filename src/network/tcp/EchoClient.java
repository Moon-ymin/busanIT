package network.tcp;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) {
        // 클라이언트 측에서 사용하는 단말
        // Socket : 서버가 리스닝하고 있는 호스트와 포트를 알아야 함.
        // 호스트 이름과 포트 번호를 인자로 받음.
        String hostName = "localhost";  // 서버의 호스트 이름 (자기자신 장치를 가리킴)
        int portNumber = 50001;      // 서버측 애플리케이션 의 포트번호

        try (
                // 클라이언트 소켓의 입출력 스트림
                Socket socket = new Socket(hostName, portNumber);
                InputStream inputStream = socket.getInputStream();
                BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
                OutputStream outputStream = socket.getOutputStream();
                PrintWriter out = new PrintWriter(outputStream, true);
        ) {
            System.out.println("클라이언트가 서버에 연결이 되었습니다.");
            // 콘솔에서 표준 입력을 받는 입력스트림 리더
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            Scanner scanner = new Scanner(System.in);

            //String input = stdIn.readLine();
            while (true) {
                String input = scanner.nextLine();
                if (input == null) break;
                // 서버 쪽 출력스트림으로 메시지를 전송
                out.println(input);
                String serverResponse = in.readLine();
                System.out.println("서버로부터 받은 응답 : " + serverResponse);



            }
        } catch (UnknownHostException e) {
            System.out.println("알 수 없는 호스트입니다.");
        } catch (IOException e) {
            System.out.println("입출력 에러가 발생했습니다.");
        }
    }
}