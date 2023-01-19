package day30_Inheritance.deviceTask;

public class BlackBerry extends Phone{

    public BlackBerry(String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("BlackBerry", model, color, size, price, hasBattery, hasPowerButton);
    }

    public boolean isBlack(){
        System.out.println(getModel() + " is only available in black color");
        return true;
    }
}
