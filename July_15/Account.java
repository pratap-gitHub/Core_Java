package Learning1;

public class Account 
{
		int account_no;
		float account_bal;
		float interest;

		public String get_account_details()
		{
			
			String str = "Account Number:\t"+ account_no+
			"\nAccount Balance:\t" + account_bal +
			"\nInterest Rate:\t" + interest;
			return str;
		}
		
		public float cal_interest(float amt)
		{
			return amt*interest/100; 
		}
		

}
