package day33_abstraction.shapeTask;

public class TestShapeObject {
    public static void main(String[] args) {
      Circle circle = new Circle(5);
      Square square = new Square(2);
      Rectangle rectangle = new Rectangle(3, 4);

        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);

        System.out.println("_________________________________________________________");

        System.out.println(circle.area());
        System.out.println( square.area());
        System.out.println(rectangle.area());

        System.out.println("_________________________________________________________");
        System.out.println(circle.perimeter());
        System.out.println( square.perimeter());
        System.out.println(rectangle.perimeter());




    }
}
