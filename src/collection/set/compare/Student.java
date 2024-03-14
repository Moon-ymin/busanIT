package collection.set.compare;

public class Student implements Comparable<Student> {
    // 필드
    private static int lastStudentNo = 20240000;    // 생성 마지막 학번
    private int studentNo;
    private String name;
    private int age;
    private double height;

    // 생성자
    public Student(String name, int age, double height) {
        this.studentNo = ++lastStudentNo;   // 생성할때마다 학번이 자동 부여
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // 게터 메서드
    public int getStudentNo() {
        return studentNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo=" + studentNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        // 기본 정렬 = 학번 순(오름차순)
        return this.studentNo - other.studentNo;
    }
}
