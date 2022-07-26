package Practice_Set;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();
		Thread.sleep(5000);
		
		WebElement e = driver.findElement(By.xpath("//div[text()=\"Home\"]"));

		Actions Act = new Actions(driver);
		Act.moveToElement(e).perform();
		Thread.sleep(3000);
				
		WebElement s = driver.findElement(By.xpath("//a[text()=\"Kitchen & Dining\"]"));
		
		Act.moveToElement(s).perform();
		
		WebElement g = driver.findElement(By.xpath("//a[text()=\"Gas Stoves & Accessories\"]"));
		Act.moveToElement(g).click().perform();
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"FABER Hob Nexus IND HT603 CRS BR CI AI Glass Automatic ...\"]")).click();
		
            String parentId = driver.getWindowHandle();
		
		Set<String> childId = driver.getWindowHandles();
		
		for(String m:childId)
		{
			System.out.println(m);
			if (!m.equals(parentId))
			{
				driver.switchTo().window(m);
				driver.findElement(By.xpath("//button[text()=\"ADD TO CART\"]")).click();
				driver.close();
			}
		
		
		
	}
}
}