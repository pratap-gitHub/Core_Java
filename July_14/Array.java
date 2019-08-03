import java.util.*;
public class Array {

  public static void main(String[] args)
  {
		
	
	
	int[] m= new int[5];
	
	int sm=0, avg=0;
	
	for(int i=0;i<=4;i++)
	{
		
		sm= sm+m[i];
		
	}
	
	avg= sm/5;
	
	for(int i=0;i<=4;i++){
		
		if(m[i]>=avg)
		{
			System.out.println(m[i]);
			
		}
	}
	
  }
}
