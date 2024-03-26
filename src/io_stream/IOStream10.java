package io_stream;

import java.io.*;

public class IOStream10 {
    public static void main(String[] args) throws IOException {
        // 문자열 버퍼 스트림
        // 내부적으로 성능 향상 + 줄 단위의 편리한 메서드 제공
        // newLine() 메서드 제공
        String src = "src/io_stream/linetext.txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter(src));

        bw.write("안녕하세요");
        bw.newLine();   // 줄 구분
        bw.write("반갑습니다.");

        bw.close();

        // readLine 메서드를 제공
        BufferedReader br = new BufferedReader(new FileReader(src));
        while(true) {
            String line = br.readLine();    // 파일에서 한 줄씩 읽음
            // 더이상 읽을 내용이 없으면 null 리턴
            if (line == null) break;
            System.out.println(line);
        }
        br.close();
    }
}
