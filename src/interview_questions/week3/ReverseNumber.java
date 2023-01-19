package interview_questions.week3;

import java.util.Arrays;

public class ReverseNumber {

    public static int reverseNum(int num) {
        String str = new StringBuilder("" + num).reverse().toString();
        if (num < 0) {
            str = "-" + str.substring(0, str.length() - 1);
        }
        return Integer.valueOf(str);
    }

    public static int reverse(int number) {//13
        if (number < 10 && number >= 0) {
            return number;
        }

        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;//3
            number /= 10;//1
        }
        return result;
    }



    public static void main(String[] args) {
        System.out.println(reverse(45678));

        System.out.println(reverseNum(45678));

        /*
        3. Number -- Reverse negative number
Write a return method that can reverse negative number and return it as int
         */


    }
}
