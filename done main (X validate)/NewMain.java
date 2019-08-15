/**
 * @(#)NewMain.java
 *
 *
 * @author
 * @version 1.00 2019/8/15
 */
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.lang.Exception;

public class NewMain {

    public NewMain() {
    }

    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
    	ArrayList<Insurance> insuranceArr = new ArrayList<Insurance>();
    	ArrayList<Package> packageArr = new ArrayList<Package>();

    	//initialize
    	ArrayList<Product> productArr = new ArrayList<Product>();
    	productArr.add(new Insurance("China", "Beijing", "12-12-2019", 'P'));
    	productArr.add(new Insurance("China", "Beijing", "12/12/2019", 'S'));
    	productArr.add(new Insurance("UK", "London", "16/11/2019", 'S'));
    	productArr.add(new Insurance("UK", "London", "16/11/2019", 'P'));
    	productArr.add(new Insurance("Japan", "Hokaido", "12/10/2019", 'P'));
    	productArr.add(new Insurance("Japan", "Hokaido", "12/10/2019", 'S'));
    	productArr.add(new Package("UK","London", "10/10/2019", "Steven Chuah", 12, 4599, 30));
    	productArr.add(new Package("Tokyo","Hokaido", "28/8/2019", "Steven Chuah", 10, 3999, 25));
    	productArr.add(new Package("China","Beijing", "16/9/2019", "Tan Long Long", 9, 2999, 20));
    	productArr.add(new Package("UK","London", "10/12/2019", "Daivd Leong", 12, 4599, 35));
    	productArr.add(new Package("Malaysia","Kuala Lumpur", "30/8/2019", "Steven Chuah", 4, 599, 40));

