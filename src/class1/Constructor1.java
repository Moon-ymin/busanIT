package class1;

public class Constructor1 {
    public static void main(String[] args) {
        Student student = new Student();      // 객체 생성

        // 객체의 필드값을 초기화
        student.name = "홍길동";
        student.score = 80;
        student.age = 30;

        // 생성 및 초기값 입력이 반복
        Student student1 = new Student();
        student1.name = "임꺽정";
        student1.score = 70;
        student1.age = 40;

        // 초기화 메서드를 통해 생성
        Student student2 = new Student();
        initStudent(student2, "이순신", 100, 35);

        // 객체 초기화 메서드를 통해 생성
        Student student3 = new Student();
        student3.initStudent("이몽룡", 90, 20);

        // 생성자를 통해 객체 생성 및 초기화
        Student student4 = new Student("전우치", 75, 28);


        // Student 배열을 만들어 필드 값을 출력
        Student[] students = {student, student1, student2, student3, student4};
        for (Student s : students) {
            System.out.println("이름 : " + s.name + " 성적 : " + s.score + " 나이 : " + s.age);
        }

    }
    // 초기화 메서드
    static void initStudent(Student student, String name, int score, int age) {
        student.name = name;
        student.score = score;
        student.age = age;
    }

}