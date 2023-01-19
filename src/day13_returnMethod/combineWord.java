package day13_returnMethod;

import java.util.Scanner;

public class combineWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you first word");
        String w1 = input.next();

        System.out.println("Enter your second word");
        String w2 = input.next();
        System.out.println(combineWords(w1,w2));

    }
    public static String combineWords(String w1, String w2){
        char lastCharW1 = w1.toLowerCase().charAt(w1.length()-1);
        char firstCharW2 = w2.toLowerCase().charAt(0);
        if(lastCharW1==firstCharW2){ //OR if (w1.endsWith(""+w2.charAt(0)))
            return (w1.substring(0, w1.length()-1) + w2.toLowerCase());//OR ==> w1+w2.substring(1)
        }
        return w1+w2;
    }
    /*

5.  Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
    Ex:
        combine("one", "eight")  ==> oneight
     */
}
