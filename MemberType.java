/**
 * @(#)MemberType.java
 *
 *
 * @author
 * @version 1.00 2019/8/12
 */


public class MemberType {
	private double discountRate;
	private String memberLevel;
	private int memberPrice;

    public MemberType(String memberLevel,double discountRate,int memberPrice) {
    	this.memberLevel = memberLevel;
    	this.discountRate = discountRate;
    	this.memberPrice = memberPrice;
    }
    public String toString()
    {
    	return String.format("%s\t%.1f\tRM%d",memberLevel, discountRate,memberPrice);
    }
}