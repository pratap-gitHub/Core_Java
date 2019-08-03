package Learning_Inheritance;

public class consultant extends Employee {
	
	int totHrsWrkd;
	
	public int calMonthlySalary()
	{
		return totHrsWrkd*rpu;		
	}
	
	
	consultant(int totHrsWrkd,int empId, String empName, int rpu)
	{
		super(empId, empName, rpu);
		this.totHrsWrkd= totHrsWrkd;		
	}

}
