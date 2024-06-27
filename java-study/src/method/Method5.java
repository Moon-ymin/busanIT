package method;

public class Method5 {
    public static void main(String[] args) {
        int number = 3;
        System.out.println("메소드 호출 전 : " + number);     // 3
        multoply2(number);
        System.out.println("메소드 호출 후 : " + number);     // 6(x) => 3
        // 자바에서 메소드는 변수의 값을 복사해서 대입한다.

    }

    public static void multoply2(int number) {
        // 메인 메소드의 number와 multiply2 메소드의 number는 다른 값이다.
        // 메인 메소드의 number를 복사한 값이다.
        System.out.println("메소드 호출 연산 실행 전 : " + number); // 3
        number = number * 2;
        // 다른 메소드에서 변경된 number의 값은 메인 메소드의 number에 영향을 주지 않는다.
        System.out.println("메소드 호출 연산 실행 후 : " + number); // 6
    }
}
