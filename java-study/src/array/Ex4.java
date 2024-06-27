package array;

public class Ex4 {
    public static void main(String[] args) {
        // 2차원 배열의 합계 구하기
        // 2차원 정수 배열을 선언하고 모든 요소의 합계를 계산하는 프로그램을 만드세여
        int[][] matrix = {
                {11, 12, 13},
                {21, 22, 23},
                {31, 32, 33},
                {41, 42, 43}
        };

        int sum = 0;
        for (int[] rows : matrix) {
            for (int col : rows) {
                sum += col;
            }
        }
        System.out.println("모든 요소의 합은 : "+ sum);
    }
}
