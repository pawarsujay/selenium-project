package POM_DDF_TestNG_withmandatory_classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {

	//Utility class has the methods for fetching data from Excel, Screenshot
	
	//opened excel sheet to fetch data
	
	public static String FetchData(int rowIndex, int cellIndex) throws IOException 
	{
		
		FileInputStream file = new FileInputStream ("C:\\velocity\\eclipce-workspace\\Velocity_Sujay_Pawar\\Excelldata\\demo.xlsx");
		XSSFWorkbook book= new XSSFWorkbook(file);
		XSSFSheet sh=book.getSheet("Sheet2");
		String data=sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return data;

	}
	
	public static void screenShot(WebDriver driver,String filename) throws IOException
	{
		TakesScreenshot s=(TakesScreenshot)driver;
		File src=s.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\velocity\\eclipce-workspace\\Velocity_Sujay_Pawar\\Screenshot\\"+filename+".jpg");
		FileHandler.copy(src, des);
	}

}
