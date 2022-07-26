package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example3 {

	public static void main(String args[]) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Yogeshwar\\Desktop\\Parameterization\\demo.xlsx");
	  
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		    boolean  value = book.getSheet("sheet1").getRow(5).getCell(2).getBooleanCellValue();
		       
		       System.out.println(value);
		
		
	}
}
