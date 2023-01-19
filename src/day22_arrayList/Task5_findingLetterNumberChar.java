package day22_arrayList;

public class Task5_findingLetterNumberChar {
    public static void main(String[] args) {
String str ="Wooden Spoon! 123";
String letters = "";
String digits="";
String ch = "";

        for (int i = 0; i < str.toCharArray().length; i++) {
            if(Character.isLetter(str.charAt(i))){
                letters += str.charAt(i) + " ";
            }
            if(Character.isDigit(str.charAt(i))){
                digits += str.charAt(i) + " ";
            }
            if(!Character.isLetterOrDigit(str.charAt(i))){
                ch += str.charAt(i)+" ";
            }
        }
        System.out.println("ch = " + ch);
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);


/*
Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";

        Note: Use Wrapper class methods
 */

    }
}
