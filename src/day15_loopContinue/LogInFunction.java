package day15_loopContinue;

import java.util.Scanner;

public class LogInFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUserName = "Cydeo",
                correctPassword = "Cydeo123";

        String username = "";

        String password = "";

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter your username");
            username=sc.next();
            System.out.println("Enter you password");
            password=sc.next();
            if(username.equals(correctUserName) && password.equals(correctPassword)){
                System.out.println("You are logged in");
                return;  //to end the loop
            }else if (i==3){ // prints after 3rd incorrect entry
                System.out.println("You account is locked.");
            }
        }

        sc.close();
        /*
        you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."


Extra Spicy:
         */
    }
}
