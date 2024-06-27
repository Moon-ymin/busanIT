package condition;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        /* 계절 판별하기
        사용자로부터 월을 나타내는 숫자(1~12)를 입력받아,
        해당 월이 어느 계절에 속하는지를 출력하는 프로그램을 작성하세요.
        예를 들어, 3월부터 5월까지는 "봄", 6월부터 8월까지는 "여름",
        9월부터 11월까지는 "가을", 12월, 1월, 2월은 "겨울"입니다.
         */

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        if ( ( 1<=month && month <3 ) || ( month == 12) ) {
            System.out.println("겨울");
        } else if ( 3<=month && month < 6) {
            System.out.println("봄");
        } else if ( 6<=month && month < 9) {
            System.out.println("여름");
        } else if ( 9<=month && month < 12) {
            System.out.println("가을");
        }
    }
}