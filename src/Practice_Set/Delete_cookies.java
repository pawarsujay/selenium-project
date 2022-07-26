package Practice_Set;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_cookies {

	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		 Set ck = driver.manage().getCookies();
	      System.out.println("Cookie count: "+ck.size());
	   driver.manage().deleteAllCookies();
	}
}
