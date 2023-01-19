package day22_arrayList;

public class Task6 {
    public static void main(String[] args) {
      String str =  "JAVA java";
      int upperCaseCount = 0;
      int lowerCaseCount = 0;

        for (int i = 0; i < str.toCharArray().length; i++) {
            if(Character.isUpperCase(str.charAt(i))){
                upperCaseCount++;
            }
            if(Character.isLowerCase(str.charAt(i))){
                lowerCaseCount++;
            }
        }
        boolean upperCaseEqualLowerCase = upperCaseCount == lowerCaseCount;
        System.out.println(upperCaseEqualLowerCase);




        /*
        Write program that returns true if the total number of upper case characters are equal to total number of
        Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true

        Note: Use Wrapper class methods

         */
    }
}
