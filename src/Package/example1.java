package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1 {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		
		driver.switchTo().frame("frame1");
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id=\"a\"]")).click();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input")).sendKeys("hello");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		WebElement an=driver.findElement(By.xpath("//select[@id=\"animals\"]"));
		an.click();
		Select s= new Select(an);
		s.selectByValue("big baby cat");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input")).clear();	
	}

}
