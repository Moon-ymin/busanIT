package variable;

public class Type5 {
    public static void main(String[] args) {
        byte v1 = 10;
        int v2 = 100;
        long v3 = 1000L;
        long result = v1 + v2 + v3; // 가장 큰 허용 범위 타입으로
        int result2 = (int) (v1 + v2 + v3); // 가장 큰 허용 범위 타입으로

        int v4 = 10 / 4; // 2 0.5는 버림
        double v5 = 10 / 4; // 2.0 계산식 내에서는 int, 변수 타입이 실수
        double v6 = 10 / 4.0; // 2.5

        System.out.println(result + "\n" + result2 + "\n" + v4 + "\n" + v5 + "\n" + v6 );
    }
}
