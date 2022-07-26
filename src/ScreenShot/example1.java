package ScreenShot;

import java.io.File;
import java.io.IOException;import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class example1 {

	public static void main(String args []) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		
		
		//step1:
		TakesScreenshot screen = (TakesScreenshot) driver;
		
		// step 2 and 3
		File src = screen.getScreenshotAs(OutputType.FILE);
		
		//step4:
				File dest= new File("C:\\Users\\Yogeshwar\\Desktop\\selenium\\Screenshot\\firstscreenshot.jpg");

				//step5:
				FileHandler.copy(src, dest);
				

	}
}
