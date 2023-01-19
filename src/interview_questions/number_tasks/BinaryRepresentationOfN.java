package interview_questions.number_tasks;

public class BinaryRepresentationOfN {

    public static int getCountOfOnes(int n) {

        String s = "";
        boolean result = n > 0;

        while (result) {
            s = ((n % 2) == 0 ? "0" : "1") + s;
            n = n / 2;
            result = n > 0;
        }

        int count = 0;
        for (char each : s.toCharArray()) {
            if (each == '1') {
                count++;
            }
        }

        return count;
    }



    public static void main(String[] args) {
        System.out.println(getCountOfOnes(110));

/*
    return the number of '1's in the binary representation of n for any integer n, where n > 0
    Example:
        for n=6 the binary representation is '110' and the number of '1's in that representation is 2
     */

        int i =6;
        String binaryI = Integer.toBinaryString(i);
        System.out.println(binaryI);//110

        //Back to int

        int backToInt= Integer.parseInt(binaryI, 2);//2 is for Binary, 8 is octal, 10 is decimal
        System.out.println(backToInt);











    }
}
