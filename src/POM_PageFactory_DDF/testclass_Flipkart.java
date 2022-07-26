package POM_PageFactory_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testclass_Flipkart {

	
	public static void main(String args []) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		
		FileInputStream file = new FileInputStream ("C:\\Users\\Yogeshwar\\Desktop\\Parameterization\\demo.xlsx");
		
	     XSSFWorkbook book = new XSSFWorkbook(file);
	     
	     XSSFSheet sheet = book.getSheet("sheet2");
	     
	     String username= sheet.getRow(0).getCell(0).getStringCellValue();
	     String password = sheet.getRow(0).getCell(1).getStringCellValue();
	     
	     flipkart_login_page lp =new flipkart_login_page(driver);
	     lp.enteremail(username);
	     lp.enterpassword(password);
	     lp.loginclick();
	     
	     Thread.sleep(5000);
	     
	     flipkart_home_page hp = new flipkart_home_page(driver);
	     hp.validateusername();
	    		 
	    		 
	    	 
	    		 
	     
	   
	     
	}
}
