package loop;

public class Loop1 {
    public static void main(String[] args) {
        /* 반복문 while
        while (조건식) {
            // 조건식이 true일 때 반복할 코드
            // 조건식이 false일 경우 while문을 벗어난다
            // 조건식이 false가 되는 경우가 없으면 무한반복
         */
        int count = 0;

        while (count < 100) { // 조건식
            count ++;         // 증감식
            System.out.println("숫자 : " + count);
        }

    }
}
