package day11_string;

public class EmailTask2 {
    public static void main(String[] args) {
String email ="craig_federighi@apple.com",
        firstName= email.substring(0,1).toUpperCase() + email.substring(1, email.indexOf("_")).toLowerCase(),
        lastName = email.substring(email.indexOf("_")+1, email.indexOf("_")+2).toUpperCase() +
                email.substring(email.indexOf("_")+2, email.indexOf("@")).toLowerCase(),
        domain = email.substring(email.indexOf("@")+1, email.indexOf("@")+2).toUpperCase() + email.substring
                (email.indexOf("@")+2, email.indexOf(".")).toLowerCase();



        System.out.println("First Name: " + firstName + "\nLast Name: " + lastName + "\nDomain: " + domain);



















        /*
        Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

   Write a program that will print out information about user based on email. Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple
         */
    }
}
