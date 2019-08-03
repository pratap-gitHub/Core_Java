package readWriteAvg2;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import ImportExportLearn.$missing$;

public class driver {	
	
	public static void main(String[] args)
	{
		
		
		try{
			
			File f = new File("D:\\StudentData.xlsx");
			FileInputStream fs = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fs);
			XSSFSheet sh = wb.getSheetAt(0);
			ArrayList<Student> data= new ArrayList<Student>();
			
			for(int i=1; i<5 ;i++)
			{				
				XSSFRow row = sh.getRow(i);
				
				Student dumyStud= new Student();
				
				data.add(dumyStud.read_excel(row));
				
				
				
				dumyStud.write_excel(row);
												
			}
			
			
			for(Student x: data){
				
				System.out.println(x.sid+","+x.name+", "+x.avg);
			}
			
			


		}catch(Exception e){
			
			System.out.println("Some Error occured while opening the file");
			
		}

		
		
	
		
	}

}
