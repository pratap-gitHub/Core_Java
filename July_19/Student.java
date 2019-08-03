package July;

public class Student {

	public int id;
	public String sname;
	public int phy;
	public int maths;
	
	public float avg;
	
	
	public float avg()
	{
		return (phy+maths)/2f;
		
	}
	
	public Student(int id, String name, int phy, int maths)
	{
		
		this.id=id;
		this.sname=name;
		this.phy=phy;
		this.maths=maths;		
	}
	
	
	
}
