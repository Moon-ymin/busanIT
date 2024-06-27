package loop;

import java.util.Scanner;

public class Ex4_4 {
    public static void main(String[] args) {
        // 다이아몬드 패턴 출력하기
        // 홀수 정수 n을 입력받아 n의 높이를 가지는 다이아몬드 패턴 출력프로그램
        // Hint : 공백 출력하기, 상단하단 구분, 2로 나누기
        // n = 5
        /*
         *
         ***
         *****
         ***
         *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("홀수 정수 입력: ");
        int n = scanner.nextInt();

        // 상단 다이아몬드
        for (int i = 1; i < n; i +=2) {
            // 공백 출력
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            // * 출력
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();  // 줄바꿈

        }

    }
}