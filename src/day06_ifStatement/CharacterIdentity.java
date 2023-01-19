package day06_ifStatement;

public class CharacterIdentity {
    /*
    Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit or
    Alphabetic Character(A~Z or a~Z) or a special character
		Ex:
			ch = '@'
		output:
			Special Character
			ch = '1'
		output:
			digit
		HINT: You may wanna check out the numbers of the chracters on ASCII table
     */
    public static void main(String[] args) {

//ASCII table : A-Z==> 65-90, a-z ==> 97-122,
        char ch = '@';
        boolean alphabetic = ch>=65 && ch<=90 || ch>=97 && ch<=122;
        boolean digit = ch>=0 && ch<=9;
        boolean specialCharacter = !alphabetic && !digit;

        if(alphabetic){
            System.out.println("Alphabetic Character");
        }
if(digit)
    System.out.println("Digit");
if(specialCharacter ){
    System.out.println("Special Character");
}














    }
}
