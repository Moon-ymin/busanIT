package io_stream.file.ex;

import java.io.*;
import java.util.Scanner;

public class Ex2_1 {
    // 수업에서 한 코드
    public static void main(String[] args) {
        String currentPath = "src/io_stream/file/ex/";

        // 개수 입력받기
        // 개수 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("병합할 파일의 개수를 입력하세요:");
        int fileCount = sc.nextInt();
        sc.nextLine(); // 줄바꿈 문자 제거 버퍼 비우기

        // 병합할 파일 쓰기
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(currentPath+"merged.txt"))){
            // 개수만큼 반복하여 경로 입력받기
            for (int i = 0; i < fileCount; i++) {
                System.out.println("파일 경로를 입력하세요: ");
                String filePath = sc.nextLine();
                File file = new File(currentPath + filePath);   // 파일 경로로 객체 생성

                // 파일 읽기
                try (BufferedReader br = new BufferedReader(new FileReader(file)))
                {
                    while(true) {
                        String line = br.readLine();
                        if (line == null) break;
//                        System.out.println(line);
                        bw.write(line);
                        bw.newLine();
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                bw.write("==============");
                bw.newLine();
            }
            System.out.println("파일 병합이 완료되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
