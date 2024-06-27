package variable;

import java.io.IOException;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) throws IOException {
        /* Scanner를 이용해서 변수에 입력을 받고 출력하는 코드를 작성해주세요
        1. 이름 : ____(enter)
        2. 주민번호앞자리 : ____ (enter)
        3. 전화번호 : ____ (enter)

        (입력한 이름, 주민번호, 전화번호 출력)
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("1. 이름 : ");
        String name = sc.nextLine();
        System.out.print("2. 주민번호앞자리 : ");
        String num = sc.nextLine();
        System.out.print("3. 전화번호 : ");
        String tel = sc.nextLine();

        System.out.println(name+"\n"+num+"\n"+tel);


    }
}
