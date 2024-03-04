package exception.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        try {
            System.out.print("숫자 1을 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("숫자 2을 입력하세요: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;
            System.out.println("결과: "+result);

        } catch (InputMismatchException e) {
            System.out.println("유효한 숫자를 입력해주세요");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            sc.close();
        }
    }
}
