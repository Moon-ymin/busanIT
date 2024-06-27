package quiz.quiz3.q4;

import exception.ex.InvalidEmailException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("이메일 주소를 입력하세요: ");
            String email = sc.nextLine();
            check(email);
            System.out.println("이메일 주소가 유효합니다.");
        } catch (InvalidEmailException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
    public static void check(String s) {
        if (!s.contains("@")){
            throw new InvalidEmailException("유효하지 않은 이메일 주소입니다.");
        }
    }
}
