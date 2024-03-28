package io_stream.file.ex;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex1_1 {
    // 수업에서 한 코드
    static String name, email, age;
    public static void main(String[] args) {
        String currentPath = "src/io_stream/file/ex/";
        Scanner sc = new Scanner(System.in);
        System.out.println("1: 정보 저장, 2:정보 조회");
        int choice = sc.nextInt();

        sc.nextLine();     // 개행문자 버퍼를 비워줌

        // 정보 저장
        if (choice == 1) {
            System.out.print("이름: ");
            name = sc.nextLine();
            System.out.print("이메일: ");
            email = sc.nextLine();
            System.out.print("나이: ");
            age = sc.nextLine();

            saveUser(currentPath, name);
        } else if (choice == 2) {
            listFileInfo(currentPath);
        } else {
            System.out.println("1 또는 2를 선택하세요.");
        }
    }

    private static void saveUser(String currentPath, String name) {
        File file = new File(currentPath + name + ".user"); // 파일 객체 생성
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("이름: " + name);
            bw.newLine();
            bw.write("이메일: " + email);
            bw.newLine();
            bw.write("나이: " + age);
            bw.newLine();
            System.out.println("정보 저장 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void listFileInfo(String currentPath) {
        File currentDir = new File(currentPath);    // 경로 받기
        File[] files = currentDir.listFiles();      // 경로 안에 파일 경로들 리스트업

        for (File f : files) {
            // 파일 경로에서 파일 이름만 꺼내기
            String fileName = f.getName();
            // 문자열 끝 부분(확장자) 일치여부 확인
            if (fileName.endsWith(".user")) {
                System.out.println(fileName);
            }

        }
    }


}
