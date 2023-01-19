package day14_forLoop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word to check if it is palindrome or not");
        String str = input.next();
        boolean isPalindrome = str.equalsIgnoreCase(reverse(str));
        if(isPalindrome){
            System.out.println(str + " is palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }


public static String reverse(String word){
        String result= "";
    for (int i = word.length()-1; i >= 0; i--) {
        result +=word.charAt(i);
    }
    return result;
}


        /*
        Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
         */

}
