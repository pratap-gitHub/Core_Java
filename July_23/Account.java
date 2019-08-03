package July_23_Assignment;

public class Account 
{
		int account_no;
		float account_bal;
		float interest;
		
		int deposit;
		
		String holderName;

		
		public Account(String holderName, int deposit, int account_no)
		{
			this.holderName=holderName;
			this.deposit= deposit;
			this.account_no=account_no;
			
		}
		
		public Account(int account_no, float accountbal, float int_rate)
		{
			this.account_no=account_no;
			this.account_bal=accountbal;
			this.interest= int_rate;
			
		}
		
		
		public String get_account_details()
		{
			
			String str = "Account Number:\t"+ account_no+
			"\nAccount Balance:\t" + account_bal +
			"\nInterest Rate:\t" + interest;
			return str;
		}
		
		
		public void deposit(float amount )
		{
	   		account_bal += amount;
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
		
}
