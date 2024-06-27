package io_stream.file.ex;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean isFinish = false;
        String currentPath = "src/io_stream/file/ex/";

        while(!isFinish) {
            System.out.println("1: 정보 저장, 2: 정보 조회");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("이름: ");
                    String name = sc.next();
                    System.out.print("이메일: ");
                    String email = sc.next();
                    System.out.print("나이: ");
                    String age = sc.next();

                    String filename = name + ".user";
                    FileWriter writer = new FileWriter(currentPath + filename);
                    writer.write(name + "\n" + email + "\n" + age);
                    writer.close();
                    System.out.println("정보 저장 완료.");
                    break;
                case 2:
                    File folder = new File(currentPath);
                    File[] files = folder.listFiles(
                            (dir, fileName) -> fileName.endsWith(".user"));
                    if (files != null && files.length > 0) {
                        for (File f : files) {
                            System.out.println(f.getName());
                        }
                    } else {
                        System.out.println("저장된 파일이 없습니다.");
                    }
                    isFinish = true;
                    break;
                default:
                    System.out.println("잘 못 입력하셨습니다.");
                    break;
            }
        }
    }
}
