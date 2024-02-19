package class0.ex;

public class Ex7 {
    // 사각형의 넓이와 둘레, 정사각형 여부를 구하는 절차적 코드입니다.
    // => 사각형 클래스를 만들어 객체지향적 코드로 변경해주세요.
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 10;

        int area = rectangle.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부: " + square);
    }
}