package Practice_Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_application {

	public static void main(String args []) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
	     driver.findElement(By.xpath("//div[@class=\"gb_yf\"]")).click();
	     
	     Thread.sleep(5000);
	     
	     driver.switchTo().frame("app");
	    driver.findElement(By.xpath("//span[text()=\"YouTube\"]")).click();
	     
	}
}
