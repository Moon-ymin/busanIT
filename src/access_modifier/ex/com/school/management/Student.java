package access_modifier.ex.com.school.management;

public class Student {
    // 필드
    private String name;
    private String studentId;

    // 생성자
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    // 게터와 세터
    public void getName() {
        System.out.println("학생 이름: "+name);
    }
    public void getStudentId() {
        System.out.println("학생 ID: "+studentId);
    }
    public void setName( String name ) {
        this.name = name;
    }
    public void setStudentId( String studentId ) {
        this.studentId = studentId;
    }
}
