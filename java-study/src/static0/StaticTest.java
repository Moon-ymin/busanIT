package static0;

public class StaticTest {
    // 필드
    private int instanceVariable;       // 인스턴스 변수 (힙 영역, 생성될 때 호출 가능)
    private static int classVariable;   // 클래스 변수

    // 생성자

    // 메서드
    // 클래스 메서드(=스태틱 메서드)
    public static void staticInnerCall() {
        // instanceVariable++;      // 스태틱 메서드에서 인스턴스 변수 접근 불가, 컴파일 에러
        classVariable++;        // 스태틱 메서드에서 클래스 변수 접근 가능

        // instanceMethod();    // 인스턴스 메서드 접근 불가
        classMethod();      // 클래스 메서드 접근 가능
    }

    // 인스턴스 메서드
    public void innerCall() {
        instanceVariable++;     // 인스턴스 메서드에서 인스턴스 변수 접근 가능
        classVariable++;        // 인스턴스 메서드에서 클래스 변수 접근 가능

        instanceMethod();   // 호출 가능
        classMethod();      // 호출 가능
    }

    private void instanceMethod() {
        System.out.println(instanceVariable);
    }

    private static void classMethod() {
        System.out.println(classVariable);
    }
}