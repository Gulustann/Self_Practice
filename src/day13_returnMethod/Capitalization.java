package day13_returnMethod;

public class Capitalization {
    public static void main(String[] args) {
    String keyword = capitalization("TurKIyE");
        System.out.println(keyword);
    }
    public static String capitalization(String word){
      return word = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();



    }

    /*
    Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the given argument

    Ex:
        title("jAvA") ===> Java

     */
}
