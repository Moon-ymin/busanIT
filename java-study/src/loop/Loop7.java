package loop;

public class Loop7 {
    public static void main(String[] args) {
        // 1부터 10까지 합계를 더하는 for문을 작성
        int sum = 0;
        for ( int i = 1; i<11; i++) {
            System.out.println("i = " + i);
            sum += i;
        }
        System.out.println("sum = " + sum);

        // while문과 동일한 구조를 갖지만, 반복되는 코드에 집중할 수 있고 깔끔하게 볼 수 있다.
    }
}
