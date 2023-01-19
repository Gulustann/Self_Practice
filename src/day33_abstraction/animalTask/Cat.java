package day33_abstraction.animalTask;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender) {
        super(name, breed, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating cat food");
    }
}
