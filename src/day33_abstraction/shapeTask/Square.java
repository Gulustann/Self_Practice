package day33_abstraction.shapeTask;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", side=" + side +
                '}';
    }
}
