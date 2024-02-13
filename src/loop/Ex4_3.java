package loop;

import java.util.Scanner;

public class Ex4_3 {
    public static void main(String[] args) {
        // 다이아몬드 패턴 출력하기
        // 홀수 정수 n을 입력받아 n의 높이를 가지는 다이아몬드 패턴 출력프로그램
        // Hint : 공백 출력하기, 상단하단 구분, 2로 나누기
        // n = 5
        /*
           *       공백 *
          ***
         *****
          ***      공백 *
           *

         처음에 중간에 별을 찍고 양쪽에 빈칸을 넣어야 한다고 생각
         => 사실 오른쪽 빈칸은 생각할 필요 없음
         => 그냥 왼쪽 칸 이동 후 별 찍기만 하면 됨
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("홀수 정수 n을 입력하시오 : ");
        int n = sc.nextInt();

        // 상단
        for ( int i = 1; i <= n ; i+=2) {
            // 공백
            for ( int j = 0; j < (n-i)/2; j++ ) {
                System.out.print(" ");
            }
            // * 출력
            for ( int j = 0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 하단
        for ( int i = n-2; i >= 1 ; i-=2) {
            // 공백
            for ( int j = 0; j < (n-i)/2; j++ ) {
                System.out.print(" ");
            }
            // * 출력
            for ( int j = 0; j< i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}