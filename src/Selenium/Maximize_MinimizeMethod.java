package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_MinimizeMethod {

	public static void main(String args[]) throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.swiggy.com/");
       Thread.sleep(3000);
       driver.manage().window().maximize();
       Thread.sleep(3000);
       driver.manage().window().minimize();
       Thread.sleep(3000);
       driver.quit();
       
	}
}
