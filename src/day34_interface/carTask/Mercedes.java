package day34_interface.carTask;

public class Mercedes extends Car implements AutoPark{
    public Mercedes(String model, int year, double price, String color) {
        super("Mercedes", model, year, price, color);
    }

    @Override
    protected void start() {
        System.out.println("Twist the key to ignition to start "+getMake()+" "+getModel());
    }

    @Override
    protected void drive() {
        System.out.println("Driving Mercedes "+ getModel()+" is cool");
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+" has auto park feature");
    }
}
