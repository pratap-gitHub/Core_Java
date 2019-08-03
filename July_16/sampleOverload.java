package Learning_FunctionOverloading;

public class sampleOverload {
	
	public static int add(int x, int y)
	{
		int z;
		z=x+y;
		return z;
	}
	
	public static int add(int x,int y,int z)
	{
		
		int m=x+y+z;
		return m;
	}
	
	
	public static double add(double a, double b)
	{
		return (a+b);
	}
	public static void main(String args[])
	{
		
		int x=2,y=3,z=10;
		System.out.println(add(x,y,z));		
		
		System.out.println(add(3,4));
		
	}
	
	
	

}
