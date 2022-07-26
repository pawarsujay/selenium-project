package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathusingcontains_example2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@id,\"ma\")]")).sendKeys("abc");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@placeholder,\"word\")]")).sendKeys("gfh");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@name,\"in\")]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),\"pass\")]")).click();
		Thread.sleep(2000);
		
		driver.close();


}
}
