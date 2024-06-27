package class1.ex;

public class Ex1 {
    public static void main(String[] args) {
        // Person 클래스를 설계 해주세요.
        // 필드 : name, age, gender
        // 생성자 : 모든 속성을 초기화하는 생성자, 이름, 성별만 초기화하는 생성자
        // 메서드 : 필드 정보를 출력하는 printInfo()

        // main 메서드에서 사용해보세요.
        Person person = new Person("홍길동", 30, "남자");
        Person person1 = new Person("유관순", "여자");

        person.printInfo();
        person1.printInfo();
    }
}