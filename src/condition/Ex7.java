package condition;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        /*
         삼항연산자를 사용해서 짝수와 홀수를 구별하는 프로그램을 작성해주세요.
         Hint : num % 2
         */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println( (num % 2 == 0) ? "짝수" : "홀수");
    }
}