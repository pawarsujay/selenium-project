package Scroll_Up_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Horizontal_Scroll {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.album.alexflueras.ro/index.php");
		Thread.sleep(3000);
		
	WebElement scrollright = driver.findElement(By.id("a22"));
	WebElement scrollleft = driver.findElement(By.id("a1"));

		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		js.executeScript("arguments[0].scrollIntoView()", scrollright);
		
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView()", scrollleft);

}
}
