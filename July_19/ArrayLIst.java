package July;
import java.util.*;
import java.util.ArrayList;

public class ArrayLIst {

	public static void main(String[] args)
	{
		ArrayList<String> lst= new ArrayList<String>();
		
		lst.add("Aditya");
		
		lst.add("Arnav");
		
		lst.add("Swati");
		
		System.out.println(lst);
		
		
		for(String s: lst)
		{
			System.out.println(s+",");
		}
		
	}
}
