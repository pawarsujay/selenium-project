package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments3 {

	public static void main (String args []) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(1000);
		Dimension d = new Dimension(1000,700);
		driver.manage().window().setSize(d);
		String title=driver.getTitle();
		String url= driver.getCurrentUrl();
		System.out.println("Title of webpage: "+title+" Url of webpage: "+url);
            Thread.sleep(2000);
            driver.navigate().to("https://www.flipkart.com/");
            driver.navigate().refresh();
            Thread.sleep(2000);
            Point p = new Point(100,100);
            driver.manage().window().setPosition(p);
            Thread.sleep(2000);
            driver.navigate().back();
            String t=driver.getTitle();
    		if(t.equalsIgnoreCase("Facebook � log in or sign up"))
    		{
    			System.out.println("test is passed");
    		}
    		else
    		{
    			System.out.println("test is failed");
    		}
              driver.navigate().refresh();
              Thread.sleep(2000);
              driver.quit();
            
            		
		
		
		
		
	}
}
