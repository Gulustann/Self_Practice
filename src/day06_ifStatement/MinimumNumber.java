package day06_ifStatement;

public class MinimumNumber {
    /*
    2. Declare the following variables: 1. num1
2. num2
3. Write a program that can print the minimum number between the two numbers above, if both are equal then print Equal
Ex:
num1 = 10
num2 = 20
output:
10 is the minimum number
     */
    public static void main(String[] args) {
        int n1 = 10,
                n2= 20;

        if(n1<n2){
            System.out.println(n1 + " is the minimum number");
        }

        if(n2<n1){
            System.out.println(n2 + " is the minimum number");
        }

        System.out.println("__________________________");

if(n1<n2){
    System.out.println(n1 + " is the minimum number");
}else{
    System.out.println(n2 + " is the minimum number");
}

        System.out.println("_________________________________");
String result = " is the minimum number";

if(n1<n2){
    System.out.println(n1 + result);
}else{
    System.out.println(n2 + result);
}




    }
}
