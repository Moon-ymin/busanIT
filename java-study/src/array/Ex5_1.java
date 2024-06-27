package array;

import java.util.Scanner;

public class Ex5_1 {
    public static void main(String[] args) {
        // 2차원 배열을 활용한 점수 계산 문제
        // 학생의 과목은 국어, 영어, 수학
        // 의 점수를 입력 받아, 각 학생의 총점과 평균을 구하는 프로그램을 작성하세요.
        // +) 문자열 배열을 활용항여 해당 과목의 점수를 입력받기
        // +) 학생의 수를 입력받아 n명 만큼의 총점과 평균 구하기
        Scanner sc = new Scanner(System.in);

        // code
        System.out.print("학생의 수를 입력하시오 : ");
        int students = sc.nextInt();
        String[] subjects = {"국어", "영어", "수학"};
        int[][] scores = new int[students][subjects.length]; // 행 : 학생, 열: 과목점수


        // 점수 입력
        for (int[] student : scores) {
            System.out.println("학생의 성적을 입력하세요");
            for (int i=0; i<3; i++) {
                System.out.print(subjects[i] + " 점수 : ");
                student[i] = sc.nextInt();
            }
        }

        // 총점과 평균 구하기
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            System.out.println(i+1 +"번 학생의 합계는 = " + sum);
            System.out.println(i+1 +"번 학생의 평균은 = " + sum / scores[i].length);
        }
    }
}
