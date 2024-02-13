package loop;

public class Ex1 {
    public static void main(String[] args) {
        // 반복문을 이용해서 20이내의 짝수를 출력해주세요
        for ( int i = 1; i<20; i++) { // 증감식을 i++말고 i+=2를 적어도 됨 -> if문 필요 x
            // 증감식의 경우 1씩 증가 대신 다른 증감대입이 가능하다
            if (i % 2 == 0) {
                System.out.println("짝수 "+i);
            }
        }
    }
}
