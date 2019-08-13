/**
 * @(#)Customers.java
 *
 *
 * @author
 * @version 1.00 2019/8/1
 */


public class Customers {
	private String custId;
	private Name custName;
	private String custIc;
	private String passportNo;
	private String contactNo;
	private Member member;
	private Address address;
	private int custCount  ;


	//constructors
    public Customers() {
    }

    public Customers(Name custName,String custIc,String passportNo,String contactNo,Address address){

    	this.custId = "C"+ Integer.toString(custCount++);
    	this.custName = custName;
    	this.custIc = custIc;
    	this.passportNo = passportNo;
    	this.contactNo = contactNo;
    	this.address = address;

    }

    //getters
    public String getCustId(){
    	return custId;
    }
    public Name getCustName(){
    	return custName;
    }
    public String getCustIc(){
  		return custIc;
    }
    public String getPassportNo(){
    	return passportNo;
    }
    public String getContactNo(){
  		return contactNo;
    }
    public Member getMember(){
    	return member;
    }
    public Address getAddress(){
  		return address;
    }

    //setters
    public void setCustName(Name custName){
    	this.custName = custName;
    }
    public void setContactNo(String contactNo){
    	this.contactNo = contactNo;
    }
    public void setMember(Member member){
    	this.member = member;
    }
    public void setAddress(Address address){
    	this.address = address;
    }

    //toString
    public String toString(){
    	return String.format("|%s\t\t\t" +
    						 "|%s\t\t" +
    						 "|%s\t\t\t" +
    						 "|%s\t\t" +
    						 "|%s|\n",
    						 custName.toString(),custIc,passportNo,contactNo,
    						 address.toString());
    }

    //methods
        public static boolean validationCustDetails(String custIc,String passportNo,String contactNo){
    	int digitCount = 0,letterCount = 0,symbolTest;
    	if(passportNo.indexOf(" ")== -1)
    	{
    		if(passportNo.length() == 9){
    		for(int i=0;i<passportNo.length();i++)
    		{
    			if(Character.isDigit(passportNo.charAt(i))==true)
    					digitCount++;
    			if(Character.isLetter(passportNo.charAt(i))==true)
    			      	letterCount++;
    		}
    		symbolTest = letterCount+digitCount;
    		if(symbolTest == passportNo.length())
    			return true;
       		if(digitCount == 8){
       			if(passportNo.charAt(0) == ('A') ||passportNo.charAt(0) == ('H')||passportNo.charAt(0) == ('K')||passportNo.charAt(0) == ('a') ||passportNo.charAt(0) == ('h')||passportNo.charAt(0) == ('k'))
    				return true;
    		}
    		else
    			return false;
    		}
    		else
    			return false;
    	}
    	if(custIc.indexOf(" ")== -1)
    	{
    		if(custIc.length() == 12){
        	for(int i=0;i<custIc.length();i++)
    		{
    			if(Character.isDigit(custIc.charAt(i))==true)
    					digitCount++;
    			if(Character.isLetter(custIc.charAt(i))==true)
    			      	letterCount++;
    		}
    		if(letterCount > 0)
    			return false;
       		else
    		{
    		if(digitCount == custIc.length())
    			return true;
    		else
    			return false;
    		}
    		}
    		else
    			return false;

    	}
    	if(contactNo.indexOf(" ")== -1)
    	{
    		if(contactNo.length() == 10 ||contactNo.length() == 11){
        	for(int i=0;i<contactNo.length();i++)
    		{
    			if(Character.isDigit(contactNo.charAt(i))==true)
    					digitCount++;
    			if(Character.isLetter(contactNo.charAt(i))==true)
    			      	letterCount++;
    		}
    		if(letterCount > 0)
    			return false;
       		else
    		{
    		if(digitCount == contactNo.length())
    			return true;
    		else
    			return false;
    		}
    		}
    		else
    			return false;

    	}
    	else
    		return false;
    }


}