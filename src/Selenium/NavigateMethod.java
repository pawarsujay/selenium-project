package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.simplilearn.com/tutorials/selenium-tutorial/selenium-interview-questions-and-answers");
		driver.get("https://www.google.com/");
		driver.get("https://www.zomato.com/");
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.quit();
	}
}
