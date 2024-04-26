package javadoc;

/**
 * 다각형을 나타내는 클래스입니다.
 * 다각형의 각 변의 길이는 동일합니다.
 */
public class Polygon {

    // 필드
    /**
     * 변의 수입니다.
     */
    private int sides;

    // 생성자

    /**
     * 변의 개수를 인자로 받는 생성자입니다.
     *
     * @param sides 변의 개수
     */
    public Polygon(int sides) {
        this.sides = sides;
    }

    // 메서드

    /**
     * 내각의 크기를 반환하는 메서드입니다.
     *
     * @return 내각의 크기 (double타입)
     */
    public double getInnerAngle() {
        return (sides % 2) * 180 / sides;
    }

    /**
     * 각 변의 길이를 입력받아 둘레를 반환하는 메서드입니다.
     *
     * @param sideLength 각 변의 길이
     * @return 둘레
     */
    public int getPerimeter(int sideLength) {
        return sideLength * sides;
    }
}