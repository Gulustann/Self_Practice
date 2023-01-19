package day29_Inheritance.phoneTask;

public class IPhone extends Phone{
public void faceTime(long phoneNumber){
    System.out.println("Facetiming with: " + phoneNumber);
}
public void faceTime(String email){
    System.out.println("Sending email to: " + email);
}


}
/*
                faceTime(long phoneNumber)
				faceTime(String email)
 */