    	int action;
    	do{
    		System.out.println("Which function you want to choice?");
    		System.out.println("1. add");
    		System.out.println("2. search");
    		System.out.println("3. modify");
    		System.out.println("4. report");
    		System.out.print("Enter your action: ");
    		action = s.nextInt();

    		if(action == 1)
    			addProduct(productArr);
    		else if(action ==2)
    			searchProduct(productArr);
    		else if(action == 3)
    			modifyProduct(productArr);
    		else
    			;
    	}while(action != 1 && action != 4);





    }//end void main


    public static void addProduct(ArrayList<Product> productArr){
	 	Scanner s = new Scanner(System.in);
	 	int choice;
    	System.out.println("Add which type of product?");
	 	System.out.println("1. package");
	   	System.out.println("2. insurance");
	   	System.out.print("Enter your choice: ");
	   	choice = s.nextInt();
	   	s.nextLine();
	   	String country, place, dateDepart;

	   	if(choice == 1){
	   	//add package function
	   	   double price=0;
		   int maxSeat=0, tripDuration;
		   System.out.print("Enter the country name: ");
		   country = s.nextLine();
		   System.out.print("Enter name of the place: ");
		   place = s.nextLine();
		   System.out.print("Enter departure date(dd-MM-yyyy): ");
		   dateDepart = s.nextLine();
		   System.out.print("Enter tour guide name: ");
		   System.out.print("Trip duration of the package: ");
		   tripDuration = s.nextInt();
		   s.nextLine();
		   String staffName = s.nextLine();
		   System.out.print("Enter price: ");
		   price = s.nextInt();
		   s.nextLine();
		   System.out.print("Enter the maximum seat of the package: ");
		   maxSeat = s.nextInt();

		   productArr.add(new Package(country,place,dateDepart,staffName,tripDuration,price,maxSeat));

		   System.out.printf("Successfully added\n===================\n");
		   for(int i=0; i<productArr.size(); i++)
		   {
		   	if(productArr.get(i) instanceof Package){
		   	System.out.printf("%s", productArr.get(i).toString());
		   	}
		   }
		}

		else{
			//add function insurance
			System.out.print("Enter the country name: ");
			country = s.nextLine();
			System.out.print("Enter the place: ");
			place = s.nextLine();
			System.out.print("Enter the departure date: ");
			dateDepart = s.nextLine();
			System.out.print("Type of the insurance( S=standard, P=premier): ");
			char insuranceType = s.next().charAt((0));
			s.nextLine();

			productArr.add(new Insurance(country, place,dateDepart, insuranceType));

			System.out.printf("Successfully added\n===================\n");
		    for(int i=0; i<productArr.size(); i++)
			{
				if(productArr.get(i) instanceof Insurance)
				System.out.printf("%s", productArr.get(i).toString());
		   	}

	 	}

	 }//end add()


	 public static void searchProduct(ArrayList<Product> productArr){
	 	Scanner s = new Scanner(System.in);
			System.out.print("Enter the name of place you want to search: ");
			String keyword= s.nextLine();
			int found=0;


			for(int j=0; j<productArr.size(); j++)
			{
				if(productArr.get(j) instanceof Package)
				{
					if(productArr.get(j).getPlace().equalsIgnoreCase(keyword)){
						System.out.printf("%s", productArr.get(j).toString());
						found++;
					}
				}

			}
			if(found == 0)
				System.out.println("No records found.\n");
			else
				System.out.printf("%d package is found\n\n",found);
	}//end search()

	public static void modifyProduct(ArrayList<Product> productArr){
		Scanner s = new Scanner(System.in);
		int choice, index=0;
		System.out.println("Which one you want to modify?");
		System.out.println("1. Package");
		System.out.println("2. Insurance");
		System.out.print("Enter your choice: ");
		choice= s.nextInt();

		//modify Package
		if(choice == 1){

			for(int p=0;p< productArr.size(); p++)
			{
				if(productArr.get(p) instanceof Package){
					System.out.printf("%d\t%s", p,productArr.get(p).toString());
				}

			}
			System.out.print("Enter the index number of you want to edit: ");
			index=s.nextInt();

			System.out.println("Which one you want to modify?");
			System.out.println("1. Country");
			System.out.println("2. Place");
			System.out.println("3. Date Depart");
			System.out.println("4. Trip duration");
			System.out.println("5. Tour guide name");
			System.out.println("6. Price");
			System.out.println("7. Max Seat");
			System.out.print("Enter the variable you want to modify[1-7]: ");
			int variableChoose = s.nextInt();
			s.nextLine();
			Package p=(Package)productArr.get(index);

			if(variableChoose == 1){
				System.out.print("Enter the country name you want to modify: ");
				String country = s.nextLine();
				p.setCountry(country);
			}
			else if(variableChoose == 2){
				System.out.print("Enter the place name you want to modify: ");
				String place = s.nextLine();
				p.setPlace(place);
			}
			else if(variableChoose == 3){
				System.out.print("Enter the departure date that want to modify: ");
				String dateDepart = s.nextLine();
				p.setDateDepart(dateDepart);
			}
			else if(variableChoose == 4){
				System.out.print("Enter the trip duration that want to modify: ");
				int tripDuration = s.nextInt();
				p.setTripDuration(tripDuration);
			}
			else if(variableChoose == 5){
				System.out.print("Enter the staff name that want to modify: ");
				String staffName = s.nextLine();
				p.setStaffName(staffName);
			}
			else if(variableChoose == 6){
				System.out.print("Enter the price that want to modify: ");
				double price = s.nextDouble();
				p.setPrice(price);
			}
			else if(variableChoose == 7){
				System.out.print("Enter the maximum seat that want to modify: ");
				int maxSeat = s.nextInt();
				p.setMaxSeat(maxSeat);
			}

			System.out.println("\nSucessfully edited\n=====================");
			System.out.printf("%s", productArr.get(index).toString());

		}
		//modify Insurance
		else{
			for(int p=0;p< productArr.size(); p++)
			{
				if(productArr.get(p) instanceof Insurance)
					System.out.printf("%d\t%s", p,productArr.get(p).toString());
			}
			System.out.print("Enter the index number of you want to edit: ");
			index=s.nextInt();
			s.nextLine();
			System.out.println("Which one you want to modify?");
			System.out.println("1. Country");
			System.out.println("2. Place");
			System.out.println("3. Date Depart");
			System.out.println("4. Insurance Type");
			System.out.print("Enter the variable you want to modify[1-4]: ");
			int variableChoose = s.nextInt();
			s.nextLine();
			Insurance insurance= (Insurance)(productArr.get(index));

			if(variableChoose == 1){
				System.out.print("Enter the country name you want to modify: ");
				String country = s.nextLine();
				productArr.get(index).setCountry(country);
			}

			else if(variableChoose == 2){
				System.out.print("Enter the place name you want to modify: ");
				String place = s.nextLine();
				productArr.get(index).setPlace(place);
			}
			else if(variableChoose == 3){
				System.out.print("Enter the departure date that want to modify: ");
				String dateDepart = s.nextLine();
				productArr.get(index).setDateDepart(dateDepart);
			}
			else if(variableChoose == 4){
				System.out.print("Enter the insurance type that want to modify: ");
				char insuranceType = s.next().charAt((0));
				s.nextLine();
				insurance.setInsuranceType(insuranceType);
			}

			System.out.println("\nSucessfully edited\n=====================");
			System.out.printf("%s", productArr.get(index).toString());
		}
	}//end of modify()


}