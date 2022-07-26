package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GmailXpath {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/");
	     Thread.sleep(3000);
	     
	     WebElement ele=driver.findElement(By.xpath("//input[starts-with(@type,\"em\")]"));
	     ele.sendKeys("sjpawar35@gmail.com");
	    Thread.sleep(3000);
	   
	     
	     driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
	     Thread.sleep(2000);
	     
	   
	     driver.findElement(By.xpath("//input[starts-with(@type,\"pass\") and contains(@dir,\"lt\")]")).sendKeys("kari.shyam");
            Thread.sleep(3000);
            
          //*[@id="view_container"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[3]/div/div[1]/div/div/div[1]/div/input
            driver.findElement(By.tagName("input")).click();
            Thread.sleep(3000);
            
            driver.findElement(By.xpath("//span[contains(text(),\"Next\")]")).click();
            Thread.sleep(2000);
            driver.close();
	}
}
