package inheritance.ex.Ex3;

public class Student extends Person{
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;

    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("제 학번은 "+studentId+"입니다.");
    }
}
