package Practice_Set;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
			       driver.get("https://www.naukri.com/");
			       
			   driver.findElement(By.xpath("(//div[@class='mTxt'][1])")).click();
			driver.findElement(By.xpath("//div[text()='Companies']")).click();
		
			driver.findElement(By.xpath("//div[text()='Services']")).click();
			
			Set<String> ids = driver.getWindowHandles();
		
		 ArrayList a = new ArrayList(ids); 
		     System.out.println(a.get(0));        //parent Browser
	      	String parentTitle = driver.getTitle();
	        System.out.println(parentTitle);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Java & Automation");
		  
		System.out.println("<===>");
		
		System.out.println(a.get(1));
		  driver.switchTo().window((String) a.get(1)); 
		  String child1 = driver.getTitle();
	      System.out.println(child1);
		
	   	System.out.println("<===>");
	   	
	    System.out.println(a.get(2));
		   driver.switchTo().window((String) a.get(2)); 
		   String child2 = driver.getTitle();
		   System.out.println(child2);

		Thread.sleep(7000);
		 driver.quit();
		
		

		}
}
