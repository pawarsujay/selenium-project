package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_Locator {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		Thread.sleep(4000);
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		Thread.sleep(3000);
		
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);

		driver.quit();
		
		
	}
}