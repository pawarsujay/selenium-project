package Scroll_Up_Down;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		// scroll up 
	//	js.executeScript("window.scrollBy(0,400);");
	//	Thread.sleep(5000);
		// scroll down
	//	js.executeScript("window.scrollBy(0,-400);");
		
		// bottom of screen or webpage
		// js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
	//	Thread.sleep(5000);
		
		// scroll to any webelement
		
		WebElement ele = driver.findElement(By.xpath("//a[@title=\"Facebook\"]"));
		js.executeScript("arguments[0].scrollIntoView()",ele);
		
		
	}
}
