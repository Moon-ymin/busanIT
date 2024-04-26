package javadoc;

/**
 * 학생을 나타내는 클래스
 */
public class Student extends Human {

    /**
     * 학교 이름
     */
    String schoolName;

    /**
     * 사람의 이름과 학교 이름을 추가로 인자로 받는 생성자
     * @param name 이름
     * @param age 나이
     * @param schoolName 학교이름
     */
    public Student(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    /**
     * {@inheritDoc} 학교 정보도 추가하여 소개합니다.
     */
    @Override
    public void intro() {
        super.intro();
        System.out.printf("%s 학생입니다.\n", schoolName);
    }

    /**
     * 주어진 시간에 대한 과목 반환 메서드
     *
     * @param period 교과목 시간입니다. (1, 2, 3교시)
     * @return 과목명을 반환
     * @throws ArrayIndexOutOfBoundsException 주어진 시간이 1~3이 아니면 예외 발생
     */
    public String getClassFromPeriod(int period) throws ArrayIndexOutOfBoundsException {
        return new String[] {"국어", "영어", "수학"}[period-1];
    }
}
