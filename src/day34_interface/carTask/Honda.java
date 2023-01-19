package day34_interface.carTask;

public class Honda extends Car{
    public Honda(String model, int year, double price, String color) {
        super("Honda", model, year, price, color);
    }

    @Override
    protected void start() {
        System.out.println("Twist the ket to ignition to start "+getMake()+" "+getModel());
    }

    @Override
    protected void drive() {
        System.out.println("Driving "+getMake()+" "+getModel()+" is safe");
    }
}
