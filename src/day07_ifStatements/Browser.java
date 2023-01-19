package day07_ifStatements;

public class Browser {
    public static void main(String[] args) {
        String browser = "edge";
        String result = browser + " Browser is selected";

        if (browser == "chrome" || browser == "firefox" || browser == "opera" || browser == "safari" || browser == "edge") {
            if (browser == "chrome") System.out.println(result);
            else if (browser == "firefox") System.out.println(result);
            else if (browser == "opera") System.out.println(result);
            else if (browser == "safari") System.out.println(result);
            else System.out.println(result);

        } else System.out.println("Invalid Browser Name");






     /*
     Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
      */
    }
}
