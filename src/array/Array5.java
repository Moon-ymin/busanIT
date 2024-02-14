package array;

public class Array5 {
    public static void main(String[] args) {
        // 다차원 배열 초기화
        int[][] matrix = {
                {1, 2},
                {3, 4},
                {5, 6}
        }; // 3행 2열


        for (int row=0; row<3; row++) {
            for (int col=0; col<2; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
