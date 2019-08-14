/**
 * @(#)testDate.java
 *
 *
 * @author
 * @version 1.00 2019/8/11
 */
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;


public class testDate {

    public testDate() {

    }

    public static void main (String[] args){
    	Scanner s = new Scanner(System.in);

    	System.out.print("Enter the date(dd-MM-yyyy):");
    	String inputString1 = s.nextLine();
    	System.out.print("Enter the date(dd-MM-yyyy):");
    	String inputString2 = s.nextLine();

    	float day;

		SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");

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

   boolean validDateTime      = false;
   			do{
                     try{
                         System.out.print("New Show Hour(0-24):");
                         int showHour =scan.nextInt();
                         System.out.print("New Show Minutes(0-59):");
                         int showMinute = scan.nextInt();
                        System.out.print("New Show Year:");
                        int showYear = scan.nextInt();
                        System.out.print("New Show Month(1-12):");
                        int showMonth = scan.nextInt();
                        System.out.print("New Show Day(1-28/29/30/31):");
                        int showDay = scan.nextInt();
                        Show showNew = new Show(showHour,showMinute , showYear ,showMonth, showDay , movieDetail.get(showOption-1));
                        validDateTime = showNew.checkDateTIme(showYear, showMonth, showDay, showHour, showMinute);
                        if(validDateTime == true){
                            show.add(showNew);
                            System.out.printf("Show time for %s is added\n",movieDetail.get(showOption-1).getMovieName());
                            }
                        else{
                            System.out.println("Invalid Date and Time format");
                            }
                      }
                        catch(Exception e){
                                 scan.nextLine();
                                System.out.println("Error occur pls reenter");
                                validDateTime = false;
                                }
                    }while(validDateTime==false);

 }

