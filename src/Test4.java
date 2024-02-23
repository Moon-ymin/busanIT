public class Test4 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8}
        };
        int sum = 0;

        System.out.println("2차원 정수 배열");
        for( int[] rows : matrix ) {
            for (int col : rows) {
                System.out.print(col + " ");
                sum += col;
            }
            System.out.println( );
        }
        System.out.println("합계 : " + sum);
    }
}
