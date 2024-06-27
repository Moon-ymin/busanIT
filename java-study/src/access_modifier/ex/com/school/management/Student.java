package access_modifier.ex.com.school.management;

public class Student {
    // 필드 : 필드를 접근 불가하게 캡슐화
    private String name;
    private String studentId;

    // 생성자
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    
    // 게터와 세터
    // 필드의 값을 가져오는 getter
    public void getName() {
        System.out.println("학생 이름: "+name);
    }
    public void getStudentId() {
        System.out.println("학생 ID: "+studentId);
    }
    // 필드의 값을 설정하는 setter
    public void setName( String name ) {
        this.name = name;
    }
    public void setStudentId( String studentId ) {
        this.studentId = studentId;
    }
}
