package io_stream;

import java.io.*;

public class IOStream11 {
    public static void main(String[] args) throws FileNotFoundException {
        // 프린트 스트림 : 데이터를 텍스트 형태로 출력할 때 사용되는 스트림
        // System.out 객체가 대표적인 예시
        // 텍스트 값을 출력하고, 자동으로 flush(버퍼를 비움)
        String filePath = "src/io_stream/print_test.txt";

        // try-with-resource (블록이 종료되면 자원을 close)
        try (OutputStream fos = new FileOutputStream(filePath);
            PrintStream printStream = new PrintStream(fos)
        ) {
            printStream.print("프린트 스트림은 ");
            printStream.println("마치 프린터에서 출력하는 것처럼 ");
            printStream.println("데이터를 출력합니다.");
            printStream.printf("| %6d | %-10s | %10s |\n", 1, "홍길동", "학생");
            printStream.printf("| %6d | %-10s | %10s |\n", 2, "임꺽정", "산적");
            printStream.printf("| %6d | %-10s | %10s |\n", 3, "전우치", "도사");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // System.out의 클래스는 PrintStream 임.
        System.out.println(System.out.getClass());

        PrintStream ps = new PrintStream(
                new FileOutputStream("src/io_stream/print_test2.txt"));
        // 시스템 출력의 대상을 변경
        System.setOut(System.out);
        System.out.println("콘솔에 출력됩니다.");

        System.setOut(ps);
        System.out.println("파일에 출력이 됩니다.");
        System.out.print("안녕~ 콘솔");
        System.out.printf(" 나는 %s로 넘어갈거야~", "파일");
    }
}
