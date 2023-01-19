package day06_ifStatement;

public class OxygenTank {
    /*
     Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
     */
    public static void main(String[] args) {

     int n = 50;

     String result = "";
     if (n>=90){
         result = "Your tank is full";
     }
     if(n<90 && n>=80){
         result="Still okay";
     }
     if(n<80 && n>=70) {
         result ="Don't go too far";
     }
      if(n<70 && n>=60){
          result = "Start to head back";
      }
      if(n<60 && n>=50){
          result = "Be careful now you at 50%";
      }
        System.out.println(result);





    }
}
