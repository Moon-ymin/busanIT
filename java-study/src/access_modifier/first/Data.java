package access_modifier.first;

public class Data {
    // 접근 제한자 종류별 필드
    public int publicData;
    int defaultData;
    private int privateData;

    public void publicMethod() {
        System.out.println("Data.publicMethod");
    }

    void defaultMethod() {
        System.out.println("Data.defaultMethod");
    }
    private void privateMethod() {
        System.out.println("Data.privateMethod");
    }

    // 내부에서 접근 시
    void innerAccess() {
        // 필드 접근 : 모두 접근 가능
        publicData = 1000;
        defaultData = 1000;
        privateData = 1000;

        // 메소드 호출 : 모두 접근 가능
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
