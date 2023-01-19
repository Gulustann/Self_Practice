package day13_returnMethod;

public class FrequencyOfWord {
    public static void main(String[] args) {

int x = frequency("Java JaVa JAVA JavA java", "java");
        System.out.println(x);
    }

    public static int frequency(String sentence, String word) {
        int lengthOriginal = sentence.length();

        String sentence2 = sentence.toLowerCase().replace(word.toLowerCase(), word.substring(1));

        int lengthAfter = sentence2.length();

        int frequency = lengthOriginal - lengthAfter;

        return frequency;
        /*
        Create a method named frequencyOfWord that takes two arguments:
            1. sentence (String)
            2. word (String)

    The method should return the frequency of the word from the sentence

        Ex:
            frequencyOfWord("Java java jAvA", "java")  ==> 4

         */

    }


}
