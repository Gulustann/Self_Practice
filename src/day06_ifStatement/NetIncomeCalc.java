package day06_ifStatement;

public class NetIncomeCalc {
    /*
    Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax
     */
    public static void main(String[] args) {
   double salaryBeforeTax = 100000;
   boolean married = true;
double taxRate= 1.0; //1.0 is not true value, will change after "if"statement
        if (salaryBeforeTax>=130_000) {
            taxRate = 0.35;
        }
        if(salaryBeforeTax <130_000 && salaryBeforeTax>=100_000){
                taxRate = 0.3;
            }
        if(salaryBeforeTax<100_000 && salaryBeforeTax>=80_000){
            taxRate= 0.25;
        }
        if(salaryBeforeTax<80_000){
            taxRate= 0.2;
        }
        double totalTax= salaryBeforeTax*taxRate;
        double netIncome = salaryBeforeTax - totalTax;

        if(married){
            System.out.println(netIncome*1.05);
        }else{
            System.out.println(netIncome);
        }















    }
}
