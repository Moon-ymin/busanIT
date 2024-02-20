package access_modifier.second;

import access_modifier.first.A;

public class C {
    // 다른 패키지에서는 default 접근제한자에 접근 불가 (컴파일 에러)
    // A a = new A(); // 같은 패키지 내부에서는 default 접근 가능

    // 외부 패키지에서 접근
    A publicA = new A(100);     // public 접근 가능
//    A defaultA = new A();          // default 접근 불가
//    A privateA = new A("private"); // private 접근 불가
}
