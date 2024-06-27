package quiz;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("환전할 금액을 입력하세요 : ");
        int dollar = sc.nextInt();

        if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else if ( dollar > 0 ) {
            System.out.printf("환전 금액은 %d원 입니다.", dollar*1336);
        } else if ( dollar < 0 ) {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}
