package MathLib;

/**
 * 수학 연산을 위한 클래스
 *
 * @author 문영민
 */

public class MathUtil {
    /**
     * 정수형 변수 2개를 받아 더 큰 수 출력하는 메서드
     * @param a 정수
     * @param b 정수
     * @return 더 큰 정수 출력
     */
    public static int max(int a, int b) {
        return ( a > b ? a : b);
    }

    /**
     * 정수형 변수 2개를 받아 더 작은 수 출력하는 메서드
     * @param a 정수
     * @param b 정수
     * @return 더 작은 정수 출력
     */
    public static int min(int a, int b) {
        return ( a > b ? b : a);
    }

    /**
     * 정수형 변수 2개를 받아 합을 출력하는 메서드
     * @param a 정수
     * @param b 정수
     * @return 두 정수의 합을 출력
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * 정수형 변수의 팩토리얼 값 출력
     * @param n 정수
     * @return 1부터 정수까지 모든 값의 곱인 팩토리얼 출력
     */
    public static int factorial(int n) {
        if (n==1) return 1;
        return n*factorial(n-1);
    }
}