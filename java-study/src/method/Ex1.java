package method;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // 두 수를 입력받아 뺄셈을 하는 메서드를 만들어라
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수를 입력하시오 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        cal(a, b);
    }
    public static void cal(int x, int y) {
        int min = x - y;
        System.out.println("두 수의 뺄셈은 "+min);
    }
}
