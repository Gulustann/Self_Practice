package day33_abstraction.shapeTask;

public class Circle extends Shape{
    public static double pi;
    private double radius;

    static {
        pi=3.14;
    }

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return radius*2*pi;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", radius=" + radius +
                '}';
    }
}
