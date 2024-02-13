package loop;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        // 별 찍기
        // 사용자로부터 정수 n을 입력받아, n줄 만큼의 별(*)을
        // 삼각형 모양으로 출력하는 프로그램을 작성하세요.
        // (input) 별의 줄 수 : 2
        // *
        // **
        // (input) 별의 줄 수 : 4
        // *
        // **
        // ***
        // ****
        // Hint : 중첩 for문, System.out.print()

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 n : ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            for (int j=0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}