package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Locator_Facebook {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("email")).sendKeys("sjpawar35@gmail.com");
		Thread.sleep(4000);
		
		driver.findElement(By.name("pass")).sendKeys("ashwini");
		Thread.sleep(2000);
		
         driver.findElement(By.name("login")).click();
         Thread.sleep(2000);
         driver.close();
	}
}
