package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titlecase {

	public static void main(String args []) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		//testcase1: Verify that user is navigated to correct webpage

		if (title.equalsIgnoreCase("zomato"))
		{
			System.out.println("Test Case is Passed");
		}
		else
		{
			System.out.println("Test Case is Failed");
		}
		Thread.sleep(3000);
		driver.close();
	}
}
