package Learning_FunctionOverloading;

public class TestBank {

	public static void main(String[] args)
	{
		
		citi c1= new citi();
		
		c1.get_roi();
		
		icici i1= new icici();
		
		System.out.println(c1.get_roi());
		System.out.println(i1.get_roi());
	}
}
