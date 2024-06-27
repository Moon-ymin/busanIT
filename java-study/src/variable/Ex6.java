package variable;

public class Ex6 {
    public static void main(String[] args) {
        // 빈칸을 채우고 타입이 어떻게 왜 변하는지 스스로 설명~
        // 프로모션 문제
        int num1 = 10;
        long num2 = 20L;
        long result = num1 + num2;

        // 캐스팅 문제
        double num3 = 10.5;
        int result2 = (int) num3;

        // 프로모션과 캐스팅
        int num4 = 10;
        double num5 = 5.5;
        int result3 = (int) (num4 + num5);
        double result4 = num4 + num5;

        System.out.println(result+"\n"+result2+"\n"+result3+"\n"+result4);

    }
}
