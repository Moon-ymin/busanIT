package operator;

public class Operator5 {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        /* 증감연산자
        전위형 : y = ++x : x 먼저 증가시키고 y값에 대입
        후위형 : y = x++ : y값에 x대입하고 x값 증가시키기
        */
        y = ++x; // 전위(prefix) 증가 연산자
                 // x의 값을 먼저 증가시키고, 그 결과를 y에 대입
        System.out.println("y  = " + y + ", x = " + x); // y=2, x=2
        y = x++; // 후위(Postfix) 증가 연산자
                 // x의 값을 y에 대입하고, x를 증가
        System.out.println("y  = " + y + ", x = " + x); // y=2, x=3

    }
}
