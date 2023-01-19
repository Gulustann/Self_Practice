package day11_string;

public class WebsiteAddress {
    public static void main(String[] args) {
String website = "www.facebook.edu";

String result = (website.startsWith("www.") && (website.endsWith(".com") || website.endsWith(".gov") || website.endsWith(".edu")))?
        "Valid website" : "Invalid website";

        System.out.println(result);


/*
Create a class named day11_string.WebsiteAddress, and write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
 */


    }
}
