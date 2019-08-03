package July;
import java.util.ArrayList;
import java.util.*;
public class Driver {
	
	public static void main(String[] args)
	{
		
		ArrayList<Student> sem = new ArrayList<Student>();
		
		Student Shashank= new Student(1234,"Shashank", 12,49);
		Student Tahir= new Student(2345, "Tahir", 23,43);
		
		Student OdishaBro= new Student(4342, "OdishaBro", 43,49);
		
		
		//sem.add(Student(12,"Sashank", 24,49));
		
		sem.add(Shashank);
		sem.add(Tahir);
		sem.add(OdishaBro);
		
		
		for(Student x: sem){
			
			System.out.println(x.sname+"\n"+x.avg());
		}
	}

}
