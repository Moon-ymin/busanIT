package loop;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        // 짝수의 합 구하기
        // 사용자로부터 두 정수 start와 end를 입력받아,
        // start와 end 사이의 모든 짝수의 합을 계산하는 프로그램을 작성하세요
        Scanner scanner = new Scanner(System.in);
        System.out.print("시작 정수: ");
        int start = scanner.nextInt();
        System.out.print("끝 정수: ");
        int end = scanner.nextInt();

        // code
        int sum = 0;
        for ( int i = start; i<= end; i++) {
            if ( i % 2 == 0 ) {
                sum += i;
            }
        }
        System.out.printf("%d와 %d 사이의 모든 짝수의 합은 %d입니다.\n", start, end, sum);
    }
}