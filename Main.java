/**
 * @(#)Main.java
 *
 *
 * @author
 * @version 1.00 2019/8/2
 */
import java.util.Scanner;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args){

    ArrayList<Customers> custArray = new ArrayList<Customers>();
    String continueQuit,firstName=null,lastName=null,passport,street,state,ic,contact;
    int postcode,i = 0;
    boolean validationName,validationAddress,validationCustDetails;
    MemberType[] memberType = {
    	new MemberType("Platinium",0.30,450),
    	new MemberType("Gold",0.20,300),
    	new MemberType("SIlver",0.10,200)
    		};
	Scanner s = new Scanner (System.in);


    do{		System.out.printf("Do you like to add customer or member:");
			String choice = s.nextLine();

			if(choice.equalsIgnoreCase("Customer")|| choice.equalsIgnoreCase("Member")){
				do{

				System.out.printf("Please fill in the requirement-:\n");
				System.out.printf("Name:");
				firstName = s.next();
			    lastName = s.nextLine();
			    System.out.printf("Ic No:");
			    ic = s.nextLine();
			    System.out.printf("Passport No:");
			    passport = s.nextLine();
			    System.out.printf("Contact No:");
			    contact = s.nextLine();
			    System.out.printf("Street:");
			    street = s.nextLine();
			    System.out.printf("Postcode:");
			    postcode = s.nextInt();
			    System.out.printf("State:");
			    s.nextLine();
			    state = s.nextLine();
			    if(choice.equalsIgnoreCase("Member")){
			    	for(int j=0;j<memberType.length;j++)
    				{
    					System.out.println((j+1) + ". " +memberType[j].toString());
    				}
    				System.out.print("Enter your option: ");
    				int option = s.nextInt();
    				s.nextLine();

			    }
			    Name name = new Name(firstName,lastName);
			    validationName = name.validationName(firstName,lastName);
			    Address address = new Address(street,postcode,state);
			    validationAddress = address.validationAddress(street,postcode,state);
			    Customers customer = new Customers(name,ic,passport,contact,address);
			    validationCustDetails = customer.validationCustDetails(ic,passport,contact);
				if(validationName == false)
					System.out.printf("Invalid entry in name field! Please fill in again.\n");
				else if(validationAddress == false)
					System.out.printf("Invalid entry in address field! Please fill in again.\n");
				else if(validationCustDetails == false)
					System.out.printf("Invalid entry! Please fill in again.\n");
				else
				{

   				    custArray.add(new Customers(name, ic, passport, contact, address));
   				    System.out.printf("|Name\t\t\t\t\t\t|Identity Card\t\t\t|Passport No\t\t|Contact No\t\t|Address\t\t|\n");
  					System.out.println(custArray.get(i));
  					i++;
				}

				}while(validationName == false || validationAddress == false || validationCustDetails == false);
			}
		System.out.println("Do you want to continue to add customer or quit(Yes=Add/Quit=Quit)");
	    continueQuit = s.nextLine ();

    	}while(continueQuit.equalsIgnoreCase("yes"));

	}

}