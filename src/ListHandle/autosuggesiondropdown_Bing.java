package ListHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggesiondropdown_Bing {

	public static void main(String args []) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		     WebDriver driver = new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.get("https://www.bing.com/");
		     Thread.sleep(3000);
		     
		    driver.findElement(By.xpath("//input[@id=\"sb_form_q\"]")).sendKeys("cricbuzz");
		    Thread.sleep(3000);
		    
		    // retrive all elements
		    List<WebElement> ele=driver.findElements(By.xpath("//ul[@id=\"sa_ul\"]"));	
		    Thread.sleep(3000);
		    
			//step3: visit element one by one if match is there click on that webelement

		    String expected="cricbuzz ipl";
		    
			for(WebElement s:ele)
			{
				String actual=s.getText();
				if(expected.equalsIgnoreCase(actual))
				{
					s.click();
					break;
				}
			}
			

			driver.close();		
		    }
		     
	
}

