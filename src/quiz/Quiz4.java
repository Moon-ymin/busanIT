package quiz;

public class Quiz4 {
    public static void main(String[] args) {
        int[] numbers = {54, 32, 21, 6, 24, 3, 100, -5};
        findMinAndMax( numbers );
    }
    public static void findMinAndMax( int[] numbers ){
        int min = numbers[0];
        int max = numbers[1];
        for (int i : numbers) {
            if ( min > i ) {
                min = i;
            }
            if (max < i ) {
                max = i;
            }
        }
        System.out.printf("최소값 : %d 최대값 : %d", min, max);
    }
}
