package quiz.quiz7;

import java.io.*;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) throws IOException {
        String path = "src/quiz/quiz7/output.txt";
        FileWriter fw = new FileWriter(path);
        Scanner sc = new Scanner(System.in);

        System.out.println("텍스트를 입력하세요 ('종료' 입력 시 프로그램 종료):");
        System.out.print("> ");
        String input = sc.nextLine();
        while ( !input.equals("종료")){
            fw.write(input + "\n");
            System.out.print("> ");
            input = sc.nextLine();
        }

        fw.close();


    }
}
