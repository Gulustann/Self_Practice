package day11_string;

public class EmailTask1 {
    public static void main(String[] args) {
String email = "mike_tyson@gmail.com",
        firstName= email.substring(0,email.indexOf("_")),
        lastName= email.substring(email.indexOf("_")+1, email.indexOf("@")),
        domain = email.substring(email.indexOf("@"));
        System.out.println(lastName+ "_"+ firstName+domain);







        /*
        Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
         */


    }
}
