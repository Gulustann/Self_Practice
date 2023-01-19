package day29_Inheritance;

import java.util.Scanner;

public class Item {
    private String name;
    private double price;
    private int quantity;
    Scanner sc = new Scanner(System.in);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.err.println(name + "name can't be empty or blank");
            System.exit(1);
        }
        for (char each : name.toCharArray()) {
            if (!(Character.isLetter(each) || each == ' ')) {
                System.err.println("name can not contain a special letter" + name);
                System.exit(1);
            }
        }
        if (Character.isDigit(name.charAt(0))) {
            System.err.println("first element cant be digit");
            System.exit(1);
        }
        this.name = name;
    }


    public double getPrice() {
        System.out.println("Please enter secret code");
        String secretCode = sc.next();
        sc.close();
        if (secretCode.equals("WoodenSpoon")) {
            return price;
        } else {
            System.err.println("Invalid secret code");
            System.exit(1);
        }
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("price can not be negative " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            System.err.println("price can not be negative " + quantity);
            System.exit(1);
        }
        if (name.equalsIgnoreCase("toilet paper") && (quantity > 1)) {
            System.err.println("quantity of the toilet paper ");
        }
        this.quantity = quantity;
    }

    public Item(String name, double price, int quantity) {
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public double calcCost() {
        return quantity * price;
    }

    public String toString() {
        return "Item{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", cost=" + calcCost() +
                '}';
    }


}

