package operator;

public class Operator4 {
    public static void main(String[] args) {
        // 증감 연산자
        int x = 0;

        x = x + 1;
        System.out.println("x = " + x); // 1
        x = x + 1;
        System.out.println("x = " + x); // 2

        /* 증감연산자
        전위형 : y = ++x : x 먼저 증가시키고 y값에 대입
        후위형 : y = x++ : y값에 x대입하고 x값 증가시키기
        */
        ++x;
        System.out.println("x = " + x); // 3
        x++;
        System.out.println("x = " + x); // 4
        --x;
        System.out.println("x = " + x); // 3
        x--;
        System.out.println("x = " + x); // 2


    }
}
