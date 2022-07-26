package POM_DDF_TESTNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.*;



public class Flipkart_TestClass {


	WebDriver driver;
	Flipkart_homepage hpage;
	Flipkart_login_page lpage;
	Flipkart_logout_page logpage;
	XSSFSheet sh;
	@BeforeClass
	public void openapp() throws IOException
	{
		//configure browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//open application in browser
		driver.get("https://www.flipkart.com/");
		
		//created and initialized objects of POM classes
		hpage=new Flipkart_homepage(driver);
		lpage=new Flipkart_login_page(driver);
		
		//opened excel sheet to fetch data
		FileInputStream file= new FileInputStream("C:\\Users\\Yogeshwar\\Desktop\\Parameterization\\demo.xlsx");
		XSSFWorkbook book= new XSSFWorkbook(file);
		sh=book.getSheet("Sheet2");
	}
	@BeforeMethod
	public void loginapp()
	{
	
	lpage.enterEmail(sh.getRow(0).getCell(0).getStringCellValue());
		
		String password=sh.getRow(0).getCell(1).getStringCellValue();
		lpage.enterPassword(password);
		
		lpage.loginclick();
	}
	@Test
	public void verifyUser() throws InterruptedException
	{
		String actualResult=hpage.validateUsername();
		
		//String expected=sh.getRow(0).getCell(2).getStringCellValue();
		
		String expectedResult="Pooja";
		Assert.assertEquals(actualResult,expectedResult,"Failed: both values are not same");
	}
	@AfterMethod
	public void logoutapp() throws InterruptedException
	{
		logpage=new Flipkart_logout_page(driver);	
		Thread.sleep(2000);
		logpage.logout();
		System.out.println("logout from application");
	}
	@AfterClass
	public void closeapp()
	{
		 driver.quit();
		
		lpage=null;
		hpage=null;
		driver=null;
		sh=null;
	}

}
