package ListHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example2 {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
			Thread.sleep(3000);
			
			//Step1: identify listbox and store it in reference variable
			
			WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
			WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
			WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
			
			//Step2: create object of select class with argument as reference variable
			Select d= new Select(day);
			Select m= new Select(month);
			Select y= new Select(year);

			//Step3: use method to select particular option
			
			d.selectByValue("18");
			m.selectByVisibleText("Mar");
			y.selectByVisibleText("1994");
			
			
			
			
			

			
		
	}
}
