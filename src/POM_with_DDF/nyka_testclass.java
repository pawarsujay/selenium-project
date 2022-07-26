package POM_with_DDF;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nyka_testclass {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.nykaa.com/");

		nykaa_homepage lp = new nykaa_homepage (driver);
		lp.clickmen();
		lp.soapclick();
		
		Thread.sleep(5000);
		nyka_soap_Page subpro = new nyka_soap_Page (driver);
		
   String parentId = driver.getWindowHandle();
		
		Set<String> childId = driver.getWindowHandles();
		
		
		 
		for(String s:childId)
		{
			
			if (!s.equals(parentId))
			{
				driver.switchTo().window(s);
		subpro.soapPears();
		
		String actualTitle=driver.switchTo().window(s).getTitle();
		 String parentId1 = driver.getWindowHandle();
			
			Set<String> childId2 = driver.getWindowHandles();
			for(String s1:childId2)
			{
				
				if (!s1.equals(parentId1))
				{
					driver.switchTo().window(s1);
		if(actualTitle.contains("Pears Soft"))
		{  
			
			//Step c:
			Thread.sleep(3000);
			subpro.AddToBag();
	}
}
	}
	}
		}
	}
}
