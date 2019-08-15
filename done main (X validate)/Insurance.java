/**
 * @(#)Insurance.java
 *
 *
 * @author
 * @version 1.00 2019/7/30
 */

public class Insurance extends Product{
	private char insuranceType;

    public Insurance(String country, String place,String dateDepart, char insuranceType) {
    	super(country,place,dateDepart);
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
    	return String.format("%s\t\t%c\n",super.toString(), insuranceType);
    }
}