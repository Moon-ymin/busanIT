package quiz.quiz2.q3;

public class Triangle extends Shape{
    private double height;
    private double width;

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    double area() {
        // return 높이 * 밑변 * 1/2;
        return height * width * 0.5;
    }
}
