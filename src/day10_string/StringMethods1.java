package day10_string;

import java.util.Scanner;

public class StringMethods1 {
    public static void main(String[] args) {
        String str ="Cydeo";
        // index:  01234

        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);
        char thirdChar = str.charAt(2);
        char foruthChar = str.charAt(3);
        char fifthChar = str.charAt(4);

       // char nthChar =str.charAt(5); ERROR
        
        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("foruthChar = " + foruthChar);
        System.out.println("fifthChar = " + fifthChar);

        //System.out.println("sixthChar = " + sixthChar); ERROR

        System.out.println("______________________________");

String sentence = "Java Programming Language"; //spaces are characters in double quote
        int lentgh= sentence.length();

        System.out.println(lentgh); //25 number of characters

int lastIndex = lentgh -1;
        System.out.println(lastIndex); //24 is last index number
        System.out.println("______________________________");

String s1 = "Wooden Spoon";

char firstIndex = s1.charAt(0);
        System.out.println(firstIndex);

int lenthg1 = s1.length();
        System.out.println(lenthg1);
        int lastIndexNum = lenthg1 -1;
        char l = s1.charAt(lastIndexNum);

        System.out.println(firstIndex +" : " + l);
        System.out.println("_______________________________________");

String name1 = "Umran";

String name2 = new String("Umran");

        System.out.println(name1 == name2); //false compared based on the object, where it is saved in memory

        System.out.println(name1.equals(name2)); //true==> compares values.

        System.out.println("_________________________________________");
String r1 = "Java";
String r2 = "Java";
String r3 = new String("Java");

        System.out.println(r1==r2); //true - only one object created in pool and shared by r1 and r2
        System.out.println(r1==r3); //false - 2 different objects (not shared in memory nor in the same spot)
        System.out.println(r2==r3); //false - 2 different objects

        System.out.println(r1.equals(r3)); //true - compares just text
        System.out.println(r2.equals(r3)); //true - text is same

        System.out.println("_________________________________________________");
        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println("Are you US citizen?");
        String answer = input.next();

       // if (age>=21 && answer== "yes"){ //not eligible-that yes is String literal. By default answer "yes" is created
                                            // using key word, so that yes and answer yes different
        if (age>=21 && answer.equals("yes") ){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("not eligible");
        }
input.close();





    }
}
