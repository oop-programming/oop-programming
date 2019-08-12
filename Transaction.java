/**
 * @(#)Transaction.java
 *
 *
 * @author 
 * @version 1.00 2019/8/2
 */


public class Transaction {
	private Customer customer;
	private Package pac;
	private Insurance insurance;
	private String transactionId;
	private char status;
	private static int counter = 0;
	
	public Transaction(){
		customer = new Customer();//constructor & argument
		pac = new Package();//constructor & argument
		insurance = new Insurance();//constructor & argument
		counter++;
		this.status = status;
	}
	
	public static void getCounter(){
		return Transaction.counter;
	}
	
	public void getTransactionId(){
		return this.transactionId;
	}
	
	public void getStatus(){
		return this.status;
	}
	
	public char status(char status){
		this.status = status;
	}
	
	public double calculateSst(){
		return this.calculatePayment() * 1.07;
	}
	
	public double calculatePayment(){//have menber and not menber
		return pac.getPrice() + (insurance.getInsuranceType() * 1000);
	}
	
//	public String toString(){
//		String.format("")
//	}
}