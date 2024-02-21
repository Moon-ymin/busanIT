package static0.ex;

import static static0.ex.MathUtility.*;

public class Ex2 {
    public static void main(String[] args) {
        // 객체 생성 없이 호출하기 위해 MathUtility에서 static메소드 만듦
        System.out.println("Max of 10, 20: " + MathUtility.max(10, 20));
        System.out.println("Min of 10, 20: " + MathUtility.min(10, 20));
        System.out.println("Sum of 10, 20: " + MathUtility.sum(10, 20));
        System.out.println("Factorial of 5: " + MathUtility.factorial(5));

        System.out.println("---------------------------------------------------");

        // MathUtility 부분 alt+enter해서
        // 스태틱 import를 사용하면 클래스 이름 생략하고 메서드 호출 가능
        System.out.println("Max of 10, 20: " + max(10, 20));
        System.out.println("Min of 10, 20: " + min(10, 20));
        System.out.println("Sum of 10, 20: " + sum(10, 20));
        System.out.println("Factorial of 5: " + factorial(5));
    }
}

/*
    Max of 10, 20: 20
    Min of 10, 20: 10
    Sum of 10, 20: 30
    Factorial of 5: 120
 */