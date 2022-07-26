package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example4 {

	//get no. of rows present in excel and get no. of columns present in excel
	
	public static void main(String args[]) throws IOException
	{
		// step 3
		
		FileInputStream file = new FileInputStream ("C:\\Users\\Yogeshwar\\Desktop\\Parameterization\\demo.xlsx");
	
	     // step 4
		
		XSSFWorkbook book = new XSSFWorkbook (file);
		
		//getLastRowNum()-> index of last row in sheet 
				//for no. of rows-> getLastRowNum()+1

		int rowsize=book.getSheet("Sheet1").getLastRowNum()+1;
		     System.out.println(rowsize);
		     
		     int colsize = book.getSheet("sheet1").getRow(0).getLastCellNum();
		     System.out.println(colsize);
	}
}
