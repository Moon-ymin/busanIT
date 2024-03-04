package exception.ex;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("나이를 입력하세요: ");
            int age = sc.nextInt();
            checkAge(age); // 나이를 검증하는 메서드
            // 예외가 발생할 경우 하단의 코드에 닿지 않는다.
            System.out.println("접근이 허용되었습니다.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
    private static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("미성년자는 접근할 수 없습니다.");
        }
    }
}
