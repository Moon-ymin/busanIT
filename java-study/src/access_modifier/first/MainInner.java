package access_modifier.first;

public class MainInner {
    public static void main(String[] args) {
        Data data = new Data();

        data.publicData = 1000;
        data.defaultData = 1000;
//        data.privateData  같은 패키지 메인 접근불가


        data.publicMethod();
        data.defaultMethod();
//        data.privateMethod(); 같은 패키지 메인 접근불가

    }
}
