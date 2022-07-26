package Actionclass_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doublclickdemo {

	public static void main(String args []) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(3000);
		
		// step 1
		 
		WebElement e=driver.findElement(By.xpath("//button[text()=\"Double-Click Me To See Alert\"]"));
		
		//step 2
		Actions act = new Actions(driver);
		
		act.doubleClick(e).perform();
		
	}
}
