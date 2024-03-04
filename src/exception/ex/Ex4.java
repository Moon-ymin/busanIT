package exception.ex;


import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int total = 0;
        String[] questions = {"3 + 5 = ?", "2 + 7 = ?", "4 + 6 = ?"};
        int[] answers = {8, 9, 10};
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("문제 " + (i + 1) +": "+ questions[i]);
                System.out.print("답변 : ");
                String str = sc.nextLine();
                Integer.parseInt(str);
                if (answers[i] == Integer.parseInt(str)) {
                    total++;
                }
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자로만 답해주세요.");
            }
        }
        System.out.printf("총 %d문제 중 %d문제를 맞혔습니다!",
                questions.length, total);
    }
}
