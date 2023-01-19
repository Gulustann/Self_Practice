package day08_TernaryAndSwitch;

public class Calculator {
    public static void main(String[] args) {
//SWITCH

        char mathOperator = '%';
        double n1 = 10,
                n2 = 20;
        double operator =0;
        switch (mathOperator) {
            case '+':
                operator = n1+n2;
                break;
            case '-':
                operator = n2-n1;
                break;
            case '*':
                operator= n1*n2;
                break;
            case '/':
               operator= n2/n1;
                break;
            default:
                System.out.println("Invalid Operator");
        }

        System.out.println(operator);

        /*
        Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30

		Note: MUST use switch statement

         */
    }
}
