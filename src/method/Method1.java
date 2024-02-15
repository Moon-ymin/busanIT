package method;

public class Method1 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int sum = x + y;
        System.out.println("덧셈 결과 : " + sum);

        sum(3, 5);       // 메소드 호출
        sum(11, 20);       // 메소드 호출

        int number = sum(15, 40);       // 리턴(출력) 값을 변수에 저장할 수 있다.
        System.out.println("number = " + number);
        /*

        int x2 = 3;
        int y2 = 5;
        int sum2 = x2 + y2;
        System.out.println("덧셈 결과 : " + sum2);

        int x3 = 10;
        int y3 = 20;
        int sum3 = x2 + y2;
        System.out.println("덧셈 결과 : " + sum2);

         */
    }

    // 함수 (function)
    // 수학에서 가져온 개념 : 값을 입력하면, 연산을 처리하여 결과를 출력한다.
    // 자바에서는 함수를 메서드(Method)라고 한다.

    /*
    [리턴 타입] [메소드 이름] ( [매개변수 ...] ) {
        // 실행할 코드
    }
     */

    // sum 메소드 선언(Declaration)
    public static int sum(int x, int y) {           // 메서드 시그니쳐
        int sum = x + y;
        System.out.println("덧셈 결과 : " + sum);
        return sum;                   // 반환 결과
    }
}