package array;

public class Array6 {
    public static void main(String[] args) {
        // 다차원 배열 초기화
        int[][] matrix = new int[5][5]; // 3행 2열

        int i = 1;
        for (int row=0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = i++; // 행열의 위치에 1씩 증가하며 대입
            }
        }

        // 2차원 배열 출력
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print( col + " ");
            }
            System.out.println();
        }

        /* { { 1, 2}
             { 3, 4} }
         */
    }
}
