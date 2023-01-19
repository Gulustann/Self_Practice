package day28_Encapsulation.circle;

public class TestCircleObject {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println(c1);

        System.out.println(c1.getRadius());

        System.out.println(   c1.calculateArea());


    }
}
