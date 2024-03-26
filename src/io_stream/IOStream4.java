package io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOStream4 {
    public static void main(String[] args) throws IOException {
        // 바이트 배열로 읽기
        InputStream inputStream = new FileInputStream("src/io_stream/test2.txt");


        // 최대 1024 바이트를 저장하는 바이트 배열
        byte[] data = new byte[1024];

        while (true) {
            // 최대 1024 바이트를 읽고, 매개변수 data (바이트 배열)에 읽은 바이트를 저장
            int number = inputStream.read(data);    // number = 3
            // 파일 끝에 도달하면 -1을 변환 -> 반복을 종료
            if (number == -1) break;

            // 읽은 바이트를 출력
            for (int i = 0; i < number; i++) {
                System.out.println(data[i]);
            }

        }
        // 메모리 해제
        inputStream.close();
    }
}
