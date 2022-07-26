package popuphandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class particularchildwindowhandling {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt=\"LinkedIn OrangeHRM group\"]")).click();
		driver.findElement(By.xpath("//img[@alt=\"OrangeHRM on Facebook\"]")).click();
		driver.findElement(By.xpath("//img[@alt=\"OrangeHRM on twitter\"]")).click();
		Thread.sleep(2000);

		//Step1:
		String parentID=driver.getWindowHandle();
		
		//Step2:
		Set<String> childid=driver.getWindowHandles();
		
		//Step3:
		for(String s: childid)
		{
			if(!s.equals(parentID))
			{
				// Step a:
				String actualTitle=driver.switchTo().window(s).getTitle();
				
				//Step b:
				if(actualTitle.contains("LinkedIn"))
				{
					
					//Step c:
					driver.findElement(By.xpath("//input[@id=\"email-or-phone\"]")).sendKeys("sujay");
					Thread.sleep(2000);
					driver.close();
				}
				driver.close();
				
			}
		}
	}

	}

