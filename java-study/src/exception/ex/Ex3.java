package exception.ex;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("이메일 주소를 입력하세요 : ");
            String email = sc.nextLine();
            checkEmail(email);
            System.out.println("이메일 주소가 유효합니다.");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }

    }
    private static void checkEmail(String email){
        if (!email.contains("@")) {
            throw new InvalidEmailException("유효하지 않은 이메일 주소입니다.");
        }
    }
}
