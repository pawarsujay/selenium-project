package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example5 {

	public static void main (String args[]) throws IOException
	{
		FileInputStream file = new FileInputStream ("C:\\Users\\Yogeshwar\\Desktop\\Parameterization\\demo.xlsx");
	
		XSSFWorkbook book = new XSSFWorkbook (file);
		
		
	    XSSFSheet s = book.getSheet("sheet1");
	    
	    int rowsize = book.getSheet("sheet1").getLastRowNum()+1;
	       System.out.println(rowsize);
	       
	       int colsize = book.getSheet("sheet1").getRow(0).getLastCellNum();
	       System.out.println(colsize);
	       
	       for(int i=1;i<rowsize;i++)
	       {
	    	   for (int j=1;j<colsize;j++)
	    	   {
	    		   String str = s.getRow(i).getCell(j).getStringCellValue();
	    		   System.out.println(str+" ");
	    	   }
	       }
	    
	    
	}
}
