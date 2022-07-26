package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetcurrentUrlMethod {
public static void main (String arggs []) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.com/");
	String url= driver.getCurrentUrl();
	System.out.println(url);
	
	//testcase1: Verify that user is launch correct url
	
	if(url.equalsIgnoreCase("https://www.redbus.com/"))
	{
		System.out.println("Test case is passed");
	}
	else
	{
		System.out.println("Test case is failed");
	}
	Thread.sleep(3000);
	driver.close();

	
	
}
}
