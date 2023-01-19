package day25_dateTimeFormattingConstructor;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {


   Offer offer1 = new Offer("Chicago", "Abbott", "Java Tester", 125000, true, false, true, false);
    Offer offer2 = new Offer("Chicago", "Abbvie", "SDET", 110000, true, true, true, false);
    Offer offer3 = new Offer("Chicago", "SGS", "Java SDET Developer", 90000, false, false, false, true);
    Offer offer4 = new Offer("Chicago", "MGP", "Engineer in Test", 100000, true, true, true, true);
    Offer offer5 = new Offer("Lake Geneova", "Google", "Developer", 130000, true, true, true, false);
    Offer offer6 = new Offer("Vermont", "CYDEO", "SDET Teacher", 110000, true, true, true, true);
    Offer offer7 = new Offer("Boston", "Microsoft", "Test Engineer", 120000, true, false, true, false);

        System.out.println("_________________________________________________");


    Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5, offer6,offer7};

    /*
    Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
     */
    ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
    fullTimeOffers.removeIf(p-> p.isFullTime != true);
        System.out.println(fullTimeOffers);
        System.out.println("__________________________________________________________");
/*
2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
 */
ArrayList<Offer> localOffers =  new ArrayList<>();
localOffers.addAll(Arrays.asList(myOffers));
localOffers.removeIf(p-> !p.location.equalsIgnoreCase("Chicago"));
        System.out.println(localOffers);
        System.out.println("__________________________________________________________");
        /*
      2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
         */
ArrayList<Offer> offerWithBenefits = new ArrayList<>();
offerWithBenefits.addAll(Arrays.asList(myOffers));
offerWithBenefits.removeIf(p-> p.hasBenefit== false || p.hasPTO==false);
        System.out.println(offerWithBenefits);

        System.out.println("__________________________________________________________");
        /*
 2.6 Create an ArrayList of Offer named devOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that does not contain developer in the jobTitle
         */
ArrayList<Offer> devOffers = new ArrayList<>();
devOffers.addAll(Arrays.asList(myOffers));
devOffers.removeIf(p->! p.jobTitle.toLowerCase().contains("developer"));
        System.out.println(devOffers);
        System.out.println("__________________________________________________________");
/*
2.7 Create an ArrayList of Offer named offers With100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
 */
ArrayList<Offer> offersWith100K = new ArrayList<>();
offersWith100K.addAll(Arrays.asList(myOffers));
offersWith100K.removeIf(p-> p.salary<100000);
        System.out.println(offersWith100K);




    }
}
