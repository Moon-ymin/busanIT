package quiz.quiz2.q3;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(20, 20);
        Shape triangle = new Triangle(20, 20);

        System.out.println("원의 면적 : " + circle.area());
        System.out.println("사각형의 면적 : " + rectangle.area());
        System.out.println("삼각형의 면적 : " + triangle.area());

    }
}
