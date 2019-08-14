/**
 * @(#)main2.java
 *
 *
 * @author 
 * @version 1.00 2019/8/14
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class main2 {
	
	
	public static void main(String[] args)
	{
		//DECLARATION
   		ArrayList<Customers> custArray = new ArrayList<Customers>();
    	ArrayList<Member> memArray = new ArrayList<Member>();
    	String continueQuit,firstName=null,lastName=null,passport,street,state,ic,postcode,contact,editCustId,searchCustId,removeCustId,checkContact;
    	String checkPassport,checkIc;
    	int i = 0,selection = 0,choice,digitCount =0 ,letterCount = 0,option =0;
    	boolean validationName,validationAddress,validationCustDetails,validationContact = false,checkExistContact = false,checkExistPassport= false,checkExistIc = false;
    	char quitChoice = 'Q',continuePro = 'Q',addCust;
    	Scanner s = new Scanner (System.in);
    	
    	//initialize member
    	MemberType[] memberType = {new MemberType("Platinium",0.30,450),new MemberType("Gold",0.20,300),new MemberType("Silver",0.10,200)};
    	
    	//Initialized
		custArray.add(new Customers(new Name("XinEe","TanTeoh"), "000212072095", "A01928374", "0174063849", new Address("Jalan Fila 2","19289","Pulau Pinang")));
		custArray.add(new Customers(new Name("Nigel","Lee"), "000131071195", "A08712372", "0174876849", new Address("Jalan Sulaj 1","23189","Pulau Pinang")));
		custArray.add(new Customers(new Name("YiHong","Tan"), "000512072043", "A98728358", "0124638495", new Address("Jalan Jitra 5","19289","Pulau Pinang")));
		memArray.add(new Member(new Name("XiaoYu","Tan"), "001212072235", "A19028476", "0110293849", new Address("Jalan SiaLag 4","56748","Pulau Pinang"),memberType[0]));
		memArray.add(new Member(new Name("John","Teoh"), "001131070285", "A08234372", "0195066849", new Address("Jalan Liaolu 2","89882","Pulau Pinang"),memberType[1]));
		memArray.add(new Member(new Name("Winson","Ng"), "000512072323", "A05728358", "0185940849", new Address("Jalan Marvel 3","34543","Pulau Pinang"),memberType[2]));	
    	
    	
    	//main course
    	do{
	    	System.out.printf("1.Add Customer/Member\n");
			System.out.printf("2.Modify Details\n");
			System.out.printf("3.Search Customer/Member\n");
			System.out.printf("4.Remove Customer\n");
			System.out.printf("5.Quit\n");
			System.out.printf("Please enter your choice:");
	    	choice = checkDigit();
	    	
	    	if (choice == 1){
	    		addCustAndMember(custArray,memArray,memberType);
	    	}
	    	else if(choice == 2){
	    		modify(custArray,memArray,memberType);
	    	}
	    	else if(choice == 3){
	    		search(custArray,memArray,memberType);
	    	}
	    	else if(choice ==4){
	    		delete(custArray,memArray,memberType);
	    	}
	    	else{
	    		;
	    	}
	    	
	    	System.out.printf("Do you still want to continue the program(C=Continue/Q=Quit):");
			continuePro = s.next().charAt(0);
			s.nextLine();
    	}while(continuePro == 'C' || continuePro == 'c');
	}

    public static void addCustAndMember(ArrayList<Customers> custArray,ArrayList<Member> memArray,MemberType[] memberType){
    		
    	String continueQuit,firstName=null,lastName=null,passport,street,state,ic,postcode,contact,editCustId,searchCustId,removeCustId,checkContact;
    	String checkPassport,checkIc;
    	int i = 0,selection = 0,choice,digitCount =0 ,letterCount = 0,option =0;
    	boolean validationName,validationAddress,validationCustDetails,validationContact = false,checkExistContact = false,checkExistPassport= false,checkExistIc = false;
    	char quitChoice = 'Q',continuePro = 'Q',addCust;
    	Scanner s = new Scanner (System.in);
    		
    		do{		
    			System.out.printf("Do you like to add customer or member(C=Customer/M=Member/Q=Quit):");
				addCust = s.next().charAt(0);
				s.nextLine();

				if(addCust == 'C'|| addCust == 'M'||addCust == 'm'||addCust == 'c'){
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
				    	postcode = s.nextLine();
				    	System.out.printf("State:");
				    	state = s.nextLine();
			    		if(addCust == 'M'||addCust == 'm'){
			    		System.out.printf("Member Level\tDiscount Rate\tPrice\n");
			    		System.out.printf("------------\t-------------\t-----\n");
			    			for(int j=0;j<memberType.length;j++){
    							System.out.println((j+1) + ". " +memberType[j].toString());
    						}
    					System.out.print("Enter your option: ");
    			    	option = checkDigit();
    					s.nextLine();
			    		}	
			    		Name name = new Name(firstName,lastName);
			    		validationName = name.validationName(firstName,lastName);
			    		Address address = new Address(street,postcode,state);
			    		validationAddress = address.validationAddress(street,postcode,state);
			    		Customers customer = new Customers(name,ic,passport,contact,address);
		 	    		validationCustDetails = customer.validationCustDetails(ic,passport,contact);
		 	    		checkExistContact = customer.equal(contact);
		 	    		checkExistPassport = customer.equal(passport);
		 	    		checkExistIc = customer.equal(ic);
						if(validationName == false)
							System.out.printf("Invalid entry in name field! Please fill in again.\n");
						else if(validationAddress == false)
							System.out.printf("Invalid entry in address field! Please fill in again.\n");
						else if(validationCustDetails == false)
							System.out.printf("Invalid entry! Please fill in again.\n");
						else if(checkExistContact == true)
							System.out.printf("Contact Number exist in database! Please fill in again.\n");
						else if(checkExistPassport == true)
							System.out.printf("Passport No exist in database! Please fill in again.\n");
						else if(checkExistIc == true)
							System.out.printf("Identity Card Number exist in database! Please fill in again.\n");
						else{
							if(addCust == 'c'||addCust == 'C'){
			 					custArray.add(new Customers(name, ic, passport, contact, address));
			 					header();
  								System.out.printf("|" + "%s" + "%s\n" ,custArray.get(i).getCustId(),custArray.get(i).toString());
							}
							else{
								memArray.add(new Member(name, ic, passport, contact, address,memberType[option-1]));
			 					memheader();
  								System.out.println(memArray.get(i).toString());
  								i++;
							}
						}
					  }while(validationName == false || validationAddress == false || validationCustDetails == false);
				}
				if(addCust == 'Q' ||addCust == 'q')
					break;
	   			System.out.printf("Do you wish to continue or quit add customer(C=Continue/Q=Quit):");
	    		quitChoice = s.next().charAt(0);
	    		s.nextLine();
    	  }while(quitChoice == 'C' || quitChoice == 'c');
    	}
    		
    public static void modify(ArrayList<Customers> custArray,ArrayList<Member> memArray,MemberType[] memberType){
    	
    	String continueQuit,firstName=null,lastName=null,passport,street,state,ic,postcode,contact,editCustId,searchCustId,removeCustId,checkContact;
    	String checkPassport,checkIc;
    	int i = 0,selection = 0,choice,digitCount =0 ,letterCount = 0,option =0;
    	boolean validationName,validationAddress,validationCustDetails,validationContact = false,checkExistContact = false,checkExistPassport= false,checkExistIc = false;
    	char quitChoice = 'Q',continuePro = 'Q',addCust;
    	Scanner s = new Scanner (System.in);
    	
		do{
			int c = 0;
			do{
				System.out.printf("Please enter the customer id you wish to modify details:");
				editCustId = s.nextLine();
			 for(int h =0;h<custArray.size();h++){
				if(editCustId.equalsIgnoreCase(custArray.get(h).getCustId())){
  				do{
  					c = 1;
			 	    header();
  					System.out.printf("|" + "%s" + "%s\n" ,custArray.get(i).getCustId(),custArray.get(h).toString());
  					System.out.printf("1.Name\n");
  					System.out.printf("2.Contact Number\n");
  					System.out.printf("3.Address\n");
  					System.out.printf("4.Quit\n");
  					System.out.printf("Please select the field you wish to edit:");
  					selection = checkDigit();
  					if(selection == 1){
  						do{	System.out.printf("Name(firstname lastname):");
							firstName = s.next();
						    lastName = s.nextLine();
						    Name name = new Name(firstName,lastName);
						    validationName = name.validationName(firstName,lastName);
							if(validationName == false)
								System.out.printf("Invalid entry! Please fill in again.\n");
							else
							{
								header();
	             				custArray.get(h).setCustName(name);
	         					System.out.printf("|" + "%s" + "%s\n" ,custArray.get(h).getCustId(),custArray.get(h).toString());
							}
  						}while(validationName == false);

  					}
  					else if(selection == 2){
  						do{ System.out.printf("Contact No:");
						    contact = s.nextLine();
   					 	if(contact.indexOf(" ")== -1)
    					{
    					if(contact.length() == 10 ||contact.length() == 11){
        				for(int r=0;r<contact.length();r++)
    					{
    					if(Character.isDigit(contact.charAt(r))==true)
    							digitCount++;
    					if(Character.isLetter(contact.charAt(r))==true)
    			    		  	letterCount++;
    					}
    					if(letterCount > 0)
    						validationContact = false;
    			   		else
    					{
    						if(digitCount == contact.length())
    							validationContact = true;
    						else
    							validationContact = false;
    					}
    					}
    					else
    						validationContact = false;

    					}
							if(validationContact == false)
								System.out.printf("Invalid entry! Please fill in again.\n");
							else if (validationContact ==true){
							for(int z = 0;z<custArray.size();z++){
								if(contact.equals(custArray.get(z).getContactNo()))
								{
									validationContact = false;
									System.out.printf("Contact Number exist in database. Please try again.\n");
								}
							}
							}
							if (validationContact == true){
								header();
	             				custArray.get(h).setContactNo(contact);
	         					System.out.printf("|" + "%s" + "%s\n" ,custArray.get(h).getCustId(),custArray.get(h).toString());
							}
  						}while(validationContact == false);
  					}
  					else if(selection == 3){
   						do{    System.out.printf("Street:");
						       street = s.nextLine();
						       System.out.printf("Postcode:");
						       postcode = s.nextLine();
						       System.out.printf("State:");
			   			       s.nextLine();
			 				   state = s.nextLine();
						       Address address = new Address(street,postcode,state);
						       validationAddress = address.validationAddress(street,postcode,state);
							if(validationAddress == false)
								System.out.printf("Invalid entry! Please fill in again.\n");
							else
							{
	             				custArray.get(h).setAddress(address);
	             				header();
	         					System.out.printf("|" + "%s" + "%s\n" ,custArray.get(h).getCustId(),custArray.get(h).toString());
							}
  						}while(validationAddress == false);
  					}
  					else if(selection == 4)
  						break;
 					else
  						System.out.printf("Invalid Entry! Please enter again\n");
  				}while(selection != 1 && selection != 2 && selection != 3);
				}
			}
			 for(int h =0;h<memArray.size();h++){
				if(editCustId.equalsIgnoreCase(memArray.get(h).getMemberId())){
  				do{
  					c = 1;
  					memheader();
  					System.out.println(memArray.get(h).toString());
  					System.out.printf("1.Name\n");
  					System.out.printf("2.Contact Number\n");
  					System.out.printf("3.Address\n");
  					System.out.printf("4.Quit\n");
  					System.out.printf("Please select the field you wish to edit:");
  					selection = checkDigit();
  					if(selection == 1){
  						do{	System.out.printf("Name(firstname lastname):");
							firstName = s.next();
						    lastName = s.nextLine();
						    Name name = new Name(firstName,lastName);
						    validationName = name.validationName(firstName,lastName);
							if(validationName == false)
								System.out.printf("Invalid entry! Please fill in again.\n");
							else
							{
								memheader();
	             				memArray.get(h).setCustName(name);
	         					System.out.println(memArray.get(h).toString());
							}
  						}while(validationName == false);

  					}
  					else if(selection == 2){
  						do{ System.out.printf("Contact No:");
						    contact = s.nextLine();
   					 	if(contact.indexOf(" ")== -1)
    					{
    					if(contact.length() == 10 ||contact.length() == 11){
        				for(int u=0;u<contact.length();u++)
    					{
    					if(Character.isDigit(contact.charAt(u))==true)
    							digitCount++;
    					if(Character.isLetter(contact.charAt(u))==true)
    			    		  	letterCount++;
    					}
    					if(letterCount > 0)
    						validationContact = false;
    			   		else
    					{
    						if(digitCount == contact.length())
    							validationContact = true;
    						else
    							validationContact = false;
    					}
    					}
    					else
    						validationContact = false;

    					}
							if(validationContact == false)
								System.out.printf("Invalid entry! Please fill in again.\n");
							else if (validationContact ==true){
							for(int p = 0;p<custArray.size();p++){
								if(contact.equals(custArray.get(p).getContactNo()))
								{
									validationContact = false;
									System.out.printf("Contact Number exist in database. Please try again.\n");
								}
							}
							}
							if (validationContact == true){
								header();
	             				memArray.get(h).setContactNo(contact);
	         	         		System.out.println(memArray.get(h).toString());
							}
  						}while(validationContact == false);
  					}
  					else if(selection == 3){
   						do{    System.out.printf("Street:");
						       street = s.nextLine();
						       System.out.printf("Postcode:");
						       postcode = s.nextLine();
						       System.out.printf("State:");
			   			       s.nextLine();
			 				   state = s.nextLine();
						       Address address = new Address(street,postcode,state);
						       validationAddress = address.validationAddress(street,postcode,state);
							if(validationAddress == false)
								System.out.printf("Invalid entry! Please fill in again.\n");
							else
							{
								memheader();
	             				memArray.get(h).setAddress(address);
	         					System.out.println(memArray.get(h).toString());
							}
  						}while(validationAddress == false);
  					}
  					else if(selection == 4)
  						break;
  					else
  						System.out.printf("Invalid Entry! Please enter again\n");
  				}while(selection != 1 && selection != 2 && selection != 3);
				}
			}
			if(selection == 4)
				break;
			else if(c == 0)
				System.out.printf("Id not found\n");
		  }while(c == 0);
		if(selection == 4)
		break;
	   	System.out.printf("Do you wish to continue or quit modify details(C=Continue/Q=Quit):");
	    quitChoice = s.next().charAt(0);
	    s.nextLine();
    	}while(quitChoice == 'C' || quitChoice == 'c');
   }
    	
    public static void search(ArrayList<Customers> custArray,ArrayList<Member> memArray,MemberType[] memberType){
		
		String continueQuit,firstName=null,lastName=null,passport,street,state,ic,postcode,contact,editCustId,searchCustId,removeCustId,checkContact;
    	String checkPassport,checkIc;
    	int i = 0,selection = 0,choice,digitCount =0 ,letterCount = 0,option =0;
    	boolean validationName,validationAddress,validationCustDetails,validationContact = false,checkExistContact = false,checkExistPassport= false,checkExistIc = false;
    	char quitChoice = 'Q',continuePro = 'Q',addCust;
    	Scanner s = new Scanner (System.in);
		
		do{
			int a=0;
			do{
				System.out.printf("Please enter the customer id you wish to search(C1001/M1001/Quit):");
				searchCustId = s.nextLine();
				for(int k = 0;k<custArray.size();k++){
					if(searchCustId.equalsIgnoreCase(custArray.get(k).getCustId()))
					{
						header();
						System.out.printf("|" + "%s" + "%s\n" ,custArray.get(k).getCustId(), custArray.get(k).toString());
						a = 1;
					}
				}
				for(int k = 0;k<memArray.size();k++){
					if(searchCustId.equalsIgnoreCase(memArray.get(k).getMemberId()))
					{
						memheader();
						System.out.println(memArray.get(k).toString());
						a = 1;
					}
				}
				if(searchCustId.equalsIgnoreCase("quit"))
					break;
				else if(a == 0)
					System.out.printf("Id not found\n");
			}while(a == 0);
		if(searchCustId.equalsIgnoreCase("quit"))
		break;
	   	System.out.printf("Do you wish to continue or quit search details(C=Continue/Q=Quit):");
	    quitChoice = s.next().charAt(0);
	    s.nextLine();
		}while(quitChoice == 'C' || quitChoice == 'c');
    }
    	
    public static void delete(ArrayList<Customers> custArray,ArrayList<Member> memArray,MemberType[] memberType){
			
		String continueQuit,firstName=null,lastName=null,passport,street,state,ic,postcode,contact,editCustId,searchCustId,removeCustId,checkContact;
    	String checkPassport,checkIc;
    	int i = 0,selection = 0,choice,digitCount =0 ,letterCount = 0,option =0;
    	boolean validationName,validationAddress,validationCustDetails,validationContact = false,checkExistContact = false,checkExistPassport= false,checkExistIc = false;
    	char quitChoice = 'Q',continuePro = 'Q',addCust;
    	Scanner s = new Scanner (System.in);
			
			
			do{

				int w = 0;
				header();
				for(int l = 0;l<custArray.size();l++){

						System.out.printf("|" + "%s" + "%s\n" ,custArray.get(l).getCustId(), custArray.get(l).toString());
				}
				memheader();
	     		for(int l = 0;l<memArray.size();l++){

						System.out.printf("%s",memArray.get(l).toString());
				}
			do{
				System.out.printf("Please enter the customer id you wish to remove(C1001/M1001/Quit):");
				removeCustId = s.nextLine();
				for(int l = 0;l<custArray.size();l++){
					if(removeCustId.equalsIgnoreCase(custArray.get(l).getCustId()))
					{	custArray.remove(l);
						w =1;
					}
				}
				for(int l = 0;l<memArray.size();l++){
					if(removeCustId.equalsIgnoreCase(memArray.get(l).getMemberId()))
					{	memArray.remove(l);
						w =1;
					}
				}
				if(removeCustId.equalsIgnoreCase("quit"))
					break;
				else if(w == 0)
					System.out.printf("Id not found\n");
			}while(w == 0);
		if(removeCustId.equalsIgnoreCase("quit"))
		break;
	   	System.out.printf("Do you wish to continue or quit remove details(C=Continue/Q=Quit):");
	    quitChoice = s.next().charAt(0);
	    s.nextLine();
		}while(quitChoice == 'C' || quitChoice == 'c');
    }
    	
	public static int checkDigit(){
		Scanner s = new Scanner (System.in);
	while(true){
		try{
			return s.nextInt();
		}
		catch (InputMismatchException e){
			s.next();
			System.out.printf("Invalid entry! Please try again.\n");
		}
	}
}

	public static void memheader(){
		System.out.printf("==========================================================================================================================================================\n");
	    System.out.printf("|ID\t\t|Name\t\t\t\t\t|Identity Card\t|Passport No\t|Contact No\t\t|Address\t\t\t\t\t\t\t\t|Member Level Discount Rate Price|\n");
		System.out.printf("==========================================================================================================================================================\n");
}
		
	public static void header(){
		System.out.printf("=========================================================================================================================\n");
	    System.out.printf("|ID\t\t|Name\t\t\t\t\t|Identity Card\t|Passport No\t|Contact No\t\t|Address\t\t\t\t\t\t\t\t|\n");
		System.out.printf("=========================================================================================================================\n");
}
		
	
		
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
    
    