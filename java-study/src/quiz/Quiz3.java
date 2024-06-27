package quiz;

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생수는 몇명인가요? ");
        int n = sc.nextInt();

        int[] scores = new int[n];
        System.out.println("점수를 입력하세요");
        for(int i=0; i<n; i++) {                    // 점수를 입력받아 배열에 저장
            scores[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i : scores) {
            sum += i;
        }
        System.out.printf(">> 합계 : %d, 평균 : %.1f\n", sum, (double)sum/n);
    }
}
