package day06_ifStatement;

public class MedianNumber {
    /*
    Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number

     */
    public static void main(String[] args) {
     int a= 10,
     b= 15,
     c= 20;
     String result= " is the median number";
     if(b>a && b<c || b>c && b<a){
         System.out.println(b + result);
     }

     if(a>b && a<c || a>c && a<b){
         System.out.println(a + result);
     }

if(c>a && c<b || c>b && c<a){
    System.out.println(c + result);
}









    }
}
