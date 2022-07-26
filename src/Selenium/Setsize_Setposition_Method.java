package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize_Setposition_Method {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		//setSize():This function is used to set the size of browser as per given dimensions. 
		Dimension d = new Dimension(500,500);
		driver.manage().window().setSize(d);
		System.out.println(d);
		Thread.sleep(2000);
		
		//setPosition():This function is used to set the position of browser as per given parameter. 
		Point p =new Point(300,300);
		driver.manage().window().setPosition(p);
		System.out.println(p);
		
	}
}
