/**
 * @(#)Testdate.java
 *
 *
 * @author 
 * @version 1.00 2019/8/13
 */
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Testdate {

    public Testdate() {
    }
    //check date diffrent (need slily modifycaton)
    public static void main(String[] args){
    	float day;
		SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
		String inputString1 = "23-01-1997";
		String inputString2 = "27-04-1997";
		
		validateJavaDate(inputString1);
		validateJavaDate(inputString2);
		
		try {
		    Date date1 = myFormat.parse(inputString1);
		    Date date2 = myFormat.parse(inputString2);
		    long diff = date2.getTime() - date1.getTime();
		    System.out.println ("Days: " + (diff / (1000*60*60*24)));
		} catch (ParseException e) {
		  	e.printStackTrace();
		}    	
    }
    
    //validate format patten
    public static boolean validateJavaDate(String strDate){
	/* Check if date is 'null' */
	if (strDate.trim().equals(""))
	{
	    return true;
	}
	/* Date is not 'null' */
	else
	{
	    /*
	     * Set preferred date format,
	     * For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.*/
	    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); ////////////////////////////////check is same to this format
	    dateFormat.setLenient(false);
	    /* Create Date object
	     * parse the string into date 
             */
	    try
	    {
	        Date javaDate = dateFormat.parse(strDate); 
	        System.out.println(strDate+" is valid date format");
	    }
	    /* Date format is invalid */
	    catch (ParseException e)///////////////////////////////////////////////////////////////////////////parse mean that access the string(maybe
	    {
	        System.out.println(strDate+" is Invalid Date format");
	        return false;
	    }
	    /* Return true if date format is valid */
	    return true;
	}
   }
    
}