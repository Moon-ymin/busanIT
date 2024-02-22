public class forTest {
    // 1. 구구단
    public void guguDan( int a ) {
        for (int i = 1; i <=9 ; i++) {
            System.out.printf("%d * %d = %d\n", a, i, a*i);
        }
    }

    // 2. switch 활용 계산기
    public void cal( int a, int b, String op ) {
        switch(op) {
            case "+":
                System.out.printf("%d + %d = %d\n", a, b, a+b);
                break;
            case "-":
                System.out.printf("%d - %d = %d\n", a, b, a-b);
                break;
            case "*":
                System.out.printf("%d * %d = %d\n", a, b, a*b);
                break;
            case "/":
                System.out.printf("%d / %d = %d\n", a, b, a/b);
                break;
        }
    }

    // 3. random한 숫자로 up down 맞추기 ../loop/Ex8
    public void game(){
        Random r = new Random();
        int answer = r.nextInt(100) + 1;
    }

    // 4. 배열 2차원 합계 구하기

    // 5. 상품을 주문하는 클래스 만들기

    // 6. 게임 캐릭터 설계하기

    // 7. 장바구니 클래스 설계

    // 8. swap utility

}
