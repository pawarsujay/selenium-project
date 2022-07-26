package Practice_Set;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Colour {

	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
//	WebElement un=driver.findElement(By.xpath("//img[@alt=\"Flipkart\"]"));
//	System.out.println(un.getCssValue("color"));
	
	
		
		WebElement un = driver.findElement(By.xpath("//a[text()=\"Login\"]"));
		String s = un.getCssValue("font-size");
		System.out.println(s);
		driver.close();
	
	
	
	
	
	
	
	
	
	
	
	}
}
