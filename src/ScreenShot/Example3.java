package ScreenShot;



import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;



public class Example3 {

	       static WebDriver driver;
	public static void main(String args[]) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		Screenshot("Application open");
		
		WebElement ele=driver.findElement(By.id("txtUsername"));
		Thread.sleep(2000);
		ele.sendKeys("Admin");
		
		WebElement pass =driver.findElement(By.id("txtPassword"));
		Thread.sleep(2000);
	    pass.sendKeys("admin123");
	    Thread.sleep(2000);
	    Screenshot("LoginDetail");
	    
	   WebElement login =  driver.findElement(By.id("btnLogin"));
	   Thread.sleep(2000);
	   login.click();
	   Thread.sleep(4000);
		Screenshot("log in");
	}
	     public static void Screenshot(String filename) throws IOException
	     {
	    	 TakesScreenshot screen =(TakesScreenshot) driver;
	    	File src= screen.getScreenshotAs(OutputType.FILE);
	    	 
			File dest=new File("C:\\Users\\Yogeshwar\\Desktop\\selenium\\Screenshot"+filename+".jpg");
	    	FileHandler.copy(src, dest);
	     }
	
	       
}
