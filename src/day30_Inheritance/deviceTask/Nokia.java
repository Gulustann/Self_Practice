package day30_Inheritance.deviceTask;

public class Nokia extends Phone{

    public Nokia(String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Nokia", model, color, size, price, hasBattery, hasPowerButton);
    }

    public void selfDefense(){
        System.out.println("Nokia can be used as self defense tool");
    }
}
