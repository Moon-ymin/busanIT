package exception.ex;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("비밀번호를 입력하세요: ");
        String str = sc.nextLine();
        isAvailable(str);
    }
    private static void isAvailable( String password ){
        if ( password.length() < 8 ) {
            throw new IllegalArgumentException("비밀번호는 최소 8자 이상이어야 합니다.");
        } else if (!password.matches(".*[0-9].*")){
            throw new IllegalArgumentException("비밀번호에는 최소 하나의 숫자가 포함되어야 합니다.");
        } else if (!password.matches(".*[A-Z].*")){
            throw new IllegalArgumentException("비밀번호에는 최소 하나의 대문자가 포함되어야 합니다.");
        }
        System.out.println("비밀번호가 성공적으로 설정되었습니다.");
    }
}
