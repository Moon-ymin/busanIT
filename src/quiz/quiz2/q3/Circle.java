package quiz.quiz2.q3;

public class Circle extends Shape{
    private final double PI = 3.14;
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double area() {
        return r * r * PI;
    }
}
