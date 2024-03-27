package io_stream.ex;
import java.io.*;
public class Ex2_1 {
    // 수업에서 진행한 코드
    public static void main(String[] args) {
        // 경로
        String filePath = "src/io_stream/ex/server.log";
        String resultPath = "src/io_stream/ex/errorLogs.txt";

        // 에러 횟수
        int errorCount = 0;

        // 버퍼 리더(입력 스트림)에서 한 줄씩 읽음 (try-with-resource)
        try (BufferedReader br = new BufferedReader(new FileReader(filePath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(resultPath));
        ) {

            while (true) {
                String line = br.readLine();
                if (line == null) break;        // 비어있을 경우 반복 종료
                // - 에러 로그 분석: 로그 파일을 읽고, "ERROR"라는 단어가 포함된 모든 라인을 찾습니다.
                if (line.contains("ERROR")) {
                    // System.out.println(line);
                    // 결과 저장: 찾은 에러 로그를 "errorLogs.txt" 파일에 저장합니다. 각 - 에러 로그는 파일의 새로운 줄에 기록되어야 합니다.
                    bw.write(line); // 라인을 출력스트림을 통해 파일에 쓰기
                    bw.newLine();   // 한 줄 개행문자 추가
                    errorCount++;   // 에러가 발생할 때마 횟수 추가
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 분석 결과 출력
        System.out.printf("분석 완료. 총 %d개의 에러 로그를 찾았습니다.\n", errorCount);
    }
}
