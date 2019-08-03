package July_23_Assignment;


public class SBAccount extends Account 
{

	static float interest_rate;
	
	

	public SBAccount(String name, int deposit, int acno, float rate)
	{
		super(name, deposit, acno);
		
		this.account_bal=this.deposit;
		this.deposit= deposit;
		this.holderName=name;
		this.account_no=acno;
		
		interest_rate=rate;
				
	}
	
	public void deposit(int amount )
	{
		
		this.account_bal += amount;
	}
	
	
	public boolean withdraw(float withdraw_amt)
	{
			
		if(account_bal - withdraw_amt >=500)
		{
			account_bal -= withdraw_amt;
			return true;
		}
		
		return false;
	}
	
	
	
	
	public float getMaturity()
	{
		float multpr= 1+(interest_rate/100);
		
		return multpr*(this.deposit);		
	}
}
