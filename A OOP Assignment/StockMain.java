/**
 * @(#)StockMain.java
 *
 *
 * @author
 * @version 1.00 2019/8/9
 */
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.lang.Exception;

public class StockMain {

    public StockMain() {
    }


    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
    	ArrayList<Insurance> insuranceArr = new ArrayList<Insurance>();
    	ArrayList<Package> packageArr = new ArrayList<Package>();

    	//initialize
    	ArrayList<Product> productArr = new ArrayList<Product>();
    	insuranceArr.add(new Insurance("China", "Beijing", "12-12-2019", 'P'));
    	insuranceArr.add(new Insurance("China", "Beijing", "12/12/2019", 'S'));
    	insuranceArr.add(new Insurance("UK", "London", "16/11/2019", 'S'));
    	insuranceArr.add(new Insurance("UK", "London", "16/11/2019", 'P'));
    	insuranceArr.add(new Insurance("Japan", "Hokaido", "12/10/2019", 'P'));
    	insuranceArr.add(new Insurance("Japan", "Hokaido", "12/10/2019", 'S'));
    	packageArr.add(new Package("UK","London", "10/10/2019", "", "Steven Chuah", 4599, 30));
    	packageArr.add(new Package("Tokyo","Hokaido", "28/8/2019", "", "Steven Chuah", 3999, 25));
    	packageArr.add(new Package("China","Beijing", "16/9/2019", "", "Tan Long Long", 2999, 20));
    	packageArr.add(new Package("UK","London", "10/10/2019", "", "Daivd Leong", 4599, 35));
    	packageArr.add(new Package("Malaysia","Kuala Lumpur", "30/8/2019", "", "Steven Chuah", 599, 40));


    	//add package function
	    	/*double price=0;
	    	int maxSeat=0;
	    	System.out.print("Enter the country name: ");
	    	String country = s.nextLine();

	    	System.out.print("Enter name of the place: ");
	    	String place = s.nextLine();
	    	System.out.print("Enter departure date(dd-MM-yyyy): ");
	    	String dateDepart = s.nextLine();
	    	System.out.print("Description of the package: ");
	    	String description= s.nextLine();
	    	System.out.print("Enter tour guide name: ");
	    	String staffName = s.nextLine();

	    	do{
	    		try{
	    			System.out.print("Enter price: ");
	    			price = s.nextInt();
	    		}
	    		catch(Exception e){
	    			s.nextLine();
	    			System.out.print("Invalid data type. Reenter an integer: ");
	    			price = -1;
	    			continue;
	    		}
	    		if(price < 0 )
	    		{
	    			s.nextLine();
	    			System.out.print("Invalid price. Reenter the price: ");
	    		}
	    	}while(price<0);
			s.nextLine();
	    	System.out.print("Enter the maximum seat of the package: ");
	    	maxSeat = s.nextInt();


	    	productArr.add(new Package(country,place,dateDepart,description,staffName,price,maxSeat));

	    	for(int i=0; i<productArr.size(); i++)
	    	{
	    		System.out.printf("%s", productArr.get(i).toString());
	    	}*/



	    //add function insurance
		   	/*System.out.print("Enter the country name: ");
		   	String country = s.nextLine();
		    System.out.print("Enter the place: ");
		    String place = s.nextLine();
		    System.out.print("Enter the departure date: ");
		    String dateDepart = s.nextLine();
		    System.out.print("Type of the insurance( S=standard, P=premier): ");
		    char insuranceType = s.next().charAt((0));
		    s.nextLine();

		    productArr.add(new Insurance(country, place,dateDepart, insuranceType));
		    for(int i=0; i<productArr.size(); i++)
		    {
		    	if(productArr.get(i) instanceof Insurance){
		    		System.out.printf("%s", productArr.get(i).toString());
		    	}*/

		//

