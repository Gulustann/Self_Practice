package day06_ifStatement;

public class WeekDays {
    /*
    2. An integer variable named number is declared and given, Write a program that can print the name of the day that the number represents
Ex: Given:
number = 1
output: Monday
Hint: Assume that a number between 1 ~ 7 is given to the variable
     */
    public static void main(String[] args) {
    int n = 5;

    String result = "";

    if( n==1){
        result = "Monday";
    }
    if (n==2){
        result = "Tuesday";
    }
    if (n==3){
        result = "Wednesday";
    }
    if (n==4){
        result = "Thursday";
        }
    if(n==5){
        result = "Friday";
    }
    if (n==6){
        result = "Saturday";
    }
    if (n==7){
        result = "Sunday";
    }
        System.out.println(result);

        System.out.println("______________________________________");
int num = 3;
if(num==1){
    System.out.println("Monday");
}
if(num==2){
    System.out.println("Tuesday");
}
if(num==3){
    System.out.println("Wednesday");
}
if(num==4){
    System.out.println("Thursday");
}
if(num==5){
    System.out.println("Friday");
}
if(num==6){
    System.out.println("Saturday");
}
if(num==7){
    System.out.println("Sunday");
}




    }
}
