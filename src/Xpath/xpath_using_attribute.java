package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_using_attribute {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		
		// enter username
		driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys("Admin");
		
		//enter password
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin123");
	
		//click on login button
		driver.findElement(By.xpath("//input[@value=\"LOGIN\"]")).click();

	}
}
