package day28_Encapsulation.rectangle;

public class Rectangle {
    private double width, length;

    public Rectangle(double width, double length) {
        setLength(length);
        setWidth(width);
    }

    public double getWidth() {
        if(width==0.0){
            System.err.println("Please set the width");
            System.exit(1);
        }
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            System.err.println("Invalid entry: " + width);
            System.exit(1);
        }
        this.width = width;
    }

    public double getLength() {
        if(length==0.0){
            System.err.println("Please set the length");
            System.exit(1);
        }
        return length;
    }

    public void setLength(double length) {
        if (width < 0) {
            System.err.println("Invalid entry: " + width);
            System.exit(1);
        }
        this.length = length;
    }

    public double calcArea(){
        return width*length;
    }
    public double calcPerimeter(){
        return 2*(width+length);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + getWidth() +
                ", length=" + getLength() +
                ", are=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
/*
    Create a class named Rectangle:
        Private variables:
            width, length

        Encapsulate all the fields
                Conditions:
                    width of the rectangle should not be negative
                    length of the rectangle should not be negative

        Add a constructor that allows user to set all the fields when the object is created.
                (If the arguments not valid it should not be set to the instances)

        Methods:
            calcArea(): returns the area of rectangle
            calcPerimeter(): returns the perimeter of rectangle
            toString(): can display the width, length, area, and perimeter of rectangle when object is passed in print statement

     */
}
