package exception;

public class Try2 {
    public static void main(String[] args) {
        try {
            int divedNumber = 10/0; // 예외 발생 가능 코드 : ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            System.out.println(e.getMessage()); // 에러 관련 메시지를 남겨줌
            e.printStackTrace(); // 예외의 stack을 추적해서 출력
            System.out.println("예외 처리 되었습니다");
        } finally {
            System.out.println("항상 출력되는 부분");
        }
        System.out.println("Try 블록 바깥");
    }
}
