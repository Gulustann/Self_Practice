package day20_arrayUtilityForEachLoop;

public class Task1_reverseSecondWord {
    public static void main(String[] args) {
        String sentence = "I Love Java";

        String[] words = sentence.split(" "); //["I", "Love", "Java"]
                                                     //0     1       2  ==>Index #

        char[] love = words[1].toCharArray(); //[L, o, v, e]

        char[] reverseLove = new char[love.length];
        String evol = "";
        String result = "";

        for (int i = love.length - 1, k = 0; i >= 0; i--, k++) {
            reverseLove[k] = love[i]; //e, v, o, L
            evol += reverseLove[k]; //"evoL"
        }
        words[1] = evol; // Reassigned: Love replaced with evoL
        for (String each : words) { // ["I", "Love", "Java"]==>["I", "evoL", "Java"]==>Converted to String
            result += each + " ";
        }
        System.out.println(result);





    /*
     Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java

     */
    }
}
