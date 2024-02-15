package method;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int scores[]= new int[0];   // 비어있는 배열로 시작

        // 성적을 관리하는 프로그램
        // 1. 새로운 성적을 배열에 추가
        // 2. 성적의 평균을 계산
        // 3. 최고 성적을 조회
        // 4. 성적 분포를 출력 (A, B, C, D, F) (90, 80, 70, 60, 60이하)

        Scanner sc = new Scanner(System.in);
        boolean isStop = true;

        while (isStop) {
            System.out.print("성적을 입력하세요 (종료하려면 -1 입력): ");
            int score = sc.nextInt();

            if ( score != -1 ) {
                scores = addScore(scores, score); // 메소드 리턴 값을 기존 메소드의 number에 대입
//                System.out.println( scores.length );
//                System.out.println( score );
            } else {
                isStop = false;
            }
        }

        System.out.println("입력된 성적:");
        for (int score : scores) {
            System.out.print(score+" ");
        }
        System.out.println();
        System.out.println("성적의 평균: "+calculateAverage( scores ) );
        System.out.println("최고 성적: "+findMaxGrade( scores ));
        System.out.println("성적 분포: ");
        printScoreDistribution( scores );



    }

    public static int[] addScore(int[] scores, int score) {
        // 성적을 추가하는 메서드
        int[] newScores = new int[scores.length + 1];  // 이전 배열보다 길이가 1만큼 긴 배열

        for (int i = 0; i < scores.length; i++) {
            newScores[i] = scores[i];
        }   // 기존의 배열을 순회하며 새로운 배열에 내용을 복사 한다.

        newScores[newScores.length - 1] = score;    // 배열의 마지막 인덱스에 새 값을 추가
        scores = newScores;         // 기존 배열을 새로운 배열로 대체한다.
        return scores;
    }

    public static double calculateAverage(int[] scores) {
        // 평균을 계산하는 메서드
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
    // NaN : 배열이 비어있음, 자리는 있는 상태

    public static int findMaxGrade(int[] scores) {
        // 최고 성적 조회 메서드
//        int max = scores[0];
        int max = (scores.length) > 0 ? scores[0] : 0; // 배열의 길이가 0일 경우 예외처리
        for (int score : scores) {
            if (max < score) {
                max = score;
            }
        }
        return max;
    }

    public static void printScoreDistribution(int[] scores) {
        // 성적 분포 출력 메서드
        int[] gradenum = new int[5];
        String[] grade = {"90 이상", "80 이상", "70 이상", "60 이상","60 미만"};
        for (int score : scores) {
            if (score >= 90) {
                gradenum[0]++;
            } else if ( 80<=score) {
                gradenum[1]++;
            } else if ( 70<=score) {
                gradenum[2]++;
            } else if ( 60<= score) {
                gradenum[3]++;
            } else {
                gradenum[4]++;
            }
        }
        for (int i=0; i<gradenum.length; i++) {
            System.out.printf("%c (%s): %d\n", (char)65+i, grade[i], gradenum[i]);
        }
    }
}