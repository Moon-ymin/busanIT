package io_stream.file.ex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Path currentPath = Paths.get("").toAbsolutePath();

        System.out.println("1: 정보 저장, 2: 정보 조회");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("이름: ");
            String name = sc.next();
            System.out.print("이메일: ");
            String email = sc.next();
            System.out.print("나이: ");
            String age = sc.next();
            List<String> stringList = Arrays.asList(
                    name, email, age
            );

            Path newFilePath = currentPath.resolve(name+".user");
            // 파일 생성
            try {
                Files.createFile(newFilePath);
            } catch (FileAlreadyExistsException e) {
                // 파일이 존재할 경우 덮어쓰기 하는 대신 예외 발생
                System.out.println("파일이 이미 존재합니다.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            Files.write(newFilePath, stringList);
            System.out.println("정보 저장 완료.");
        } else if (choice == 2){
            //??
        } else {
            System.out.println("잘 못 입력하셨습니다.");
        }

    }
}
