/**
 * @(#)StockMain.java
 *
 *
 * @author
 * @version 1.00 2019/8/9
 */


public class StockMain {

    public StockMain() {
    }
    //String country, String place, int dateDepart, int dateReturn, int dateConfirm, char insuranceType
    //String country,String place,int dateDepart,int dateReturn,int dateConfirm,String description,String staffName,int price,int maxSeat
    public static void main(String[] args){
    	Product[] productArr =
    	{
    		new Insurance("China", "Beijing",12/12/2019, 18/12/2019, 25/11/2019, 'P')
    	};

    	productArr[0].toString();
    }


}