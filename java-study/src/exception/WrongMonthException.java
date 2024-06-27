package exception;

// RuntimeException 을 상속받으면 컴파일 단계에서 예외처리를 강제하지 않는
// unchecked exception 을 사용자 정의할 수 있다.
public class WrongMonthException extends RuntimeException{
    // 생성자 오버로딩
    public WrongMonthException(int month) {
        // 부모 예외 클래스의 생성자를 호출
        super("와~ 그런 달도 있어요? 나도 %d월에 살아보고 싶어요.".formatted(month));
    }


}
