package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example6 {

	public static void main(String args[]) throws IOException
	{
		FileInputStream file = new FileInputStream ("C:\\Users\\Yogeshwar\\Desktop\\Parameterization\\demo.xlsx");
	
	     XSSFWorkbook book = new XSSFWorkbook (file);
	     
	     XSSFSheet s = book.getSheet("sheet1");
	     
	   //getCellType()-> get type of data present in particular cell
	     
	     
	    System.out.println(s.getRow(0).getCell(1).getCellType());
	    
	    System.out.println(s.getRow(1).getCell(1).getCellType());
	
	    System.out.println(s.getRow(2).getCell(1).getCellType());
	}
}
