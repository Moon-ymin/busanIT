package loop;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        // 최대공약수와 최소공배수 구하기
        // 두 개의 자연수를 입력받아, 유클리드 호제법을 사용하여
        // 최대 공약수(GCD)와 최소 공배수(LCM)를 찾는 프로그램을 작성하세요.
        // 최소 공배수는 두 수의 곱을 최대 공약수로 나눈 값으로 구할 수 있습니다.

        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 숫자: ");
        int a = scanner.nextInt();
        System.out.print("두 번째 숫자: ");
        int b = scanner.nextInt();

        int originalA = a;      // 원래 숫자를 보관
        int originalB = b;

        while( b != 0 ) {
            int temp = b;       // 이전 b값을 임시 변수에 보관
            b = a%b;            // 나머지를 다시 b에 대입한다. 나머지가 있으면 계속 나눈다.
            a = temp;           // 이전 b값을 a에 대입
        }

        int gcd = a; // 최대공약수
        System.out.println("gcd = " + gcd);

        int lcm = (originalA * originalB) / gcd; // 최소공배수
        System.out.println("lcm = " + lcm);
    }
}