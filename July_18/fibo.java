
public class fibo {

	public static void main(String[] args)
	{
		int a=1, b=1;
		int x=a;
		
		System.out.print("1 1 ");
		
		for(; x<65; )
		{
			
			x= a+ b;
			a=b;
			
			b=x;
			
			System.out.print(x+" ");
		}
		
		
	}
}
