package access_modifier.ex;

import access_modifier.ex.com.school.management.Student;

public class Ex1 {
    public static void main(String[] args) {
        Student student1 = new Student("홍길동", "20240220");

        student1.setName( "홍길동" );
        student1.setStudentId("S1234");
        student1.getName();
        student1.getStudentId();
    }

}
