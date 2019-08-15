/**
 * @(#)Package.java
 *
 *
 * @author
 * @version 1.00 2019/7/30
 */


public class Package extends Product{
	private String staffName;
	private int tripDuration, maxSeat, qtySold=0;
	private double price;

    public Package(String country, String place, String dateDepart,String staffName,int tripDuration,double price,int maxSeat)
    {
    	super(country,place,dateDepart);
    	this.staffName = staffName;
    	this.tripDuration = tripDuration;
    	this.price = price;
    	this.maxSeat = maxSeat;
    }

    //getter
    public String getstaffName(){
    	return staffName;
    }

    public int tripDuration(){
    	return tripDuration;
    }

    public double getprice(){
    	return price;
    }

    public int getmaxSeat(){
    	return maxSeat;
    }

    //setter
    public void setTripDuration(int tripDuration){
    	this.tripDuration = tripDuration;
    }

    public void setStaffName(String staffName){
    	this.staffName = staffName;
    }

    public void setPrice(double price){
    	this.price = price;
    }

    public void setMaxSeat(int maxSeat){
    	this.maxSeat = maxSeat;
    }

    public String toString(){
    	return String.format("%s" + "%s\t" + "%d" + "\t%.2f\t" + "\t%d\t" + "\t%d\n", super.toString(), staffName, tripDuration, price, maxSeat, qtySold);
    }

    public int soldQty(){
    	return qtySold++;
    }

    public int returnQty(){
    	return qtySold--;
    }

}