package operator;
// alt + j 같은 것 동시 선택
public class Operator9 {
    public static void main(String[] args) {
        // 논리 연산자
        // boolean 형인 true와 false를 비교하는데 사용한다.
        /*
        && (And, 그리고) : 두 피연산자가 모두 참이면 참, 하나라도 거짓이면 거짓
        || (Or, 또는) : 두 피연산자 중 하나만 참이라도 참, 둘 다 거짓이면 거짓
        !  (Not, 부정) : 참이면 거짓, 거짓이면 참
         */

        System.out.println(" AND 연산 ");
        System.out.println(true && true);       // true
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(" OR 연산 ");
        System.out.println(true || true);       // true
        System.out.println(true || false);      // true
        System.out.println(false || true);      // true
        System.out.println(false || false);

        System.out.println(" 부정 연산");
        System.out.println(!true);          // false
        System.out.println(!false);         // true

        int x = 15;
        // x는 10보다 크고 20보다 작다
        boolean result = x>10 && x<20;
        System.out.println("result = " + result); // true
    }
}
