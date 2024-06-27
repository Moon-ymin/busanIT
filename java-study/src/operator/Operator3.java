package operator;

public class Operator3 {
    public static void main(String[] args) {
        // 연산자 우선순위
        int sum1 = 1 + 2 * 3;
        int sum2 = (1 + 2) * 3;

        /* sum3과 sum4는 같은 결과지만 sum4가 더 낫다
        코드가 복잡해지는 것보다, 길어지더라도 명확하고 단순하게 하는 것이
        유지보수하기에 좋다.
        연산자 우선순위가 애매해지거나 복잡하면 언제나 괄호를 고려하자
        */
        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = (2 * 2) + (3 * 3);

        System.out.printf("sum1 = %d\n", sum1);
        System.out.printf("sum2 = %d\n", sum2);
        System.out.printf("sum3 = %d\n", sum3);
        System.out.printf("sum4 = %d\n", sum4);

        /* 연산자 우선순위
        1. 괄호 ( )
        2. 단항 연산자 ++, --, !, (int) 등
        3. 산술 연산자 * / 다음에 + -
        4. shift 연산자 <<, >>
        5. 비교 연산자 <, >, <=, >=
        6. 등식 연산자 ==, !=
        7. 비트 연산자 & ^ |
        8. 논리 연산자 &&, ||
        9. 삼항 연산자 ? :
        10. 대입 연산자 = += 등
         */
    }
}
