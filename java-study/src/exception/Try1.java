package exception;

public class Try1 {
    public static void main(String[] args) {
        // 자바 예외처리 메커니즘
        // try-catch-finally 블록을 이용해서 구현

        // 1. try 블록
        try {
            // 예외가 발생할 가능성이 있는 코드를 포함
            // 블록 내부의 코드를 실행하다가, 예외를 감지하면
            // 즉시 실행을 중단하고 catch 블록으로 넘어감
        } catch (NullPointerException e1) {
            // 2. catch 블록
            // 특정 유형의 예외를 처리
            // try 블록에서 발생한 예외와 일치하는 catch 블록이 실행
            // 예외발생시 처리할 복구 코드, 로그 코드
        } catch (IndexOutOfBoundsException e2) {
            // catch 블록은 try블록 이후에 여러개가 올 수 있다
        } finally {
            // 3. finally 블록
            // 예외 발생 여부와 관계없이 실행되어야 하는 코드
            // finally 블록은 선택적으로 포함하지 않아도 됨
            // 주로, 사용한 리소스를 정리할 때 사용. 항상 실행
        }
    }
}
