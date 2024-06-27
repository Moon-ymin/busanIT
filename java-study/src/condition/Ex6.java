package condition;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // 회원의 등급이 A, B, C, D가 있습니다.
        // 등급이 A일 경우 : VVIP와 VIP 혜택
        // 등급이 B일 경우 : VIP 혜택
        // 등급이 C일 경우 : 우수회원과 일반회원 혜택
        // 등급이 D일 경우 : 일반회원 혜택
        // 모든 경우 마지막에는 "감사합니다"를 출력합니다.
        // Switch문을 활용해서 각 등급마다 혜택을 받는 조건문 프로그래밍을 만들어주세요.

        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        switch ( grade ) {
            case "A":
                System.out.println("VVIP와 VIP 혜택\n감사합니다.");
                break;
            case "B":
                System.out.println("VVIP와 VIP 혜택\n감사합니다.");
                break;
            case "C":
                System.out.println("우수회원과 일반회원 혜택\n감사합니다.");
                break;
            case "D":
                System.out.println("일반회원 혜택\n감사합니다.");
                break;


        }

    }
}