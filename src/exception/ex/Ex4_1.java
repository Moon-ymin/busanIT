package exception.ex;

import java.util.Scanner;

public class Ex4_1 {
    // 수업에서 한 방식 1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 문제 배열, 정답 배열
        String[] questions = {"3 + 5 = ?", "2 + 7 = ?", "4 + 6 = ?"};
        int[] answers = {8, 9, 10};
        int correctAnswers = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("문제 " + (i+1) + ": " + questions[i]);
            System.out.print("답: ");
            String inputAnswer = scanner.nextLine();
            int answer = 0;
            try {
                answer = Integer.parseInt(inputAnswer); // 에러 발생 코드
            } catch (NumberFormatException e) {
                System.out.println("유효하지 않은 답변입니다.");
            }
            if (answer == answers[i]) {
                System.out.println("정답입니다.");
                correctAnswers++;
            }
        }

        System.out.println("총 " + questions.length + "문제 중 " + correctAnswers + "문제를 맞혔습니다.");
    }
}
