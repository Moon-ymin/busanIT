package loop;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // 피보나치 수열 찾기
        // 사용자로부터 정수 n을 입력받아,
        // 피보나치 수열의 첫 n 항을 출력하는 프로그램을 작성하세요.
        // 피보나치 수열에서 다음 항은 앞의 두 항의 합으로 구성됩니다
        // (예: 0, 1, 1, 2, 3, 5, 8, ...).
        Scanner scanner = new Scanner(System.in);
        System.out.print("피보나치 수열의 항 개수: ");
        int n = scanner.nextInt();

        int n1 = 0;
        int n2 = 1;
        int pivot = 0;

        if ( n == 0 ) {
            System.out.println("0항은 "+n1);
        } else if ( n == 1) {
            System.out.println("1항은 "+n2);
        } else {
            for ( int i = 2; i <= n; i++) {
                pivot = n1 + n2;
                n1 = n2;
                n2 = pivot;
            }
        }
        System.out.println("n번째 피보나치 수열의 값: " + pivot);

    }
}