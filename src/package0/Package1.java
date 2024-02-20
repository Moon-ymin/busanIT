package package0;

import package0.first.*;
import java.util.*;

// import문
// 전체 경로를 적는 대신 클래스를 가져온다.
// 패키지 안에 있는 여러가지를 쓸 경우 *을 사용한다. (클래스명 생략 가능)

// 패키지를 사용하는 경우, 항상 코드 첫줄에 패키지 이름이 선언된다.
// 패키지를 먼저 만들고, 클래스를 생성하면, IDE에서 자동으로 선언된다.
// 패키지 : 클래스와 인터페이스 등을 묶어놓은 컨테이너 (파일로 구성된 디렉토리, 폴더)
// 코드의 모듈화, 이름 충돌 방지, 재사용
public class Package1 {
    public static void main(String[] args) {
        Data data = new Data();
        // 서로 다른 패키지에서 사용하려면 `public`키워드 필요
        // 패키지에 접근하려면, 패키지 전체 경로를 포함해 클래스를 적어줘야 한다.
        package0.first.Person person = new package0.first.Person();

        // 다른 패키지 위치의 클래스를 import를 사용하면 패키지명 생략하고 클래스 이름만 사용 가능
        Person person1 = new Person();
        Book book = new Book();
        // 자바 기본 라이브러리와 다른 라이브러리 사용할 때도 다른 패키지에 있는 클래스를 import 해서 사용
        Scanner scanner = new Scanner(System.in);

        // 클래스 이름이 중복되는 경우 패키지 이름으로 구분하여 사용
        package0.second.Person person2 = new package0.second.Person();
    }
}