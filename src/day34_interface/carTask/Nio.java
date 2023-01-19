package day34_interface.carTask;

public class Nio extends Car implements AutoPilot{
    public Nio(String model, int year, double price, String color) {
        super("Nio", model, year, price, color);
    }

    @Override
    protected void start() {
        System.out.println("Use voice control to start "+getMake()+" "+getModel());
    }

    @Override
    protected void drive() {
        System.out.println("Driving Tesla "+ getModel()+" is pricey");
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+" has auto park feature");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+" "+getModel()+" has auto pilot feature");
    }
}
