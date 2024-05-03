package p_extension;

public class JavaMain {
    public static void main(String[] args) {
        // 자바에서 확장함수 호출 시 스태틱 함수처럼 사용할 수 있음
        char lastChar = Extension4Kt.lastChar("홍길동");
        System.out.println("lastChar = " + lastChar);
        // "홍길동".lastChar() <- 코틀린처럼 사용 불가
    }
}
