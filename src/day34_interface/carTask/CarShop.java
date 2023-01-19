package day34_interface.carTask;

public class CarShop {
    public static void main(String[] args) {
       Audi audi = new Audi("Q6", 2021, 35000, "Black");

       BMW bmw = new BMW("S7", 2022, 45000, "Blue");

       CydeoCar cydeoCar = new CydeoCar("QAX", 2023, 55000, "White");

       Honda honda = new Honda("Accord", 2020, 26000, "Red");

       Mercedes mercedes = new Mercedes("KLX", 2019, 35000, "Beige");

       Nio nio = new Nio("Nio01", 2022, 20000, "Purple");

       Tesla tesla = new Tesla("Model S", 2021, 55000, "Blue");

       Toyota toyota = new Toyota("Corolla", 2022, 28000, "White");

        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(cydeoCar);
        System.out.println(honda);
        System.out.println(mercedes);
        System.out.println(nio);
        System.out.println(tesla);
        System.out.println(toyota);

        System.out.println("__________________________________________________");

        tesla.autoPark();
        tesla.selfDrive();

        cydeoCar.fly();

        nio.selfDrive();
        nio.autoPark();


    }
}
