package POM_DDF_TestNG_withmandatory_classes;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart_testclass extends BaseClass
{

	Flipkart_home_page hpage;
	Flipkart_login_page lpage;
	Flipkart_Log_out logpage;
	XSSFSheet sh;
	String TestcaseId;
	@BeforeClass
	public void openapp() throws IOException
	{
		configurebrowser();
		
		//created and initialized objects of POM classes
		hpage=new Flipkart_home_page(driver);
		lpage=new Flipkart_login_page(driver);
		logpage = new Flipkart_Log_out(driver) ;
	}
	@BeforeMethod
	public void loginapp() throws IOException
	{
		lpage.entermail(UtilityClass.FetchData(0, 0));
		
		String password=UtilityClass.FetchData(0, 1);
		lpage.password(password);
		
		lpage.loginclick();
		
		UtilityClass.screenShot(driver, "login");
	}
	@Test
	public void verifyUser() throws InterruptedException, IOException
	{
		TestcaseId="1";
		String actualResult=hpage.validateUsername();
		
		// String expected=UtilityClass.FetchData(0, 2);
		
		String expectedResult="Pooja1";
		Assert.assertEquals(actualResult,expectedResult,"Failed: both values are not same");
		
	//	UtilityClass.screenShot(driver, "userVerified");
	}
	@AfterMethod
	public void logoutapp(ITestResult result) throws InterruptedException, IOException
	{
		// teardown ()
		// pass: success fail:failure  status
		if(result.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.screenShot(driver,result.getName() );
		}
		
		logpage.verifyname(driver);
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
