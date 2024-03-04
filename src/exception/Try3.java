package exception;

public class Try3 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        try {
            int number = numbers[3]; // ArrayIndexOutOfBoundsException
            // 예외가 발생할 경우 이후 코드 구문 실행하지 않고, catch 블록으로 넘어간다
            int dividedNumber = 10/0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 범위 초과했습니다." + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다." + e.getMessage());
        }
    }
}
