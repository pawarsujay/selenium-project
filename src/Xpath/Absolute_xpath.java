package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_xpath {

	public static void main(String args []) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
	     
		    WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://opensource-demo.orangehrmlive.com/");
		   Thread.sleep(3000);
		   
		   driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input")).sendKeys("Admin");
		        Thread.sleep(3000);
		  
		        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[3]/input")).sendKeys("admin123");
		        Thread.sleep(3000);
		        
		    	driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input")).click();
		    	
	}
}
