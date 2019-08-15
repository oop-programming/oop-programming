/**
 * @(#)Product.java
 *
 *
 * @author
 * @version 1.00 2019/7/30
 */


public class Product {
	private String country, place, dateDepart, productID;
	private static int lastAssignedNum = 1;
	private final int confirmationDuration = 14;

    public Product(String country, String place, String dateDepart){
    	this.country = country;
    	this.place = place;
    	this.dateDepart = dateDepart;
    	productID = "P" + lastAssignedNum;
    	lastAssignedNum++;
    }

    //getter
    public String getCountry(){
    	return country;
    }

    public String getPlace(){
    	return place;
    }

    public String getdateDepart(){
    	return dateDepart;
    }

    public String getProductID(){
    	return productID;
    }

    //setter
    public void setCountry(String country){
    	this.country= country;
    }

     public void setPlace(String Place){
    	this.place = place;
    }

     public void setDateDepart(String dateDepart){
    	this.dateDepart= dateDepart;
    }

    public String toString(){
    	return String.format("%s\t" + "%s\t" + "%s\t\t" + "%s\t",
    						 productID, country, place, dateDepart);
    }

//    public static int checkDigit(){
//
//    	while(true){
//    	try
//    	{
//    		return s.nextInt();
//    	}
//    	catch(InputMismatchException e){
//    		s.next();
//    		System.out.print("Invalid datatype.Please re-enter: ");
//    	}
//    }


}
