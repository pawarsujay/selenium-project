package popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenpopup {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("abcder");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("bjhb");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();

	}

	}

