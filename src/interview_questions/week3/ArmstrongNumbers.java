package interview_questions.week3;

public class ArmstrongNumbers {

    public static boolean isArmStrongNumber(int num) {
        int a = 0, b = 0, c = num;

        while (num > 0) {
            a = num % 10;
            num /= 10;
            b = b + (a * a * a);
        }

        return (c == b) ? true : false;
    }
    public static void main(String[] args) {




        /*int number = 371, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;


            if (result == number)
                System.out.println(number + " is an Armstrong number.");
            else
                System.out.println(number + " is not an Armstrong number.");
        }*/



        /*
        2. Numbers -- Armstrong numbers
Write a method that can check if a number is Armstrong number

An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is
equal to the number itself.For example, 371 is an Armstrong number since
 3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371
         ___________________________________________________________
        public static boolean isArmStrongNumber(int num) {
        int a = 0, b = 0, c = num;

        while (num > 0) {
            a = num % 10;
            num /= 10;
            b = b + (a * a * a);
        }

        return (c == b) ? true : false;
    }
         */
    }
}
