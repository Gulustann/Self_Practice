package day30_Inheritance.sportTask;

public class Sport {
   private String name;
   private int numberOfPlayers, numberOfReferee;
   private String rules;

    public Sport(String name, int numberOfPlayers, int numberOfReferee, String rules) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferee = numberOfReferee;
        this.rules = rules;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        if(numberOfPlayers<=0){
            System.err.println("Number of players cannot be zero or below zero");
            System.exit(1);
        }
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfReferee() {
        return numberOfReferee;
    }

    public void setNumberOfReferee(int numberOfReferee) {
        if(numberOfReferee<=0){
            System.err.println("Number of referees cannot be zero or below zero");
            System.exit(1);
        }
        this.numberOfReferee = this.numberOfReferee;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }
    public void play(){
        System.out.println("Play "+ name);
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                ", rules='" + rules + '\'' +
                '}';
    }
}
