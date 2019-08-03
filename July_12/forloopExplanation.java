//import java.util.*;


/*
 
 	1
	11
	111

 */
public class forloopExplanation {

	public static void main(String[] args)
	{
		//int sum=0;
		
		int s=1;
		int x=0;
		//System.out.print("1");
	
		while(s<=3)
		{
			System.out.print("1");
			x++;
			
			if(x==s){
				
				x=0;
				System.out.println();
				s++;
			}
		}
		
	}
}
