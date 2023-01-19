package day06_ifStatement;

public class EqualNumbers {
    /*
    Create a class named EqualNumbers, and write a program that can check the equality of the three given numberrs
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal
     */
    public static void main(String[] args) {
     int n1= 5,
     n2 = 90,
             n3 = 85;
     if (n1==n2 && n1==n3){
         System.out.println("all equal");
     }
     if (n1!=n2 && n1!=n3){
         System.out.println("none of them are equal");
     }

        if( n1==n2 && n3 != n1){
            System.out.println("n1&n2 are equal");
        }
if(n2==n3 && n1!=n2){
    System.out.println("n2&n3 are equal");
}
if(n3==n1 && n2!=n1){
    System.out.println("n3&n1 are equal");
}










    }
}