		//modify
		/*System.out.println("Which object you want to modify?");
		System.out.println("1. Insurance");
		System.out.println("2. Package");
		System.out.print("Enter your choice(1 or 2): ");
		int choice = s.nextInt();
		s.nextLine();

		if(choice == 1)
		{
			for(int i=0; i< insuranceArr.size();i++){
				System.out.printf("%s", insuranceArr.get(i).toString());
			}

			System.out.print("Enter the product id you want to modify: ");
			String prodID = s.nextLine();

			for(int j=0; j<productArr.size();j++)
			{
				if (prodID.equalsIgnoreCase(insuranceArr.get(j).getProductID()))
				{
					System.out.println("Which one you want to modify?");
					System.out.println("1. Country");
					System.out.println("2. Place");
					System.out.println("3. Date Depart");
					System.out.println("4. Insurance Type");
					System.out.print("Enter the variable you want to modify[1-4]: ");
					int variableChoose = s.nextInt();
					s.nextLine();

					if(variableChoose == 1){
						System.out.print("Enter the country name you want to modify: ");
						String country = s.nextLine();
						insuranceArr.get(j).setCountry(country);
					}

					else if(variableChoose == 2){
						System.out.print("Enter the place name you want to modify: ");
						String place = s.nextLine();
						insuranceArr.get(j).setPlace(place);
					}
					else if(variableChoose == 3){
						System.out.print("Enter the departure date that want to modify: ");
						String dateDepart = s.nextLine();
						insuranceArr.get(j).setDateDepart(dateDepart);
					}
					else if(variableChoose == 4){
						System.out.print("Enter the insurance type that want to modify: ");
						char insuranceType = s.next().charAt((0));
						s.nextLine();
						insuranceArr.get(j).setInsuranceType(insuranceType);
					}

					System.out.println("\nSucessfully edited\n=====================");
					System.out.printf("%s", insuranceArr.get(j).toString());
				}
			}
		}
		else
		{
			for(int i=0; i< packageArr.size();i++){
				System.out.printf("%s", packageArr.get(i).toString());
			}

			System.out.print("Enter the product id you want to modify: ");
			String prodID = s.nextLine();

			for(int j=0; j<packageArr.size();j++)
			{
				if (prodID.equalsIgnoreCase(packageArr.get(j).getProductID()))
				{
					System.out.println("Which one you want to modify?");
					System.out.println("1. Country");
					System.out.println("2. Place");
					System.out.println("3. Date Depart");
					System.out.println("4. Description");
					System.out.println("5. StaffName");
					System.out.println("6. Price");
					System.out.println("7. Max Seat");
					System.out.print("Enter the variable you want to modify[1-7]: ");
					int variableChoose = s.nextInt();
					s.nextLine();

					if(variableChoose == 1){
						System.out.print("Enter the country name you want to modify: ");
						String country = s.nextLine();
						packageArr.get(j).setCountry(country);
					}

					else if(variableChoose == 2){
						System.out.print("Enter the place name you want to modify: ");
						String place = s.nextLine();
						packageArr.get(j).setPlace(place);
					}
					else if(variableChoose == 3){
						System.out.print("Enter the departure date that want to modify: ");
						String dateDepart = s.nextLine();
						packageArr.get(j).setDateDepart(dateDepart);
					}
					else if(variableChoose == 4){
						System.out.print("Enter the description that want to modify: ");
						String description = s.nextLine();
						packageArr.get(j).setDescription(description);
					}
					else if(variableChoose == 5){
						System.out.print("Enter the staff name that want to modify: ");
						String staffName = s.nextLine();
						packageArr.get(j).setStaffName(staffName);
					}
					else if(variableChoose == 6){
						System.out.print("Enter the price that want to modify: ");
						double price = s.nextDouble();
						packageArr.get(j).setPrice(price);
					}
					else if(variableChoose == 7){
						System.out.print("Enter the maximum seat that want to modify: ");
						int maxSeat = s.nextInt();
						packageArr.get(j).setMaxSeat(maxSeat);
					}

					System.out.println("\nSucessfully edited\n=====================");
					System.out.printf("%s", packageArr.get(j).toString());

				}
			}
		}
*/

    }

	 public static void searchProduct(ArrayList<Product> productArr){
	 	Scanner s = new Scanner(System.in);
			System.out.print("Enter the name of place you want to search: ");
			String keyword= s.nextLine();
			int found=0;

			for(int j=0; j<productArr.size(); j++){
				if(productArr.get(j) instanceof Package)
				{
					if(productArr.get(j).getPlace().contains(keyword)){
						System.out.printf("%s", productArr.get(j).toString());
						found++;
					}
				}
			}
			if(found == 0)
				System.out.println("No records found.\n");
			else
				System.out.printf("\n%d package is found\n",found);
	 }


}
