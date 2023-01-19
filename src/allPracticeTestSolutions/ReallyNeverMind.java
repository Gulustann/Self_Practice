package allPracticeTestSolutions;

import java.util.Scanner;

public class ReallyNeverMind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();
        sc.close();

     if(word.substring(word.length()-2).equals("ly")){
            System.out.println("Really!!");
        }else{
            System.out.println("Never mind");
        }



        /*
        Create a class named ReallyNeverMind. Ask the user to enter a word. if the word ends with "ly",
         print "really???" ,  otherwise, print "never mind"
         */
    }
}
