package nested.ref;

public class Main {
    public static void main(String[] args) {
        // 바깥 인스턴스 객체 생성
        OuterClass outerClass = new OuterClass();

        // 안쪽 인스턴스 객체 생성
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        // 안쪽에서 호출 테스트
        innerClass.call();
    }
}
