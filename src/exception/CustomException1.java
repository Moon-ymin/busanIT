package exception;

public class CustomException1 extends Exception {
    // 사용자 정의 예외 : 특정 상황에 맞는 예외를 정의
    // Exception 클래스를 상속받아서 사용자 정의 예외를 만들면,
    // checked Exception이 된다

    // 생성자 : 오류 메시지 생성 시 입력
    public CustomException1(String message) {
        super(message);
    }

    public static void method() throws CustomException1 {
        // 예외 발생시키기 : 사용자 정의 예외를 코드에서 직접 발생 시킬 때
        // throw new 사용자정의Exception 생성자
        throw new CustomException1("내가 만든 체크 예외");
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (CustomException1 e) {
            System.out.println(e.getMessage());
            /*// 런타임 예외 발생
            throw new RuntimeException(e);*/
        }
    }
}
