/**
 * @(#)Member.java
 *
 *
 * @author
 * @version 1.00 2019/8/1
 */


public class Member extends Customers{
	private String memberId;
	private int  memberCount;
	private MemberType memberType;

	//constructors
    public Member() {
    }

    public Member(Name custName,String custIc,String passportNo,String contactNo,Address address,
			MemberType memberType){
	    super(custName, custIc, passportNo, contactNo, address);
	   	this.memberId = "M"+ Integer.toString(memberCount++);
	   	this.memberType = memberType;
    }

    //getters
    public String getMemberId(){
    	return memberId;
    }
    public MemberType getMemberType(){
    	return memberType;
    }


    //setters
    public void setMemberType(MemberType memberType){
    	this.memberType = memberType;
    }


	//toString
	public String toString(){
		return String.format("|%s" +
							 "|%s\n" +
							 "|%s|\n" ,
							 super.toString(),memberId,memberType);
	}

}