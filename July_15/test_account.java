package Learning1;


public class test_account 
{
	public static void main(String[] args)
	{
		SBAccount acc1 = new SBAccount();
		acc1.account_no = 23456;
		acc1.account_bal = 15000;
		acc1.interest = 10;
		acc1.deposit(1000);
		System.out.println(acc1.get_account_details());
		acc1.withdraw(500);
		System.out.println(acc1.get_account_details());

	}
}


