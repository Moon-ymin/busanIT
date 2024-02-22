package static0;

public class Singleton {
    // 싱글톤 : 전체 프로그램에서 단 하나의 객체만 만들도록 보장해야하는 디자인 패턴

    // 필드 : 정적 필드에 자기 자신 타입의 인스턴스를 선언
    private static Singleton instance;

    // 생성자 : 외부에서 생성을 못하도록 생성자 접근을 막음
    private Singleton() {

    }


    // 메서드
    public static Singleton getInstance(){
        // 최소 한 번의 객체를 생성하고 = 생성된 객체가 없다면
        if (instance == null) {
            instance = new Singleton();
        }
        // 객체가 존재한다면 생성된 객체를 반환한다
        return instance;
    }
}
