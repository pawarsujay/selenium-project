package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example2 {

	public static void main(String args[]) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Yogeshwar\\Desktop\\Parameterization\\demo.xlsx");
		
		// step4
		
		XSSFWorkbook book = new XSSFWorkbook (file);
		
		// step 5 
		XSSFSheet s =book.getSheet("sheet1");
		
		// step 6 7 8
		
		double value =s.getRow(4).getCell(1).getNumericCellValue();
		
		System.out.println(value);
	}
}
