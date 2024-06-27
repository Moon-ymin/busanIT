package io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOStream3 {
    public static void main(String[] args) {
        // 1바이트씩 읽기
        try {
            InputStream inputStream = new FileInputStream("src/io_stream/test.txt");

            // 1바이트씩 읽음
            int read1 = inputStream.read();
            int read2 = inputStream.read();
            int read3 = inputStream.read();
            // 더이상 읽을 바이트가 없으면 -1을 반환
            int read4 = inputStream.read();

            System.out.println("read1 = " + read1);
            System.out.println("read2 = " + read2);
            System.out.println("read3 = " + read3);
            System.out.println("read4 = " + read4);

            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
