package crossbrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class crosscompatibilityTesting {

	@Parameters("browser")
	@Test
	public void m1(String browser) throws InterruptedException
	{
		WebDriver driver=null;
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.close();
	}

}
