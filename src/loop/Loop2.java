package loop;

public class Loop2 {
    public static void main(String[] args) {
        // 1부터 하나씩 증가하는 수를 더하기 1 + 2 + 3 + ...
        /*
        int sum = 0;
        int i = 10;

        sum = sum + i;  // sum = 0 + 1
        System.out.println("sum = " + sum);
        i++;            // i = 1 + 1 = 2

        sum = sum + i;  // sum = 0 + 1 + 2
        System.out.println("sum = " + sum);
        i++;            // i = 3

        sum = sum + i;  // sum = 0 + 1 + 2 + 3
        System.out.println("sum = " + sum);
         */

        int sum = 0;
        int i = 1;
        int end = 100;

        // 반복문을 사용하게 될 경우, 반복 횟수와 요구조건을 유연하게 변경할 수 있다
        while (i <= end) {
            sum += i;
            System.out.println("sum = " + sum);
            i++;
        }

    }
}
