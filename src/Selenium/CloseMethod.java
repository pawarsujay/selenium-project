package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.close();
		
	}
}
