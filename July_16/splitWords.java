package LearningStrings;
import java.util.*;

public class splitWords {
	
	
	public static void main(String[] args)
	{
		
		Scanner sc= new Scanner(System.in);
		
		String s= sc.nextLine();
		
			//String s="I am learning Java";
		
		s=s+" ";
		
		String tmp="";
		
		for(int i=0;i<s.length(); i++)
		{
			//System.out.println(i+);
			
			tmp= tmp+ s.charAt(i);
			
			if(s.charAt(i+1)==' ')
			{
				System.out.println(tmp); i++;
				tmp="";
			}
			
		}
		
	}
}
