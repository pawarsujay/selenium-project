package Hard_Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import graphql.Assert;

public class Assert_TrueMethod {

	@Test
	public void amazon()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		boolean logo = driver.findElement(By.xpath("//a[@aria-label=\"Amazon\"]")).isDisplayed();
	  Assert.assertTrue(logo);
	}
}
