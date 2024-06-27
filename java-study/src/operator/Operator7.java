package operator;

public class Operator7 {
    public static void main(String[] args) {
        // 두 값을 비교하는데 사용되는 비교 연산자
        // == != > < >= <=
        // 비교연산자의 결과는 참 또는 거짓, boolean 타입의 결과

        int a = 5;
        int b = 10;
        System.out.println(a == b); // 5 == 10 => false
        System.out.println(a != b); // true
        System.out.println(a > b);  // false
        System.out.println(a < b);  // true
        System.out.println(a >= b); // false
        System.out.println(a <= b); // true

        boolean result = a == b;
        System.out.println(result); // false

        // 조건문과 함께 자주 사용된다.
    }
}
