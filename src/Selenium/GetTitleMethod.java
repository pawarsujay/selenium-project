package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class GetTitleMethod {

	public static void main(String args []) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		//testcase1: Verify that user is navigated to correct webpage
		if(title.equalsIgnoreCase("Google"))
		{
			System.out.println("Test Case is Passed");
		}
		else
		{
			System.out.println("Test Case is Failed");
		}
		Thread.sleep(3000);
          driver.close();	}
}
