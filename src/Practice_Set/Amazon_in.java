package Practice_Set;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_in {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()=\" Electronics \"]")).click();
		
		WebElement e = driver.findElement(By.xpath("//a[@href=\"/b/?_encoding=UTF8&node=1389375031&ref_=sv_top_elec_mega_3\"]"));
		
		Actions Act = new Actions (driver);
		
		Act.moveToElement(e).perform();
		Thread.sleep(2000);
		
		WebElement show = driver.findElement(By.xpath("(//a[text()=\"Panasonic\"])[1]"));
		Act.moveToElement(show).click().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=\"Panasonic 165 cm (65 Inches) 4K Ultra HD Smart Android LED TV TH-65JX750DX (Black) (2021 Model)\"]")).click();
		
		String parentId = driver.getWindowHandle();
		
		Set<String> childId = driver.getWindowHandles();
		
		for(String s:childId)
		{
			System.out.println(s);
			if (!s.equals(parentId))
			{
				driver.switchTo().window(s);
				driver.findElement(By.xpath("//a[text()=\" Add to Wish List \"]")).click();
				driver.close();
			}
		}
		driver.switchTo().window(parentId);
		 driver.findElement(By.xpath("//a[@href=\"/b/?_encoding=UTF8&node=1388977031&ref_=sv_top_elec_mega_5\"]")).click();
		
		driver.findElement(By.xpath("//div[text()=\"Tripod & Ringligjhts from Syvo-Tygot for all photogrpahy needs, upto 70% off\"]")).click();
		
}
}