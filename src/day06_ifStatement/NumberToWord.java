package day06_ifStatement;

public class NumberToWord {
    /*
    2. Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement

     */
    public static void main(String[] args) {
        int n= 1;
        if(n==0) {
            System.out.println("Zero");
        }
        if(n==1){
            System.out.println("One");
        }
        if (n==2) {
            System.out.println("Two");
        }
        if (n==3){
            System.out.println("Three");
        }
        if(n==4){
            System.out.println("Four");
        }
        if(n==5){
            System.out.println("Five");
        }
        if (n == 6) {
            System.out.println("Six");
        }
        if(n==7){
            System.out.println("Seven");
        }
        if(n==8){
            System.out.println("Eight");
        }
        if(n==9){
            System.out.println("Nine");
        }



    }
}
