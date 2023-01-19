package interview_questions.week3;

public class PrimeNumber {

    public static boolean primeNumber(int num) {
     if (num < 2) {
        return false;
    }

        for (int i = 2; i < num; i++) {
        if (num % i == 0) {
            return false;
        }
    }
        return true;
}

    public static void main(String[] args) {

        System.out.println(primeNumber(89));


        /*
        1. Numbers -- Prime Number
Write a method that can check if a number is prime or not
         */
    }
}
