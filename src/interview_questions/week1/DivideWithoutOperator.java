package interview_questions.week1;

public class DivideWithoutOperator {
    public static void main(String[] args) {

        System.out.println(divide(25,4));
        
        
    }
    
    public static String divide(int dividend, int divisor) {
        if(divisor==0){
            throw new ArithmeticException("Not divisible by 0");
        }
        int quotient=0;

        while (dividend>=divisor){
            dividend=dividend-divisor;
            quotient++;
        }
        return "Quotient: " + quotient+ "\nRemainder: " + dividend;
    }    
    
}
