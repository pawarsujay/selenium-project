package ListHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
		Thread.sleep(2000);
		
		//Step1: Identify listbox element
		WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		day.click();
		
		//Step2: Create object of Select Class
		Select se= new Select(day);
		
		//Step3: Select option by method selectByValue()
		se.selectByValue("18");
		//se.selectByVisibleText("20");
		//se.selectByIndex(11);
	}

}
