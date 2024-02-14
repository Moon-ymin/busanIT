package array;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // 점수를 입력받을 학생수를 입력받고
        // 입력받은 수만큼 학생들의 점수를 입력받은 후, 합계와 평균을 출력해주세요
         /*
        예시
        학생수는 몇명인가요? 3
        점수를 입력하세요
        10
        20
        30
        >> 합계 : 60, 평균 : 20.0
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("학생수는 몇명인가요? ");
        int students = sc.nextInt();
        int[] scores = new int[students];
        int sum = 0;
        System.out.println("점수를 입력하세요");
        for (int i=0; i<students; i++) {
            int score = sc.nextInt();
            sum += score;
            scores[i] = score;
        }
        System.out.printf(">> 합계 : %d, 평균 : %f", sum, (double)sum/students);

    }
}
