package day04_concantenation;

public class PhoneNumber {
    /*
    . create a class named PhoneNumber and declare the following variables:
            countryCode, areaCode, localNumber

            use string concatenation to display the phone number

            ex:
                if  countryCode = 1
                    areaCode = 703
                    localNumber = 4512625

                output:
                    +1(703)-4512625
     */
    public static void main(String[] args) {
        char countryCode = '1';
        int areaCode = 703,
                localNumber = 5412625;

        System.out.println("+" + countryCode + "(" + areaCode + ")-" + localNumber );







    }
}
