package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNG_testclass1 {

	@Test
	  public void openapp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Reporter.log("opening application flipkart", true);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.close();
		Reporter.log("Closed Browser");

	}
	@Test
	public void openamazon() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Reporter.log("open amazon app", true);
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.close();
		Reporter.log("Closed Browser");
	}
}
