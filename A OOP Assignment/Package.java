/**
 * @(#)Package.java
 *
 *
 * @author
 * @version 1.00 2019/7/30
 */


public class Package extends Product{
	private String description, staffName;
	private int maxSeat, qtySold;
	private double price;

    public Package(String country, String place, String dateDepart,String description,String staffName,double price,int maxSeat)
    {
    	super(country,place,dateDepart);
    	this.description = description;
    	this.staffName = staffName;
    	this.price = price;
    	this.maxSeat = maxSeat;
    }

    //getter
    public String getdescription(){
    	return description;
    }

    public String getstaffName(){
    	return staffName;
    }

    public double getprice(){
    	return price;
    }

    public int getmaxSeat(){
    	return maxSeat;
    }

    //setter
    public void setDescription(String description){
    	this.description = description;
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
    	return String.format("%s" + "%s\t" + "\t%.2f\t" + "\t%d\t" + "\t%d\n", super.toString(), staffName, price, maxSeat, qtySold);
    }

    public int soldQty(){
    	return qtySold++;
    }

    public int returnQty(){
    	return qtySold--;
    }

}