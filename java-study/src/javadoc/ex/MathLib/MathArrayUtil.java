package MathLib;

/**
 * 정수형 배열의 연산을 수행하는 클래스
 */
public class MathArrayUtil {
    /**
     * 클래스의 생성자
     */
    public MathArrayUtil() { }

    /**
     * 정수형 배열의 모든 값의 합을 출력하는 메서드
     * @param nums 정수형 배열
     * @return 정수형 배열 내 모든 값들의 합 출력
     */
    public static int sum(int[] nums){
        int result = 0;
        for(int n : nums) {
            result += n;
        }
        return  result;
    }

    /**
     * 정수형 배열의 평균을 출력하는 메서드
     * @param nums 정수형 배열
     * @return 정수형 배열 내 모든 값들의 평균 값 출력
     */
    public static double average(int[] nums) {
        return (double) sum( nums ) / nums.length;
    }

    /**
     * 정수형 배열의 최소값을 출력하는 메서드
     * @param nums 정수형 배열
     * @return 정수형 배열 내 최소값 출력
     */
    public static int min(int[] nums) {
        int result = nums[0];
        for (int n : nums) {
            if ( n < result) {
                result = n;
            }
        }
        return result;
    }

    /**
     * 정수형 배열의 최대값을 출력하는 메서드
     * @param nums 정수형 배열
     * @return 정수형 배열 내 최대값 출력
     */
    public static int max(int[] nums) {
        int result = nums[0];
        for (int n : nums) {
            if( n > result ) {
                result = n;
            }
        }
        return result;
    }
}