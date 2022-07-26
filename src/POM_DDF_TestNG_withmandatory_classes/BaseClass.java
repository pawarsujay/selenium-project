package POM_DDF_TestNG_withmandatory_classes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	//Base class contains all mandatory code needed for each and 
		//every test class present in your project

     public WebDriver driver;
	
	public void configurebrowser()
	{
		//configure browser
		//configure browser
				System.setProperty("webdriver.chrome.driver", "C:\\velocity\\eclipce-workspace\\Velocity_Sujay_Pawar\\BrowserDriver\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
				
				//open application in browser
			//	driver.get("https://www.ebay.com/");
				
				driver.get("https://www.flipkart.com/");
	}

}
