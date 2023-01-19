package day05;
/*
8. Create a class named SwapTwoVariables1 and declare the following variables:
            x
            y
            z
    8.1 Write a program that swap variables x & y’ values by using a temporary variable z
        Ex:
              x = 10
              y = 15
        output:
                  x = 15
                  y = 20
 */
public class SwapTwoVariables {
    public static void main(String[] args) {

    int x = 10,
            y = 15,

            z = y-x;
    x +=z;
            y +=z;

        System.out.println("x = " + x);
        System.out.println("y = " + y);










    }
}
