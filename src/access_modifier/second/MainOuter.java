package access_modifier.second;

import access_modifier.first.Data;

public class MainOuter {
    public static void main(String[] args) {
        Data data = new Data();

        // 외부 + 다른 패키지 접근시 private, default 접근 불가
        data.publicData = 1000;
        // data.defaultData = 1000;
        // data.privateData         필드

        data.publicMethod();
        // data.defaultMethod();
        // data.privateMethod()        메서드
    }
}