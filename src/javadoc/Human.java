package javadoc;

/**
 * 사람을 나타내는 클래스
 *
 * @author 장원
 * @version 1.2
 */
public class Human {

    /**
     * 사람의 이름
     */
    String name;
    /**
     * 사람의 나이
     */
    int age;

    /**
     * 이름과 나이를 받는 생성자
     *
     * @param name 사람의 이름
     * @param age 사람의 나이
     */
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 사람을 소개하는 메서드
     *
     * 나이 계산법이 달라지면서 더 이상 사용하지 않는 메서드입니다.
     *
     * @deprecated
     * @see #intro()
     */
    public void introduce() {
        System.out.printf("안녕하세요 저는 %s이고, %s세입니다\n", name, age );
    }

    /**
     * 만 나이를 소개하는 메서드
     * @since 1.2
     */
    public void intro() {
        System.out.printf("안녕하세요 저는 %s이고, 만 %s세입니다\n", name, age-1 );
    }
}
