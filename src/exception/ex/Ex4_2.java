package exception.ex;
import java.util.Scanner;
public class Ex4_2 {
    // 수업에서 한 방식 2
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
            try {
                int answer = parseAnswer(inputAnswer);
                // 오류가 발생할 경우 아래 구문에 닿지 않아서
                // 오류가 발생하지 않을 때만 정답 로직이 실행됨.
                if (answer == answers[i]) {
                    System.out.println("정답입니다.");
                    correctAnswers++;
                }
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("총 " + questions.length + "문제 중 " + correctAnswers + "문제를 맞혔습니다.");
    }

    private static int parseAnswer(String inputAnswer) throws InvalidInputException {
        try {
            return Integer.parseInt(inputAnswer); // 예외가 발생하는 코드
        } catch (NumberFormatException e) {
            throw new InvalidInputException("유효하지 않은 답변입니다.");
        }
    }


    class InvalidInputException extends Exception {
        public InvalidInputException(String message) {
            super(message);
        }
    }
}

