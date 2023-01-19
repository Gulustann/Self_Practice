package day08_TernaryAndSwitch;

public class ChooseLanguage {
    public static void main(String[] args) {
        //TERNARY
        int number = 3;
        String result = (number >= 1 && number <= 5) ?
                (number == 1) ? "Hello, thank for your call"
                        : (number == 2) ? "Hola, gracias para llamar"
                        : (number == 3) ? "Merhaba, aradiginiz icin tesekkurler"
                        : (number == 4) ? "Privet, spasibo za vash zvonok"
                        : "Merci ,pour votre appel"
                        : "Invalid Number";
        System.out.println(result);
        System.out.println("________________________________________________");

        //SWITCH STATEMENT
        String res="";

        switch (number){
            case 1:
                res="Hello, thank for your call";
                break;
            case 2:
                res="Hola, gracias para llamar";
                break;
            case 3:
                res="Merhaba, aradiginiz icin tesekkurler";
                break;
            case 4:
                res = "Privet, spasibo za vash zvonok";
                break;
            case 5:
                res= "Merci ,pour votre appel";
                break;
            default:
                res="Invalid Number";
        }

        System.out.println(res);





        /*
        Create a class called ChooseLanguage,
 		Given an integer variable named selection that has a number between 1~5.
 		Write a program that can select the language based on the number that's given in selection and prints the following message:

			for 1: Hello, thank for your call
			for 2: Hola, gracias para llamar
			for 3: Merhaba, aradiginiz icin tesekkurler
			for 4: Privet, spasibo za vash zvonok
			for 5: Merci ,pour votre appel

			for any other numbers print "Invalid Number"

		Solution 1: Must use ternary
		Solution 2:	MUST use switch statement
         */
    }
}
