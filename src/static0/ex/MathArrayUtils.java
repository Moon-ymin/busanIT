package static0.ex;

public class MathArrayUtils {
    private MathArrayUtils() { }

    public static int sum(int[] nums){
        int result = 0;
        for(int n : nums) {
            result += n;
        }
        return  result;
    }

    public static double average(int[] nums) {
        return (double) sum( nums ) / nums.length;
    }
    public static int min(int[] nums) {
        int result = nums[0];
        for (int n : nums) {
            if ( n < result) {
                result = n;
            }
        }
        return result;
    }

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
