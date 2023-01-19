package day08_TernaryAndSwitch;

public class BrowserName {
    public static void main(String[] args) {
 String browser = "safari";
 String result = "";

 switch (browser){
     case "chrome": result=browser + " browser is selected"; break;
     case "firefox": result=browser + " browser is selected"; break;
     case "opera": result=browser + " browser is selected"; break;
     case "safari": result=browser + " browser is selected"; break;
     case "edge": result=browser + " browser is selected"; break;
     default: System.out.println("Invalid Browser");
 }
        System.out.println(result);

        /*
        write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
         */
    }
}
