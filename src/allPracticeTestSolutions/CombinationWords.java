package allPracticeTestSolutions;

import java.util.Scanner;

public class CombinationWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 words");
        String word1 = sc.next();
        String word2 = sc.next();
        sc.close();

        if(word1.charAt(word1.length()-1) == word2.charAt(0)){
            System.out.println(word1+word2.substring(1));
        }


        /*
        Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
         */
    }
}
