/**
 * @(#)Product.java
 *
 *
 * @author
 * @version 1.00 2019/7/30
 */


public class Product {
	private String country, place;
	private int dateDepart, dateReturn, dateConfirm, productID;
	private static int lastAssignedNum = 1;

    public Product(String country, String place, int dateDepart, int dateReturn, int dateConfirm){
    	this.country = country;
    	this.place = place;
    	this.dateDepart = dateDepart;
    	this.dateReturn = dateReturn;
    	this.dateConfirm = dateConfirm;
    	productID = lastAssignedNum;
    	lastAssignedNum++;
    }

    //getter
    public String getCountry(){
    	return country;
    }

    public String getPlace(){
    	return place;
    }

    public int getdateDepart(){
    	return dateDepart;
    }

    public int getdateReturn(){
    	return dateReturn;
    }

    public int getdateConfirm(){
    	return dateConfirm;
    }

    public int getProductID(){
    	return productID;
    }

    //setter
    public void setCountry(String country){
    	this.country= country;
    }

     public void setPlace(String Place){
    	this.place = place;
    }

     public void setDateDepart(int dateDepart){
    	this.dateDepart= dateDepart;
    }

     public void setDateReturn(int dateReturn){
    	this.dateReturn = dateReturn;
    }

     public void setDateConfirm(int dateConfirm){
    	this.dateConfirm = dateConfirm;
    }

    public String toString(){
    	return String.format("P%04d\t" + "%s\t" + "%s\t\t" + "%d/%d/%d\t" + "%d/%d/%d\t" + "%d/%d/%d",
    						 productID, country, place, dateDepart, dateReturn, dateConfirm);
    }




}
