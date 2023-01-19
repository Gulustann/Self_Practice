package day13_returnMethod;

public class MaxNumber {
    public static void main(String[] args) {
        System.out.println(isMax(41, 96));


    }
    public static int isMax(int num1, int num2){
        if(num1>num2){
            return num1;
        }
        return num2;
    }

}
