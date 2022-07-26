package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relative_xpath {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		//enter username
		driver.findElement(By.xpath("//div[2]/input")).sendKeys("Admin");
		Thread.sleep(1000);
		//enter password
		driver.findElement(By.xpath("//div[3]/input")).sendKeys("admin123");
		Thread.sleep(1000);
		//click on loginbutton
		driver.findElement(By.xpath("//div[5]/input")).click();

	}
}
