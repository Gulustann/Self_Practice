package day06_ifStatement;

public class PosNegZero {
    /*
    2. An integer variable named number is declared and given, Write a program can identify if the number is positive, negative or zero
Ex:
number = 20
output: Positive
     */
    public static void main(String[] args) {
   int n = 20;
   boolean postivie = n > 0,
    negative = n<0,
           zero = n==0;

   if(postivie){
       System.out.println("Positive");
   }
   if(negative){
       System.out.println("Negative");
   }
   if(zero){
       System.out.println("Zero");
   }
        System.out.println("_______________________________________");
String result ="";
if(n>0){
    result = "Positive";
}
if(n<0){
    result = "Negative";
}
if(n==0){
    result = "Zero";
}
        System.out.println(result);











    }
}
