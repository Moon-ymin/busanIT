package io_stream.ex;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    /*
    문제: 사용자 입력 문자열을 파일에 저장하기

    문제 설명
    사용자로부터 문자열 입력을 받아 이를 "output.txt"라는 이름의 파일에 저장하는 자바 프로그램을 작성하세요. 사용자가 "종료"라는 단어를 입력할 때까지 프로그램은 계속해서 사용자의 입력을 받습니다. 모든 입력은 파일에 순차적으로 저장되어야 하며, 각 입력은 파일의 새로운 줄에 기록됩니다. 사용자가 "종료"를 입력하면 프로그램은 실행을 마치고 파일에 지금까지 입력받은 내용을 모두 저장해야 합니다.

    요구 사항
    - 사용자 입력 받기: 사용자로부터 문자열을 계속해서 입력 받으세요. 입력은 터미널(콘솔)을 통해 이루어집니다.
    - 파일에 저장: 사용자가 입력한 문자열을 "output.txt" 파일에 저장하세요. 사용자가 새 문자열을 입력할 때마다, 이 문자열은 파일의 새로운 줄에 추가되어야 합니다.
    - 프로그램 종료 조건: 사용자가 "종료"라고 입력하면, 프로그램은 더 이상 입력을 받지 않고 종료됩니다. 이때, 지금까지 입력받은 모든 문자열이 "output.txt" 파일에 저장되어 있어야 합니다.

    실행예시
    ===
    텍스트를 입력하세요 ('종료' 입력 시 프로그램 종료):
    > 안녕하세요
    > 자바 파일 입출력 연습입니다.
    > 종료

    output.txt
    ===
    안녕하세요
    자바 파일 입출력 연습입니다.
     */
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/io_stream/ex/chat.log";
        String outputFileName = "src/io_stream/ex/chatSummary.txt";

        // (이름, 횟수) 맵
        Map<String, Integer> speakerCnt = new HashMap<>();

        // chat.log 파일 읽기
        BufferedReader br = new BufferedReader(new FileReader(inputFileName));
        String line;
        while( (line = br.readLine()) != null ) {
            String userName = line.substring(8,11);
            speakerCnt.put(userName, speakerCnt.getOrDefault(userName, 0) + 1);
            // getOrDefault : 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드

        }
        br.close();

        // 결과 chatSummary.txt 쓰기
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName));
        for (Map.Entry<String, Integer> entry : speakerCnt.entrySet()) {
            bw.write(entry.getKey() + ": " + entry.getValue());
            bw.newLine();
        }
        bw.close();
    }
    /* 수업에서 진행한 코드
    public static void main(String[] args) {
        String filePath = ("src/io_stream/ex/chat.log");

        try (BufferedReader br = new BufferedReader(new FileReader(filePath));){
            String line;
            // 종료 조건을 축약하여 while 조건문에 대입
            while ((line = br.readLine()) != null) {
                // String line = br.readLine();
                // if (line == null) break;
                System.out.println(line);
                String[] split = line.split(":");
                // { "[08", "45] 길동씨", "좋은 아침이에요!" }
                String s = split[1];
                System.out.println(s);
                String[] split1 = s.split("]");
                // { "45", " 길동씨" }
                String s1 = split1[1];
                System.out.println("s1 = " + s1);
                String trim = s1.trim();
                System.out.println("trim = " + trim);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
     */
}
