/**
 * @(#)Insurance.java
 *
 *
 * @author
 * @version 1.00 2019/7/30
 */


public class Insurance extends Product{
	private char insuranceType;

    public Insurance(String country, String place, int dateDepart, int dateReturn, int dateConfirm, char insuranceType) {
    	super(country,place,dateDepart,dateReturn,dateConfirm);
    	this.insuranceType= insuranceType;
    }

    //getter
    public char getInsuranceType(){
    	return insuranceType;
    }

    //setter
    public void setInsuranceType(char insuranceType){
    	this.insuranceType = insuranceType;
    }

    public String toString(){
    	return String.format("%s\n");
    }
}