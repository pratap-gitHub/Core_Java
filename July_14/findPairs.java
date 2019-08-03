import java.util.*;

public class findPairs {

	public static void main(String[] args)
	{
		
		Scanner sc= new Scanner(System.in);
		
		int[] a= new int[10];
		
		for(int i=0;i<10;i++)
		{
			a[i]= sc.nextInt();
		}
		for(int i=0;i<9;i++)
		{
			
			for(int j=i+1;j<10;j++)
			{
				if(a[i]+a[j]==65)
				{
					System.out.println(a[i]+", "+a[j]);
				}
			}
		}
	}
}


