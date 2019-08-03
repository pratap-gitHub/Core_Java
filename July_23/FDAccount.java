package July_23_Assignment;

public class FDAccount extends Account{
	
	
	float interest_rate;
	
	
	public FDAccount(String name, int deposit, int acno, float rate)
	{
		super(name, deposit, acno);
		
		this.deposit= deposit;
		this.account_bal=deposit;
		
		this.holderName=name;
		this.account_no=acno;
		
		interest_rate=rate;
				
	}
	
	public float getMaturity()
	{
		float multpr= 1+(interest_rate/100);
		
		return multpr*(this.deposit);
		
	}
}
