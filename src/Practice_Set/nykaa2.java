package Practice_Set;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nykaa2 {

	public static void main(String[] args) throws InterruptedException
	{
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.nykaa.com/");
		
//		@FindBy(xpath="//a[@href=\"/men-s-grooming-shop-all-products/c/9150?root=nav_1&dir=desc&order=popularity\"]")private WebElement men;
//		@FindBy(xpath="//a[@href=\"/mens/bath-body/soaps/c/1312?ptype=lst&id=1312&root=nav_3&dir=desc&order=popularity\"]")private WebElement soaps;

		WebElement men=driver.findElement(By.xpath("//a[text()=\"men\"]"));
		Actions b=new Actions(driver);
		b.moveToElement(men).perform();
		//a.moveToElement(men)
		driver.findElement(By.xpath("//a[@href=\"/mens/bath-body/soaps/c/1312?ptype=lst&id=1312&root=nav_3&dir=desc&order=popularity\"]")).click();

		Set<String> ids = driver.getWindowHandles();
		ArrayList a = new ArrayList(ids); 
	     System.out.println(a.get(0));        //parent Browser
     	String parentTitle = driver.getTitle();
       System.out.println(parentTitle); 
	
       

		System.out.println(a.get(1));
		  driver.switchTo().window((String) a.get(1)); 
		  String child1 = driver.getTitle();
		  System.out.println(child1);
			driver.findElement(By.xpath("//div[text()=\"Pears Soft & Fresh Bathing Bar Super Saver Pack Of 4\"]")).click();

			String p1=driver.getWindowHandle();
			Set<String> c1=driver.getWindowHandles();
			for(String s1:c1)
			{
				  if(!s1.equalsIgnoreCase(p1))
				{
					driver.switchTo().window(s1);
              		String s3=driver.getTitle();
					if(s3.contains("Pears Soft"))
					{
			        //  driver.switchTo().window(s1);
					driver.findElement(By.xpath("//span[text()=\"Add to Bag\"]")).click();

		Thread.sleep(7000);
	}
				}
			}
	}
}
