package m_object;

// 단 하나의 객체만 사용하는 싱글턴 패턴 클래스
public class SingletonJava {
    private static final SingletonJava INSTANCE = new SingletonJava();

    private SingletonJava() {}

    private static SingletonJava getInstance() {
        return INSTANCE;
    }
}
