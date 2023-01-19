package day30_Inheritance.deviceTask;

public class Samsung extends Phone{

    public Samsung(String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Samsung", model, color, size, price, hasBattery, hasPowerButton);
    }

    public void freeze(){
        System.out.println(getModel() + " freezes a lot.");
    }
}
