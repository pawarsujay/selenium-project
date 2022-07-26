package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String args []) throws InterruptedException
	{
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(1000);
		Point p= new Point(400,200);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		//testcase1: Verify that user is open to correct webpage
		if(title.equalsIgnoreCase("Gifts for Dad"))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(2000);
		Dimension d = new Dimension(700, 700);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		
	}
}
