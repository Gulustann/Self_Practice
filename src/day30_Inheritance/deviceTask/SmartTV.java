package day30_Inheritance.deviceTask;

public class SmartTV extends TV{
    private String screenType;

    public SmartTV(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton, String screenType) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
        setScreenType(screenType);
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public void watchingMovie(){
        System.out.println(getBrand() +" "+ getModel()+ " has access to Netflix o watch movie");
    }
    public void LocalNews(){
        System.out.println(getModel()+ " allows watch local news online");
    }

}
