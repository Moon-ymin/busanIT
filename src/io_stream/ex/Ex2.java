package io_stream.ex;

import java.io.*;

public class Ex2 {
    /*
    문제: 로그 파일 분석기

    문제 설명
    로그 파일을 분석하는 자바 프로그램을 작성해야 합니다. 이 프로그램은 로그 파일에서
    "에러(ERROR)"가 발생한 모든 라인을 찾아 그 내용을 별도의 파일("errorLogs.txt")에
     저장해야 합니다.
     로그 파일의 경로는 프로그램 실행 시 사용자로부터 입력받으며,
     분석 완료 후 사용자에게 "분석 완료" 메시지와 함께 에러 로그의 총 개수를 출력해야 합니다.

    요구 사항
    - 로그 파일 경로 분석 : 로그 파일은 server.log 에 저장되어 있습니다.
    - 에러 로그 분석: 로그 파일을 읽고, "ERROR"라는 단어가 포함된 모든 라인을 찾습니다.
    - 결과 저장: 찾은 에러 로그를 "errorLogs.txt" 파일에 저장합니다.
        각 - 에러 로그는 파일의 새로운 줄에 기록되어야 합니다.
    - 분석 결과 출력: 에러 로그의 총 개수와 함께 사용자에게 분석이 완료되었음을 알립니다.

     */
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("src/io_stream/ex/errorLogs.txt"));
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("읽을 파일 경로를 입력하세요: ");
        String logPath = br.readLine();

        BufferedReader fr = new BufferedReader(new FileReader(logPath));
        int cnt = 0;

        while (true) {
            String line = fr.readLine();
            if (line == null) break;
            else if (line.contains("ERROR")) {
                bw.write(line);
                bw.newLine();
                cnt++;
                System.out.println(line);
            }
            fr.close();
        }
        bw.close();
        System.out.printf("분석 완료, 총 %d개의 에러 로그를 찾았습니다.\n", cnt);


    }
}
