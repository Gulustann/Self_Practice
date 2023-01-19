package day30_Inheritance.deviceTask;

public class TV extends Device{
    public TV(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void channelUp(){
        System.out.println(getBrand()+" "+ getModel()+" has remote controller with channel up option");
    }
    public void channelDown(){
        System.out.println(getBrand()+" "+ getModel()+" has remote controller with channel down option");
    }
}
