package static0;

public class Person {
    // final은 최종적이라는 뜻을 가진 필드
    // 초기화가 되지 않으면 컴파일 에러가 발생한다
    // 생성자를 통해서 초기값을 부여받을 수 있다
    // 필드
    final String nation = "Korea"; // 국가
    final String ssn;              // 주민번호
    String name;             // 이름

    // 생성자
    public Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
