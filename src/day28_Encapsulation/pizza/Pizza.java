package day28_Encapsulation.pizza;

public class Pizza {
 private String size;
 private int numberOfCheeseToppings, numberOfPepperoniToppings;

    public Pizza(String size, int numberOfCheeseToppings, int numberOfPepperoniToppings) {
        setSize(size);
        setNumberOfCheeseToppings(numberOfCheeseToppings);
        setNumberOfPepperoniToppings(numberOfPepperoniToppings);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") ||
        size.equalsIgnoreCase("large"))){
            System.err.println("invalid size: " + size);
            System.exit(1);
        }
        this.size = size;
    }

    public int getNumberOfCheeseToppings() {
        return numberOfCheeseToppings;
    }

    public void setNumberOfCheeseToppings(int numberOfCheeseToppings) {
        if(numberOfCheeseToppings<0){
            System.err.println("numberOfCheeseToppings cannot be less than zero");
            System.exit(1);
        }
        if(size.equalsIgnoreCase("small")){
           if(numberOfCheeseToppings>3){
               System.err.println("Number of cheese toppings cannot be more than 3 for small size pizza");
               System.exit(1);
           }
        }
        if(size.equalsIgnoreCase("medium")){
            if(numberOfCheeseToppings>4){
                System.err.println("Number of cheese toppings cannot be more than 4 for medium size pizza");
                System.exit(1);
            }
        }
        if(size.equalsIgnoreCase("large")){
            if(numberOfCheeseToppings>4){
                System.err.println("Number of cheese toppings cannot be more than 5 for large size pizza");
                System.exit(1);
            }
        }
        this.numberOfCheeseToppings = numberOfCheeseToppings;
    }

    public int getNumberOfPepperoniToppings() {
        return numberOfPepperoniToppings;
    }

    public void setNumberOfPepperoniToppings(int numberOfPepperoniToppings) {
        if(numberOfPepperoniToppings<0){
            System.err.println("numberOfPepperoniToppings cannot be less than zero");
            System.exit(1);
        }
        if(size.equalsIgnoreCase("small")){
            if(numberOfPepperoniToppings>4){
                System.err.println("Number of pepperoni toppings cannot be more than 4 for small size pizza");
                System.exit(1);
            }
        }
        if(size.equalsIgnoreCase("medium")){
            if(numberOfPepperoniToppings>5){
                System.err.println("Number of pepperoni toppings cannot be more than 5 for medium size pizza");
                System.exit(1);
            }
        }
        if(size.equalsIgnoreCase("large")){
            if(numberOfPepperoniToppings>6){
                System.err.println("Number of pepperoni toppings cannot be more than 6 for large size pizza");
                System.exit(1);
            }
        }
        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }

    public double calcCost(){
        double cost=0;
        if(size.equalsIgnoreCase("small")){
            cost = 10 + 2*(numberOfPepperoniToppings+numberOfCheeseToppings);
        } else if(size.equalsIgnoreCase("medium")){
            cost = 12 + 2*(numberOfPepperoniToppings+numberOfCheeseToppings);
        }else {
            cost = 14 + 2*(numberOfPepperoniToppings+numberOfCheeseToppings);
        }
        return cost;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseToppings=" + getNumberOfCheeseToppings() +
                ", numberOfPepperoniToppings=" + getNumberOfPepperoniToppings() +
                ", cost='" + calcCost() + '\'' +
                '}';
    }
    /*
    4. Create class named Pizza:
                private variables:
                    size, numberOfCheeseTopping, numberOfPepperoniTopping

                Encapsulate all the fields
                        Conditions:
                            size of the pizza can only be small, medium, large. case insensitive

                            Number of cheese topping can not be negative, the maximum number of cheese topping is:
                                        small: 3
                                        medium: 4
                                        large: 5

                            Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

                                        small: 4
                                        medium: 5
                                        large: 6

                Add a constructor that allows user to set all the fields when the object is created.
                                (If the arguments not valid it should not be set to the instances)


                Methods:
                    calcCost(): returns the totalCost of the pizza
                    toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

     */
}
