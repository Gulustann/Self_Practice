package day28_Encapsulation.circle;

public class Circle {
private double radius;
public static double pi;
static {
    pi=3.14;
}
    public Circle(double radius) {
        setRadius(radius);
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
    if(radius<=0){
        System.err.println("invalid radius: " + radius);
        System.exit(1);
    }
        this.radius = radius;
    }
    public double calculateArea(){
       return (radius*radius*pi);
    }
    public double calculatePerimeter(){
    return (radius*2*pi);
    }

    public String toString() {
        return "Circle{" +
                " radius =" + getRadius() +
                " perimeter =" + calculatePerimeter() +
                " area =" + calculateArea() +
                '}';
    }
    /*
    1. Create a class named Circle

        private variables:
            radius

        public variable:
            pi

         Encapsulate all the private fields

                 1. radius of the circle can not be zero or negative

         Add a constructor that can set the radius of circle when circle object is created
                 (If the arguments not valid it should not be set to the instances)

         Methods:
             calcArea()
             calcPerimeter()
             toString(): displays the radius, area and perimeter of the circle when the circle object is passed in the print statement


     */
}
