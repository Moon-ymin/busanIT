package variable;

import java.io.IOException;
import java.util.Scanner;

public class Read1 {
    public static void main(String[] args) throws IOException {
        int read = System.in.read(); // 시스템 입력장치에서 키를 읽어라
        // 읽은 결과는 KeyCode로 저장됨
        System.out.println(read); // 입력받은 한 글자만

        // 키보드에 입력된 내용을 문자열로 얻기
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine(); // 한 글자 다음모두 개행까지도~

        System.out.println(line);

        /* https://st-lab.tistory.com/92
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.nextLine();
        String s4 = sc.nextLine();

        System.out.println(s1); Cat
        System.out.println(s2); is
        System.out.println(s3); 줄바꿈이 포함되어버림
        System.out.println(s4); perfect

        ~ 맞는 방법 ~
        String s1 = sc.next();
        String s2 = sc.next();
        sc.nextLine(); 개행이 s3에 담기지 않도록 개행만 입력시킴
        String s3 = sc.nextLine();
        String s4 = sc.nextLine();
         */
    }
}
