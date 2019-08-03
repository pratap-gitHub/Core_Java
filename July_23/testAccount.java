package July_23_Assignment;

public class testAccount {

	
	public static void main(String[] args)
	{
		
		SBAccount Ram= new SBAccount("Ram",25000,123,4);
		
		
		
		FDAccount Shyam= new FDAccount("Shyam", 3600,342,6);
		
		System.out.println("The maturity amount of Ram is "+Ram.getMaturity());
		
		System.out.println("The maturity amount for shyam is "+Shyam.getMaturity());
		
		
		
	}
}
