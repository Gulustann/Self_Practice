package day42_map;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        //who has the maximum and minimum salary?
        int max=-2147483648, min=2147483647;
        String maxSalaryName="", minSalaryName = "";

        for (Map.Entry<String, Integer> eachSet : map.entrySet()) {
            if(eachSet.getValue()>max){
                max=eachSet.getValue();
                maxSalaryName=eachSet.getKey();
            }
            if(eachSet.getValue()<min){
                min=eachSet.getValue();
                minSalaryName= eachSet.getKey();
            }
        }
        System.out.println(maxSalaryName+" gets the max salary: $"+ max);
        System.out.println(minSalaryName+" gets the min salary: $"+ min);

        System.out.println("________________________________________________");
        //2.2 how many employees has the salary between 120k ~ 150K?
        int count =0;

        for (Integer eachSalary : map.values()) {
            if(eachSalary>120_000 && eachSalary<150000){
                count++;
            }
        }
        System.out.println("Number of employee who gets between 120k-150k :" + count);

        System.out.println("________________________________________________");

        //2.3 display the names of the employees who are making less than 118k?

        for (Map.Entry<String, Integer> eachSet : map.entrySet()) {
            if(eachSet.getValue()<118000){
                System.out.print(eachSet.getKey()+" ");
            }
        }
        System.out.println();
        System.out.println("________________________________________________");

        // 2.4 increase the salary employee by 10K if the current salary of employee is less than 120K

        for (Map.Entry<String, Integer> eachSet : map.entrySet()) {
            if(eachSet.getValue()<120000){
                eachSet.setValue( (Integer)eachSet.getValue() + 10000);
            }
            System.out.println(eachSet.getKey()+" : "+ eachSet.getValue());
        }


// List<String> names = new ArrayList<>();
//                System.out.println(names.addAll(Arrays.asList(each.getKey())));





    }
}
/*
2. Given following map that contains employee name and employee salary:
	 Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

    2.1 who has the maximum and minimum salary?

    2.2 how many employees has the salary between 120k ~ 150K?

    2.3 display the names of the employees who are making less than 118k?

    2.4 increase the salary employee by 10K if the current salary of employee is less than 120K

 */