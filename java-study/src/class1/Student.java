package class1;

public class Student {
    // 필드
    String name;
    int score;
    int age;

    // 생성자
    Student() {
        // 기본 생성자
        System.out.println("기본 생성자 호출");
    }
    Student(String name, int score, int age) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // 메서드
    // 초기화 메서드
    // 초기화 메서드
    void initStudent( String nameParameter, int score, int age ) {
        // 필드와 매개변수의 이름이 같아서 데이터가 입력되지 않을 때 : Variable 'name' is assigned to itself
        name = nameParameter; // 1. 이름을 다르게 한다
        this.score = score;        // 2. this 키워드를 사용한다
        this.age = age;

        // 객체의 필드 값(age)에 매개변수 (age)를 대입하겠다.
        // this 는 객체 자신을 참조하는 참조 변수
    }
}
