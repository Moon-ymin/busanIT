package method;

public class Ex4 {
    public static void main(String[] args) {
        // 배열에서 최소값과 최대값 찾기
        // 배열 내의 최소값과 최대값을 찾아 출력하는 메소드 findMinAndMax를 작성하세요.
        int[] numbers = { 10, 16, 28, 94, 35, 27, 2 };
        findMinAndMax( numbers );
    }
    public static void findMinAndMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        for( int number:numbers) {
            if (min > number) {
                min = number;
            }
            if (max < number) {
                max = number;
            }
        }
        System.out.printf("최소값 : %d, 최대값 : %d", min, max);
    }

}