package class0;


public class Class4 {
    public static void main(String[] args) {
        Student student1;            // Student 라는 타입의 변수를 선언
        student1 = new Student();    // Student 타입의 변수를 초기화, 객체를 생성, 인스턴스화
        // 객체를 메소드로 전달 (참조값을 복사)
        // 메소드 내에서 변경된 필드 값들은 실제 객체에 적용이 된다
        initStudent(student1, "홍길동", 80, 30);

        Student student2 = new Student(); // 선언과 초기화 같이
        initStudent(student2, "임꺽정", 70, 40);

//        System.out.println(student2); // 디버그 걸어서 클래스 메모리 할당 보기

        // Extract Method 기능으로 객체의 필드에 접근하는 반복되는 코드 블록을 메서드로 만든다.
        // 전달된 학생 객체의 필드 값을 읽어서 출력할 수 있다.
        printInformation(student1);
        printInformation(student2);

    }
    
    // 학생 객체의 필드 값을 읽어서 출력하는 메서드
    public static void printInformation( Student student ) {
        System.out.println("[ 학생 이름 : " + student.name + ", 점수 : " + student.score + ", 나이 : " + student.age + " ]");
    }
    // 학생 객체의 필드를 초기화 해주는 메소드
    public static void initStudent(Student student, String name, int score, int age) {
        student.name = name;
        student.age = age;
        student.score = score;
    }
}
