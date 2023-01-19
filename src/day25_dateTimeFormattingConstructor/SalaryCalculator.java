package day25_dateTimeFormattingConstructor;

public class SalaryCalculator {
  public double hourlyRate, weeklyHours, stateTax, federalTax;

    public SalaryCalculator(double hourlyRate, double weeklyHours, double stateTax, double federalTax) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTax = stateTax;
        this.federalTax = federalTax;
    }
    public double salary(){
        double salary = hourlyRate * weeklyHours * 52;
        return salary;
    }
    public double StateTax(){
        return salary() * stateTax;
    }
    public double FederalTax(){
        return salary() * federalTax;
    }

    public double salaryAfterTax(){
        return salary() - StateTax() - FederalTax();
    }

    public String toString() {
        return "salaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", stateTax=" + stateTax +
                ", federalTax=" + federalTax +
                ", salary before tax=" + salary() +
                ", salaryAfterTax=" + salaryAfterTax()+
                '}';
    }

    /*
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

     */

}
/*
 Create a custom class named SalaryCalculator:
        1.1 Create a class named Salary calculator:
                Attributes:
                    hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

                Add a constructor to set all the fields

                Actions:
                    salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
                    stateTax(): calculates the total state tax
                    federalTax(): calculates the total federal tax
                    salaryAfterTax(): calculates the salary after tax
                    toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */