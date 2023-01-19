package day16_nestedLoop;

public class Frequency {
    public static void main(String[] args) {
        String str = "aabcccd";

        String result = "";


        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if (!result.contains(str.charAt(i) + "")) {
                result += str.charAt(i);

            }else{
                continue;
            }
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            result +=count;
        }
        System.out.println(result);



        /*
        Write a program that can find the frequency of the characters from a string

                         Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters
         */
    }
}
