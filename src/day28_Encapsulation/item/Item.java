package day28_Encapsulation.item;

import java.util.Collections;

public class Item {
    private String name;
    private double UnitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Name cannot be empty or blank");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        if (!Character.isLetter(name.charAt(0))) {
            System.err.println("Name should start with letter");
            System.exit(1);
        }
        for (char each : name.toCharArray()) {
          //  if (!((each >= 'A' && each <= 'Z') || (each >= 'a' && each <= 'z') || each ==' ')) {
            if (!(Character.isLetter(each) || each ==' ')) {
                System.err.println("Name cannot include any special character or number");
                System.exit(1);
            }
        }


        this.name = name;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice<0){
            System.err.println("Unit price cannot be negative");
            System.exit(1);
        }
        UnitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity<0){
            System.err.println("Quantity cannot be less than zero");
            System.exit(1);
        }
        if(name.equalsIgnoreCase("toilet paper")){
            if(quantity>1){
                System.err.println("Only one toilet paper is allowed to purchase");
                System.exit(1);
            }
        }
        this.quantity = quantity;
    }
public double calcCost(){
       return getUnitPrice()*getQuantity();
}

    public String toString() {
        return "Item{" +
                "name='" + getName() + '\'' +
                ", UnitPrice=" + getUnitPrice() +
                ", quantity=" + getQuantity() +
                '}';
    }
/*
    3. create a class called Item
        private variables:
            name, unitPrice, quantity

        Encapsulate all the fields:
            Conditions:
                name can not be empty or blank
                name can not contain any special characters other than space
                name must start with letters
                unit price can not be negative
                quantity can not be negative
                if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


        Add a constructor that allows user to set all the fields when the object is created.
                (If the arguments not valid it should not be set to the instances)

        Methods:
            calcCost(): returns the total cost
            toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
     */
}
