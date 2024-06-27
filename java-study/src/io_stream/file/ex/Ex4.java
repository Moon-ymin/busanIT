package io_stream.file.ex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex4 {
    /*
    연습문제: 자바 프로젝트 코드 분석

    문제 요구사항
    현재 Java 프로젝트의 src 디렉토리 내에 있는 모든 자바 파일(.java)에 대한 코드 분석을 수행하는 프로그램을 작성하세요. 분석 결과로 다음 정보를 출력해야 합니다

    요구사항
    - src 디렉토리 내에 있는 총 자바 파일(.java)의 개수
    - 모든 자바 파일의 총 코드 라인 수
    - 실습문제(파일이름이 "EX")로 시작하는 파일의 수

    출력 예시
    ===
    자바 프로젝트 코드 분석 결과
    - 총 자바 파일 개수: xxx개
    - 총 코드 라인 수: xxxxx줄
    - 실습문제 풀이 수 : xxx개
     */
    public static void main(String[] args) {
        Path targetPath = Paths.get("src");
        long fileCnt = 0;
        long codeSize = 0;
        long exCnt = 0;
        // 입력된 디렉토리 내의 모든 파일

        try {
            fileCnt = Files.walk(targetPath).
                    filter(filePath -> filePath
                            .toString()
                            .endsWith(".java")).count();

            codeSize = Files.walk(targetPath)
                    .filter(filePath -> filePath.toString()
                            .endsWith(".java")) // java 파일들만 찾아서
                    .mapToLong(path -> {
                        try {
                            return Files.lines(path).count();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }).sum();

            exCnt = Files.walk(targetPath)
                    .filter(path -> path.toFile().isFile())
                    .filter(path -> path.toFile().getName().startsWith("Ex"))
                    .count();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("총 자바 파일 개수: " + fileCnt + "개");
        System.out.println("총 코드 라인 수: " + codeSize + "줄");
        System.out.println("실습문제 풀이 수 : " + exCnt + "개");

    }
}
