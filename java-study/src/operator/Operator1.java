package operator;

public class Operator1 {
    public static void main(String[] args) {
        int x = 6;
        int y = 5;
        // 산술연산자 arithmetic operator
        // 연산자(operator), 피연산자(operand), 연산식(expression)
        int sum = x + y;
        int sub = x - y;
        int mul = x * y;
        int div = x / y;
        int mod = x % y; // 실무와 알고리즘에서 종종 사용됨

        // 숫자는 0으로 나눌 수 없다

        System.out.printf("sum = %d\n", sum);
        System.out.printf("sub = %d\n", sub);
        System.out.printf("mul = %d\n", mul);
        System.out.printf("div = %d\n", div);
        System.out.printf("mod = %d\n", mod);
    }
}
