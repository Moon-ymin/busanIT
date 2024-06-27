import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요: ");
        int a = sc.nextInt();
        System.out.print("두번째 숫자를 입력하세요: ");
        int b = sc.nextInt();
        System.out.print("연산자를 입력하세요: ");
        String op = sc.next();

        switch (op) {
            case "+":
                System.out.println("결과는 " + (double)(a+b));
                break;
            case "-":
                System.out.println("결과는 " + (double)(a-b));
                break;
            case "*":
                System.out.println("결과는 " + (double)(a*b));
                break;
            case "/":
                if ( b == 0 ) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    break;
                } else {
                    System.out.println("결과는 " + (double)(a/b));
                    break;
                }
        }
    }
}
