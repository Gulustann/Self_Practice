package day33_abstraction.shapeTask;

public class Rectangle extends Shape{
    private double width, length;

    public Rectangle(double width, double length) {
        super("Rectangle");
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return (width*length);
    }

    @Override
    public double perimeter() {
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
