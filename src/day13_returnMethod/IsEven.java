package day13_returnMethod;

public class IsEven {
    public static void main(String[] args) {
        System.out.println(isOdd(50));

        System.out.println(isEven(48));

    }
    public static boolean isOdd(int num){
        boolean isOdd = num % 2 != 0;
        return isOdd;
    }
    public static boolean isEven (int num){
        return !isOdd(num);

    }
}
