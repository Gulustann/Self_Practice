package day08_TernaryAndSwitch;

public class NumberToWord {
    public static void main(String[] args) {
  int number = 1;
        String result = (number>=0 && number<=9)?
                (number==1)? "One" :(number==2)? "Two" :(number==3)? "Three" :(number==4)? "Four"
                        :(number==5)? "Five" :(number==6)? "Six" :(number==7)? "Seven" :(number==8)?
                        "Eight" :"Nine"
        :"Invalid";

        System.out.println(result);







        /*
        Create a class called NumberToWord,
		write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: MUST use ternary
         */
    }
}
