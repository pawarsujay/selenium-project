package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_Another_one {
          
	public static void main(String args[]) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		         WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();
		
		TakesScreenshot screen = (TakesScreenshot) driver;
		
		File src =screen.getScreenshotAs(OutputType.FILE);
		
		File dest =new File("C:\\Users\\Yogeshwar\\Desktop\\selenium\\Screenshot\\secondscreenshot.png");
		
		FileHandler.copy(src, dest);
		Thread.sleep(2000);
		driver.close();
	}
}
