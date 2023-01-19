package allPracticeTestSolutions;

import java.util.Scanner;

public class ValidWebsite {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a website");
        String website =sc.nextLine();
        sc.close();

        if(website.contains("www") && (website.contains(".com") || website.contains(".edu") ||
                website.contains(".gov")) && !website.contains(" ")){
            System.out.println("valid website");
        }else{
            throw new IllegalArgumentException("Not a valid website");
        }






        /*
        Create a class named WebsiteAddress, and write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
         */
    }
}
