package day14_forLoop;

public class Shape {
    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++) {

            for (int s = 1; s <= 6; s++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("____________________________________");
        String result = "";
        for (int s = 1; s <= 8; s++) {
            for (int j = 1; j <= 6; j++) {
                result += "* ";
            }
            result += "\n";
        }
        System.out.println(result);

    }
}
