/**
 * @(#)Address.java
 *
 *
 * @author
 * @version 1.00 2019/8/1
 */


public class Address {
	private String street;
	private int postcode;
	private String state;


	//constructors
    public Address() {
    }

    public Address(String street,int postcode,String state){
    	this.street = street;
    	this.postcode = postcode;
    	this.state = state;
    }

    //getters
    public String getStreet(){
    	return street;
    }
    public int getPostcode(){
  		return postcode;
    }
    public String getState(){
    	return state;
    }

    //setters
    public void setStreet(String street){
    	this.street = street;
    }
    public void setPostcode(int postcode){
    	this.postcode = postcode;
    }
    public void setState(String state){
    	this.state = state;
    }

    //toString
    public String toString(){
    	return String.format("%s,\n" +
    						 "%d,\n" +
    						 "%s.\n",
    						 street,postcode,state);
    }

    //methods
    public static boolean validationAddress(String street,int postcode,String state){
    	int digitCount = 0,letterCount = 0,symbolTest;
    	if(street.indexOf(" ")== -1)
    	{
    		for(int i=0;i<street.length();i++)
    		{
    			if(Character.isDigit(street.charAt(i))==true)
    					digitCount++;
    			if(Character.isLetter(street.charAt(i))==true)
    			      	letterCount++;
    		}
    		symbolTest = digitCount+letterCount;
    		if(street.length() == symbolTest)
    			return true;
    		else
    			return false;
    	}
    	if(state.indexOf(" ")== -1)
    	{
        	for(int i=0;i<state.length();i++)
    		{
    			if(Character.isDigit(state.charAt(i))==true)
    					digitCount++;
    			if(Character.isLetter(state.charAt(i))==true)
    			      	letterCount++;
    		}
    		if(digitCount > 0)
    			return false;
    		else
    		{
    		if(letterCount == state.length())
    			return true;
    		else
    			return false;
    		}
    	}
    	if(postcode > 10000 || postcode < 99999){
    			return true;
    	}
    	else
    		return false;

    }



}