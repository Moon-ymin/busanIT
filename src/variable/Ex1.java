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

        /* 변수 선언과 초기화:
        정수 타입의 변수 "number"를 선언하고, 값으로 10을 할당하세요.
        소수 타입의 변수 "decimal"를 선언하고, 값으로 3.14를 할당하세요.
        문자 타입의 변수 "letter"를 선언하고, 값으로 'A'를 할당하세요.
        부울 타입의 변수 "isTrue"를 선언하고, 값으로 true를 할당하세요.
        변수 값 변경:

        "number" 변수의 값을 5로 변경하고, 변경된 값을 출력하세요.
        "decimal" 변수의 값을 2.71828로 변경하고, 변경된 값을 출력하세요.
        "letter" 변수의 값을 'B'로 변경하고, 변경된 값을 출력하세요.
        "isTrue" 변수의 값을 false로 변경하고, 변경된 값을 출력하세요.
         */
        int number = 10;
        double decimal = 3.14;
        char letter = 'A';
        boolean isTrue = true;

        number = 5;
        System.out.println(number);
        decimal = 2.71828;
        System.out.println(decimal);
        letter = 'B';
        System.out.println(letter);
        isTrue = false;
        System.out.println(isTrue);
    }
}
