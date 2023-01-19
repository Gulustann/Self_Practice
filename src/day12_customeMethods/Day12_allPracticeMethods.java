package day12_customeMethods;

public class Day12_allPracticeMethods {
    public static void main(String[] args) {

emailDomain("gulistanderici@hotmail.com");
capitalization("guLUStaN", "tAHmisOGlU");
monthName(11);
day(7);
daysInAMonth("apRIL");
eligibleToVote(52, true);
salary(50, 40);

    }

    public static void emailDomain(String email){

        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
        System.out.println(domain);
        /*
            /*
        Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail

         */

    }

    public static void capitalization (String firstName, String lastName){
        System.out.println( firstName.substring(0,1).toUpperCase() +
               firstName.substring(1).toLowerCase()
                + " " +
               lastName.substring(0,1).toUpperCase() +
                       lastName.substring(1).toLowerCase());
/*
 Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School

 */

    }


public static void monthName (int month){
        String result="";
    if (month>=1 && month<=12) {
        result = (month == 1)? "Jan" : (month == 2) ? "Feb" : (month == 3) ? "Mar" : (month == 4) ? "Apr" : (month == 5) ? "May"
                : (month == 6) ? "Jun" : (month == 7) ? "Jul" : (month == 8) ? "Aug" : (month == 9) ? "Sep"
                : (month == 10) ? "Oct" : (month == 11) ? "Nov" : "Dec";
    }else{
        result="Invalid entry";
    }
    System.out.println(result);
    /*
    Create a method named monthName that can display the name of the month based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)

        output:
            June
     */
}

public static void day(int day){
        String dayName = "";
        if(day>=1 && day<=7){
            dayName= (day==1)? "Monday" :(day==2)? "Tuesday" :(day==3)? "Wednesday" :(day==4)? "Thursday"
                    :(day==5)? "Friday" :(day==6)? "Saturday" : "Sunday";
        }else{
            dayName = "Invalid entry";
        }
    System.out.println(dayName);
        /*
         Create a method named day that can display the name of the day based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday
         */

}

public static void daysInAMonth (String month){

    if (month.toLowerCase().equals("february")) {
        System.out.println(month.substring(0,1).toUpperCase() +
                month.substring(1).toLowerCase() + " has 28 days");
    }else if(month.toLowerCase() .equals("april") || month.toLowerCase().equals("june") ||
month.toLowerCase().equals("september") || month.toLowerCase().equals("november")){
        System.out.println(month.substring(0,1).toUpperCase() +
                month.substring(1).toLowerCase() + " has 30 days");
    }else if(month.toLowerCase().equals("january")|| month.toLowerCase().equals("march") ||
            month.toLowerCase().equals("may") || month.toLowerCase().equals("july") ||
            month.toLowerCase().equals("august") || month.toLowerCase().equals("october")
    || month.toLowerCase().equals("december")){
        System.out.println(month.substring(0,1).toUpperCase() +
                month.substring(1).toLowerCase() + " has 31 days");
    }else {
    System.out.println("Invalid entry");
}

}

public static void eligibleToVote(int age, boolean isAmerican){
        if( age>=21 && isAmerican==true){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are NOT eligible to vote");
        }
/*
Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote

 */
}

public static void salary (double hourlyRate, int weeklyHours){
     double grossIncome = hourlyRate*weeklyHours * 52;

    System.out.println("You make $" + hourlyRate + " per hour");
    System.out.println("You work " + weeklyHours + " hours in a week");
    System.out.println("Your gross income is $" + grossIncome);
/*
Create a method named salary that takes two arguments:
        1. hourlyRate (double)
        2. weeklyHours (int)

    Then the method should display the salary of the person.
        Ex:
            salary(45, 40)

        output:
            You make $45.0 per hour
            You work 40 hours in a week
            Your gross income is $93600.0
 */
}




}
