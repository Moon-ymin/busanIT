package array;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        // 2차원 배열을 활용한 점수 계산 문제
        // 3명의 학생, 과목은 국어, 영어, 수학
        // 의 점수를 입력 받아, 각 학생의 총점과 평균을 구하는 프로그램을 작성하세요.
        Scanner sc = new Scanner(System.in);
        int[][] students = new int[3][3];

        // 1. 점수 입력 부분
//        for (int i=0; i<3; i++) {
//            System.out.print((i+1)+"번째 학생의 국어 성적은? : ");
//            int korean = sc.nextInt();
//            System.out.print((i+1)+"번째 학생의 영어 성적은? : ");
//            int english = sc.nextInt();
//            System.out.print((i+1)+"번째 학생의 수학 성적은? : ");
//            int math = sc.nextInt();
//
//            students[i][0] = korean;
//            students[i][1] = english;
//            students[i][2] = math;
//        }
        // 다른 버전
//        for (int[] student : students) {
//            System.out.println("학생의 성적을 입력하세요");
//            for (int i : student) {
//                System.out.print("점수 : ");
//                student[i] = sc.nextInt();
//            }
//        }
        for (int i =0; i< students.length; i++ ) {
            System.out.println("학생의 성적을 입력하세요");
            for (int j=0; j<students[i].length; j++) {
                System.out.print("점수 : ");
                students[i][j] = sc.nextInt();
            }
        }


        // 2. 총점과 평균 구하기
        for (int i=0; i<3; i++) {
            int scores = 0;
            for (int j=0; j<3; j++) {
                scores += students[i][j];
            }
            System.out.printf("%d번째 학생의 총점은 %d점, 평균은 %f점 입니다.\n", i+1, scores, scores/3.0);
        }

    }
}
