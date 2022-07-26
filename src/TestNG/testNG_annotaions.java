package TestNG;

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

public class testNG_annotaions {

	@BeforeSuite
	  public void browserconfigure()
	  {
		Reporter.log("browser Setting", true);
	  }
	@BeforeTest
	  public void browserwindowsetting()
	  {
		Reporter.log("code for maximizing", true);
	  }
	@BeforeClass
	  public void applicationopen()
	  {
		Reporter.log("Opening an application", true);
	  }
	@BeforeMethod
	   public void login()
	   {
		Reporter.log("user log in sucessfully", true);
	   }
	@Test
	   public void testcase1()
	   {
		Reporter.log("test case1 execution for validating username", true);
		
	   }
	@AfterMethod
	  public void logout()
	  {
		Reporter.log("user logout sucessfully", true);
	  }
	@Test
	public void testcase2()
	{
		Reporter.log("Test case 2 executing for grosaries",true);
	}
	
	@AfterClass
	public void closeapplication()
	{
		Reporter.log("closing application",true);
	}
	
	@AfterTest
	public void closingbrowser()
	{
		Reporter.log("Closing browser",true);
	}
	
	@AfterSuite
	public void browserchange()
	{
		Reporter.log("browser changing",true);
	}

}
