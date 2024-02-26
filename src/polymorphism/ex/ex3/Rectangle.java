package polymorphism.ex.ex3;

public class Rectangle extends Shape {
    private double height;
    private double base;

    public Rectangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    double area() {
        //  return 높이 * 밑변;
        return height * base;
    }
}