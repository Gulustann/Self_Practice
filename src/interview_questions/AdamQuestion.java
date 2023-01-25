package interview_questions;

import java.util.Scanner;

public class AdamQuestion {
    public static void main(String[] args) throws InterruptedException {
        int number = 35;
        System.out.print("********** ");
        Thread.sleep(1000);
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to ");
        Thread.sleep(1000);
        System.out.print("Guessing ");
        Thread.sleep(1000);
        System.out.print("Number ");
        Thread.sleep(1000);
        System.out.print("Game ");
        Thread.sleep(1000);
        System.out.print("********** ");
        System.out.println();

        System.out.println("Please tell me your name?");
        String name = sc.next();

        System.out.println("Hello "+name+"!!!");
        System.out.println(name+", what do you think, should we start the game?");
        String answer = sc.next();
        while (!((answer.equalsIgnoreCase("yes")) || (answer.equalsIgnoreCase("no"))) ){
            System.out.println("Incorrect entry. Please try again.");
            System.out.println(name+", should we start the game now?");
            answer = sc.next();
        }

        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Alright! Please tell us your first number between 0-100");
            int num1 = sc.nextInt();
            if(num1==number){
                System.out.println("CONGRATS!!! YOU WON!!!");
            }else{
                for (int i = 0; i < 4; i++) {
                    if(num1>number){
                        System.out.println("Sorry! That wasn't a match.Lower number. What's your next number?");
                        num1=sc.nextInt();
                    }else{
                        System.out.println("Sorry! That wasn't a match.Higher number. What's your next number?");
                        num1=sc.nextInt();
                    }
                    if(num1==number){
                        System.out.println("CONGRATS!!! YOU WIN!!!");
                        System.exit(0);
                    }
                }
                System.out.println("Sorry! Game is over.");
                System.exit(0);
            }
        }else if(answer.equalsIgnoreCase("no")){
            System.out.println("Thank you! Hope to see you soon!");
        }

        sc.close();


        /*
         We are going to make a GAME!
* The concept is: Generate a random number and ask the user to quess the number,
* continue asking until you receive the number
* after 5 times of quessing show a game over message
*
* Here is how it works:
* Show a welcome message
* Ask the User's name and sav hello to thd user
* Ask if we should start the game
* After receiving a positive answer generate a random number and ask for the user's quess
* If the quess is correct show a congratulation message and quit the game
* If the number is not correct, ask again until you receive the correct answer
* As a hint, beside the first time, every time that you are asking for a number, tell the user to guess higher or lower
* If the User failed 5 times, show a game over message and quit the game
         */
    }
}
