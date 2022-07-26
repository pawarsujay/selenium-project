package popuphandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplechildbrowserwindow {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id=\"tabButton\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"windowButton\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"messageWindowButton\"]")).click();
		
		// step1
		
		String mainpage = driver.getWindowHandle();
		
		// step 2
		
		Set<String> childid = driver.getWindowHandles();
		System.out.println(childid.size());
		
		// step 3
		for (String s:childid )
		{
			if(!s.equals(mainpage))
			{
				driver.switchTo().window(s);
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(mainpage);
	}
}
