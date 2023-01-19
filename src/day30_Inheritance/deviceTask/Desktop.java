package day30_Inheritance.deviceTask;

public class Desktop extends PC{
    private boolean hasKeyboard, hasMouse;

    public Desktop(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton, String OS, boolean hasTouchScreen, boolean fingerPrintReader, String personalOrWorkPC, String desktopOrLapTop, boolean hasKeyboard, boolean hasMouse) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton, OS, hasTouchScreen, fingerPrintReader, personalOrWorkPC, desktopOrLapTop);
       setHasKeyboard(hasKeyboard);
        setHasMouse(hasMouse);
    }

    public boolean isHasKeyboard() {
        return hasKeyboard;
    }

    public void setHasKeyboard(boolean hasKeyboard) {
        this.hasKeyboard = hasKeyboard;
    }

    public boolean isHasMouse() {
        return hasMouse;
    }

    public void setHasMouse(boolean hasMouse) {
        this.hasMouse = hasMouse;
    }

    public void space(){
        System.out.println();
    }
}
