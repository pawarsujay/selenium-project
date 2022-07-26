package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Locator_Youtube {

	public static void main(String args []) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Youtube.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("search_query")).sendKeys("Me radhika jr tu savala");
		Thread.sleep(2000);
        driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(3000);
		
		
            driver.findElement(By.xpath("//a[@href='/watch?v=vAss25L3kbE']")).click();
            Thread.sleep(50000);
            driver.navigate().back();
            driver.findElement(By.name("search_query")).clear();
            driver.findElement(By.name("search_query")).sendKeys("selenium");
            driver.findElement(By.id("search-icon-legacy")).click();
            driver.findElement(By.xpath("//a[@id='videotitle']")).click();

            Thread.sleep(50000);
            driver.close();
       	}
}
