package day30_Inheritance.deviceTask;

public class Computer extends Device{
    private String OS;
    private boolean hasTouchScreen, touchID;

    public Computer(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton, String OS, boolean hasTouchScreen, boolean fingerPrintReader) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
        setOS(OS);
        setHasTouchScreen(hasTouchScreen);
        setFingerPrintReader(fingerPrintReader);
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public boolean isHasTouchScreen() {
        return hasTouchScreen;
    }

    public void setHasTouchScreen(boolean hasTouchScreen) {
        this.hasTouchScreen = hasTouchScreen;
    }

    public boolean isFingerPrintReader() {
        return touchID;
    }

    public void setFingerPrintReader(boolean fingerPrintReader) {
        this.touchID = fingerPrintReader;
    }
}
