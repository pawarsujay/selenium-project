package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()=\"Most Gifted\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()=\"Mobiles\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href=\"/b/?_encoding=UTF8&node=976392031&ref_=sv_top_elec_mega_2\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()=\"Memory cards\"]")).click();
		Thread.sleep(3000);
		driver.close();
		
	}
}
