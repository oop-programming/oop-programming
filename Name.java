/**
 * @(#)Name.java
 *
 *
 * @author
 * @version 1.00 2019/8/1
 */


public class Name {
	private String firstName;
	private String lastName;

	//constructors
    public Name() {
    }

    public Name(String firstName,String lastName){
    	this.firstName = firstName;
    	this.lastName = lastName;
    }

    //getters
    public String getFirstName(){
    	return firstName;
    }
    public String getLastName(){
  		return lastName;
    }

    //setters
    public void setFirstName(String firstName){
    	this.firstName = firstName;
    }
    public void setLastName(String lastName){
    	this.lastName = lastName;
    }

    //toString
    public String toString(){
    	return String.format("%s %s",lastName,firstName);
    }

    //methods
    public static boolean validationName(String firstname,String lastname){
    	int digitCount = 0,letterCount = 0;
    	if(firstname.indexOf(" ")== -1)
    	{
    		for(int i=0;i<firstname.length();i++)
    		{
    			if(Character.isDigit(firstname.charAt(i))==true)
    					digitCount++;
    			if(Character.isLetter(firstname.charAt(i))==true)
    			      	letterCount++;
    		}
    		if(digitCount > 0)
    			return false;
    		else
    		{
    		if(letterCount == firstname.length())
    			return true;
    		else
    			return false;
    		}
    	}
    	if(lastname.indexOf(" ")== -1)
    	{
        	for(int i=0;i<lastname.length();i++)
    		{
    			if(Character.isDigit(lastname.charAt(i))==true)
    					digitCount++;
    			if(Character.isLetter(lastname.charAt(i))==true)
    			      	letterCount++;
    		}
    		if(digitCount > 0)
    			return false;
    		else
    		{
    		if(letterCount == lastname.length())
    			return true;
    		else
    			return false;
    		}
    	}
    	else
    		return false;

    }


}