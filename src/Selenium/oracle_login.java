package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class oracle_login {

	public static void main(String args []) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.oracle.com/mysso/signon.jsp/");
		
		WebElement ele=driver.findElement(By.id("sso_username"));
		Thread.sleep(2000);
		ele.sendKeys("sjpawar35@gmail.com");
		Thread.sleep(1000);
		
		WebElement pass =driver.findElement(By.id("txtPassword"));
		Thread.sleep(2000);
	    pass.sendKeys("Sujay@123");
	    Thread.sleep(2000);
	    
	   WebElement login =  driver.findElement(By.id("btnLogin"));
	   Thread.sleep(2000);
	   login.click();
	   Thread.sleep(4000);
	   driver.quit();
	}
}


