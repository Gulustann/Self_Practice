package day03_practice;

public class Rectangle {
    /*
    2. Declarethefollowingvariables:
1. width 2. Length
3. Writeaprogramthatcandisplaytheareaoftherectangle Hints: area = width * length
     */

    public static void main(String[] args) {
      int width = 5,
              length = 10;

        System.out.println("          10");
        System.out.println("_________________________");
        System.out.println("|                       |");
        System.out.println("|                       |  5");
        System.out.println("|                       |");
        System.out.println("-------------------------");

        int areaOfRectengle = width*length;

        System.out.println("areaOfRectengle = " + areaOfRectengle);

        System.out.println("_______________________________");

        System.out.println("\t\t8.5\t\t\n_____________________\n|\t\t\t\t\t|\n|\t\t\t\t\t| 2.3\n|\t\t\t\t\t| " +
                "\n---------------------");
        double w = 8.5, l = 2.3, area = w*l;
        System.out.println("area = " + area);






    }




}
