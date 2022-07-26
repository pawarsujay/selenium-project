package Javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sendkeys {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		WebElement ele=driver.findElement(By.name("q"));
	//	ele.sendKeys("Selenium automation tool");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("document.getElementsByName(\"q\")[0].value='selenium'");
		
	//	js.executeScript("arguments[0].value='selenium'",ele);
		
		Actions act = new Actions (driver);
		act.sendKeys(ele,"selenium automation tool").perform();
	
	}
}
