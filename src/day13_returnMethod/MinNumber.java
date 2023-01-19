package day13_returnMethod;

public class MinNumber {
    public static void main(String[] args) {
        System.out.println(isMin(77, -896) + " is the min number");

    }

    public static int isMin(int num1, int num2){
        if(num1<num2){
            return num1;
        }
        return num2;
    }
}
