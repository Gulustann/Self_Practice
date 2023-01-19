package day08_TernaryAndSwitch;

public class OxygenTank {
    public static void main(String[] args) {
 int oxygen = 255;
 String result =(oxygen<=100 && oxygen>=0)?
         (oxygen<=100 && oxygen>=90)? "Your tank is full" :(oxygen>=80)? "Still okay"
         :(oxygen>=70)? "Don't go too far" :(oxygen>=60)? "Start to head back" : "Be careful now you at at 50%"
         : "Invalid";

        System.out.println(result);







        /*
        Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY

            Solution 1: Must use ternary
         */
    }
}
