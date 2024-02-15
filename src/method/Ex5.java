package method;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        // 두 정수와 연산기호를 매개변수로 받아 연산 결과를 리턴하는 메서드를 작성하세요.
        // 메서드 이름 : calculate
        /* 호출 예시
        첫 번째 정수를 입력하세요: 10
        두 번째 정수를 입력하세요: 20
        연산 기호를 입력하세요: +
        연산 결과: 30
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요: ");
        int x = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int y = sc.nextInt();
        System.out.print("연산 기호를 하세요: ");
        String operator = sc.next();

        System.out.println("연산 결과: " + calculate(x,y,operator));
    }
    public static int calculate( int x, int y, String operator ) {
//        int result = 0;
//        switch (operator){
//            case "+":
//                result = x + y;
//                break;
//            case "-":
//                result = x - y;
//                break;
//            case "*":
//                result = x * y;
//                break;
//            case "/":
//                result = x / y;
//                break;
//        }
        switch (operator) {
            case "+": return x + y;
            case "-": return x - y;
            case "*": return x * y;
            case "/": return x / y;
            default: return 0;
        }
    }
}