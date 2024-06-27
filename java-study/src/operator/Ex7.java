package operator;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        // int형 변수 score를 선언하고
        // score가 80점 이상이고 100점 이하면 true를 출력, 아니면 false를 출력하세요.
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        System.out.println( ( 80<=score && 100>=score ) ? true : false);
    }
}