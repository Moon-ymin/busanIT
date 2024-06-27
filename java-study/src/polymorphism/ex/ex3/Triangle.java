package polymorphism.ex.ex3;

public class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    double area() {
        // return 높이 * 밑변 * 1/2;
        return height * base * 0.5;
    }
}