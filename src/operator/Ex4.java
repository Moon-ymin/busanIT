package operator;

public class Ex4 {
    public static void main(String[] args) {
        // 다음 코드는 사다리꼴의 넓이를 구하는 코드입니다.
        // 정확히 소수 자릿수가 나올 수 있도록 빈칸을 채워주세요
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area = ( lengthTop + lengthBottom ) * height * 0.5;
        // 소수 나오게 0.5와 같이 실수 형태로 적은 것
        System.out.println(area);
    }
}