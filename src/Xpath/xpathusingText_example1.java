package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathusingText_example1 {

	public static void main(String args []) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Yogeshwar/Documents/HTML%20code%20by%20facebook.html");
		driver.findElement(By.xpath("//a[text()=\"Facebook\"]")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()=\"Google\"]")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()=\"Amazon\"]")).click();
		Thread.sleep(2000);
		
		driver.quit();
	

	}
}
