package m_object;

public class Test {
    public static void main(String[] args) {
        // static 필드는 같은 클래스의 모든 객체가 공유한다.
        Counter c1 = new Counter();
        System.out.println(c1.count);

        Counter c2 = new Counter();
        System.out.println(c2.count);
        System.out.println(c1.count);

    }
}