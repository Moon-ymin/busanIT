package variable;

import java.io.IOException;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) throws IOException {
        /* 아래와같이 출력되도록 코드 작성
        이름 : 홍길동
        나이 : 25
        전화 : 010-1234-5678
         */
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        String tel1 = sc.next();
        String tel2 = sc.next();
        String tel3 = sc.next();

        System.out.println("이름 : "+name);
        System.out.print("나이 : "+age+"\n");
        System.out.printf("전화 : %s-%s-%s", tel1, tel2, tel3);



    }
}
