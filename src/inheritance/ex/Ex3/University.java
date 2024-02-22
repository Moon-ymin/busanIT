package inheritance.ex.Ex3;

public class University {
    public static void main(String[] args) {
        Professor professor = new Professor("John Doe", 40, "컴퓨터 과학 학과");
        Student student = new Student("Jane Smith", 20, 20201234);
        professor.introduce();
        student.introduce();
    }

}
