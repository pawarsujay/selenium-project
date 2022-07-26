package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example7 {

	public static void main(String args[]) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Yogeshwar\\Desktop\\Parameterization\\demo.xlsx");
	
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		      XSSFSheet s = book.getSheet("sheet1");
	
	          CellType type = s.getRow(1).getCell(0).getCellType();
	          
	          System.out.println(type);
	
	          if (type==CellType.STRING)
	          {
	        	  String str = s.getRow(1).getCell(0).getStringCellValue();
	          }
	          else if (type==CellType.NUMERIC)
	          {
	        	  System.out.println(s.getRow(1).getCell(0).getNumericCellValue());
	          }
	          else 
	          {
	        	  boolean b=s.getRow(2).getCell(0).getBooleanCellValue();
	  			System.out.println(b);

	          }
	}
}
