package Learning1;

public class SBAccount extends Account 
{

	public boolean withdraw(float withdraw_amt)
	{
			
		if(account_bal - withdraw_amt >=500)
		{
			account_bal -= withdraw_amt;
			return true;
		}
		
		return false;
	}
	
	public void deposit(float withdraw_amt)
	{
		
		account_bal += withdraw_amt;
	}
}
