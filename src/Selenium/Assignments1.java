package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments1 {

	public static void main(String args []) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.get("https://www.google.com/");
		   String title=driver.getTitle();
			System.out.println(title);
			//testcase1: Verify that user is open to correct webpage
			if(title.equalsIgnoreCase("Google"))
			{
				System.out.println("Test case is passed");
			}
			else
			{
				System.out.println("Test case is failed");
			}
			Thread.sleep(2000);
			
			Dimension d = new Dimension (700,700);
			driver.manage().window().setSize(d);
			System.out.println(d);
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			driver.manage().window().minimize();
			
			driver.close();

	}
}
