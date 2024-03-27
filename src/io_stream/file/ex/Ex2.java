package io_stream.file.ex;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> text = new ArrayList<>();
        FileReader fileReader = new FileReader();

        System.out.print("병합할 파일의 개수를 입력하세요: ");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("파일 경로를 입력하세요: ");
            String filePath = sc.nextLine();
            sc.nextLine();

            fileReader(filePath);


        }
        System.out.println("파일 병합 완료.");
    }
}
