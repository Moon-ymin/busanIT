package variable;

public class Ex1 {
    public static void main(String[] args) {
        // 연습문제 1: 5와 3을 다른 숫자로 한번에 변경할 수 있게 변수로 선언
        int a = 5;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);

        /* 연습문제 2: 변수 n1, n2를 선언하고 30, 40할당.
        두 변수의 합을 저장하는 sum 변수 선언
        sum 출력
         */
        int n1 = 30;
        int n2 = 40;
        int sum = n1 + n2;
        System.out.printf( "n1과 n2의 합은 %s입니다.\n", sum);

        /* 연습문제 3: 100억을 담는 변수를 선언하고 출력
        boolean 타입의 변수를 선언하고 출력해보세요
         */
        long num = 10_000_000_000L;
        System.out.println( num );
        boolean c = true;
        System.out.println( c );
    }
}
