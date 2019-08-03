package readWriteAvg2;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Student {

	
	public int sid;
	public String name;
	public double m1;
	public double m2;
	public double avg;
	
	/*Student(int sid, String name, double m1, double m2,double avg)
	{
		
		this.sid=sid;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.avg=0;
		
	}
	
	Student()
	{
		
	}
	*/
	
	public Student read_excel(XSSFRow row)
	{
		
		Student stud= new Student();
		
		stud.sid = (int)row.getCell(0).getNumericCellValue();
		stud.name=row.getCell(1).getStringCellValue();
		stud.m1=row.getCell(2).getNumericCellValue();
		stud.m2=row.getCell(3).getNumericCellValue();
		
		stud.avg= (stud.m1+stud.m2)/2;
		
		return stud;		
	}
	
	
	public void write_excel(XSSFRow row)
	{
		row.createCell(0).setCellValue(this.sid);

		//row.createCell(1).setCellValue(this.name);
		
		row.createCell(2).setCellValue(this.m1);
		row.createCell(3).setCellValue(this.m2);
		row.createCell(4).setCellValue(this.avg);
		
	}
	
	
		
}
