package interview_questions.week5;

import java.util.Arrays;

public class StringReverse {
    /*
    String -- Reverse
Write a return method that can reverse String Ex: Reverse("ABCD"); ==> DCBA
     */
    public static String reverse(String str){

       String[] result= new String[str.length()];//new String array created to collect the reversed letters

        for (int i = str.split("").length - 1, k=0; i >= 0; i--, k++) {
           result[k] = str.split("")[i];
           //result index# starting from 0, added each element starting from end of the str.split("")
        }
        return Arrays.toString(result);
    }

    public static void main(String[] args) {

        String str = "ABCD";
        System.out.println(reverse(str));

        System.out.println("_____________________2nd WAY_________________________________");

        String reverse="";
        char ch;

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            reverse= ch + reverse; //adds each character in front of the existing string
        }
        System.out.println("Reversed String: "+ reverse);
    }



}
