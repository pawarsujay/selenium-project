package TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM_PageFactory_DDF.flipkart_home_page;
import POM_PageFactory_DDF.flipkart_login_page;

public class flipkart_testclass { 
	

	 
	
		WebDriver driver ; 
		@BeforeSuite
		public void browserconfigure()
		{
			Reporter.log("browser setting",true);
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		@BeforeTest
		public void browserwindowsetting()
		{
			Reporter.log("code for maximizing",true);
			driver.manage().window().maximize();
		}
		@BeforeClass
		public void openapplication()
		{
			Reporter.log("Opening an application",true);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.flipkart.com/");
		}
		@BeforeMethod
		public void login() throws IOException
		{
			Reporter.log("user login successfully",true);
		
		FileInputStream file= new FileInputStream("C:\\Users\\Yogeshwar\\Desktop\\Parameterization\\demo.xlsx");
		XSSFWorkbook book= new XSSFWorkbook(file);
		XSSFSheet sh=book.getSheet("Sheet2");
		
		String username=sh.getRow(0).getCell(0).getStringCellValue();
		String password=sh.getRow(0).getCell(1).getStringCellValue();
		
		flipkart_login_page lp =new flipkart_login_page(driver);
	     lp.enteremail(username);
	     lp.enterpassword(password);
	     lp.loginclick();
	     
		}

		@Test
		public void testcase1() throws InterruptedException
		{
			Reporter.log("Test case 1 executing for user verification",true);
			Thread.sleep(2000);
			
			flipkart_home_page hp = new flipkart_home_page(driver);
		     hp.validateusername();
		}

		@AfterMethod
		public void logout()
		{
			Reporter.log("user logout successfully",true);
		}
		
//		@Test
//		public void testcase2()
//		{
//			Reporter.log("Test case 2 executing for grosaries",true);
//		}
		
		@AfterClass
		public void closeapplication()
		{
			Reporter.log("closing application",true);
		}
		
		@AfterTest
		public void closingbrowser()
		{
			Reporter.log("Closing browser",true);
			driver.close();
		}
		
		@AfterSuite
		public void browserchange()
		{
			Reporter.log("browser changing",true);
		}

}
