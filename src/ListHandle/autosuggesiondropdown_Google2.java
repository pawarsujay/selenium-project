package ListHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggesiondropdown_Google2 {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("cricbuzz");
		     Thread.sleep(3000);
		     
		     List<WebElement> ele=driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]//ul/li"));
		        Thread.sleep(2000);
		        
		        String expected = "cricbuzz ipl 2022";
		        for(WebElement s:ele)
		        {
		        	String actual =s.getText();
		        	if(expected.equalsIgnoreCase(actual))
		        	{
		        		s.click();
		        		break;
		        	}
		        }
		        Thread.sleep(3000);
		  driver.close();
	}
}
