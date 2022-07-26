package POM_with_DDF;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_class {

	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		flipkat_login_Page lp = new flipkat_login_Page (driver);
		
		lp.EnterEmail();
		lp.Enterpassword();
		lp.login();
		
		Thread.sleep(2000);
		
		flipkart_Home_Page hp = new flipkart_Home_Page(driver);
				hp.validateusername();
	}
}
