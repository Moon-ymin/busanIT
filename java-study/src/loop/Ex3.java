package loop;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // 구구단 출력하기
        // 사용자로부터 정수 n을 입력받아,
        // n단의 구구단을 출력하는 프로그램을 작성해주세요.
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 n : ");
        int n = sc.nextInt();

        for ( int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n*i);
        }
    }
}