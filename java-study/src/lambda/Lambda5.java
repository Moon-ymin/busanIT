package lambda;

public class Lambda5 {
    public static void main(String[] args) {
        // 매개변수가 2개인 람다식
        // 리턴 값만 한줄인 경우 return 생략, { } 생략
        ParamTwo add = (x,y) -> x + y;

        System.out.println("10 + 20 = " + add.func(10,20));

        // 본문이 여러줄인 경우, {} 추가. return 필수
        ParamTwo addAndPrint = (x, y) -> {
            int result = x + y;
            System.out.printf("%d + %d = %d\n", x, y, result);  // 순수함수 아님
            return result;
        };
        addAndPrint.func(30,40);
    }
}
