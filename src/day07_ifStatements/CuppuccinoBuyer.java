package day07_ifStatements;

public class CuppuccinoBuyer {
    public static void main(String[] args) {
String size = "small";
String result = "";

if(size == "tall" || size == "grande" || size == "venti"){
    if(size == "tall"){
        result = "price is $3.69 \n90 calories";
    }else if(size == "grande"){
        result = "price is $3.99 \n120 calories";
    }else {
       result = "price is $4.29 \n150 calories";
    }
}else {
   result ="Invalid Size";
}
        System.out.println(result);


        /*
        Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"

			Note: MUST use nested if

         */
    }
}
