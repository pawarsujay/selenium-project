package Actionclass_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drganddropdemo {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);

		List<WebElement> e=driver.findElements(By.xpath("//a[@class=\"button button-orange\"]"));
		
		WebElement drag =e.get((1));
		WebElement drop=driver.findElement(By.xpath("//ol[@id=\"bank\"]"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag, drop).perform();
	}
}
