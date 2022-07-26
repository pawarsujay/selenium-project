package Practice_Set;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A_Normal_Test_Class {

	
		
	@BeforeClass
	public void OpenBrowser()
	{
	Reporter.log("Open Browser", true);
	}
	@BeforeMethod
	public void loginToApp()
	{
	Reporter.log("Login App", true);
	}
	@Test
	public void T2VerifyUserId()
	{
	Reporter.log("Verify User ID 2", true);
	}
	@Test
	public void T1VerifyUserId()
	{
	Reporter.log("Verify User ID 1", true);
	}
	@AfterMethod
	public void logout()
	{
	Reporter.log("Click on Logout", true);
	}
	@AfterTest
	public void closeBrowser()
	{
	Reporter.log("Close Browser", true);
	}
	
	
}
