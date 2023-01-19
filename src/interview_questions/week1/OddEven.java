package interview_questions.week1;

public class OddEven {
    public static void main(String[] args) {

        System.out.println(oddEven(10));



    }

    public static String oddEven(int number){
        String oddEven = (number % 2 == 0) ? "Even" : "Odd";
        return oddEven;
    }

}
