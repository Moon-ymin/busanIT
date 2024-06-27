package exception;

public class Try8 {
    public static void main(String[] args) {
        // 디증 catch 문의 순서
        // 예외 클래스는 상속 계층 구조를 가지기 때문에
        // catch 블록의 순서는 구체적인 예외(자식 클래스) → 일반적인 예외(부모 클래스)
        try{
            int[] numbers = {1,2,3};
            int dividedNumber = numbers[1] / (numbers[1] - 2); // ArithmeticException
            System.out.println(numbers[3]); // ArrayIndexOutOfBoundException
        } catch (ArithmeticException e1) {
            // 구체적인 예외1
            System.out.println("0으로 나누었습니다.");
        } catch (ArrayIndexOutOfBoundsException e2) {
            // 구체적인 예외2
            System.out.println("배열 범위 넘어섰습니다.");
        } catch (Exception e) {
            // 일반적인 예외 : 모든 예외를 catch
            System.out.println("예외가 발생");
        }
    }
}
