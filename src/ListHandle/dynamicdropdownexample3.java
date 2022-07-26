package ListHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdropdownexample3 {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.spicejet.com/");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//div[text()=\"Currency\"]")).click();
		  driver.findElement(By.xpath("//div[text()=\"EUR\"]")).click();
		  
		  
	}
}
