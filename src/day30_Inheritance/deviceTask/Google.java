package day30_Inheritance.deviceTask;

public class Google extends Phone{

    public Google(String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Goodle", model, color, size, price, hasBattery, hasPowerButton);
    }

    public void map(){
        System.out.println(getModel()+ " has updated map");
    }
}
