package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.therealoptics.com/");
	}
}
