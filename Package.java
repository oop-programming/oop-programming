/**
 * @(#)Package.java
 *
 *
 * @author
 * @version 1.00 2019/7/30
 */


public class Package extends Product{
	private String description, staffName;
	private int price, maxSeat, qtySold;

    public Package(String country,String place,int dateDepart,int dateReturn,int dateConfirm,String description,String staffName,int price,int maxSeat)
    {
    	super(country,place,dateDepart,dateReturn,dateConfirm);
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

    public int getprice(){
    	return price;
    }

    public int getmaxSeat(){
    	return maxSeat;
    }

    //setter
    public void setDescription(){
    	this.description = description;
    }

    public void setStaffName(){
    	this.staffName = staffName;
    }

    public void setPrice(){
    	this.price = price;
    }

    public void setMaxSeat(){
    	this.maxSeat = maxSeat;
    }

    public String toString(){
    	return String.format("%s" + "%s\t" + "\t%d\t" + "\t%d\t" + "\t%d", super.toString(), staffName, price, maxSeat, qtySold);
    }

    public int soldQty(){
    	return qtySold++;
    }

    public int returnQty(){
    	return qtySold--;
    }

}