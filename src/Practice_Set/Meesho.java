package Practice_Set;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Meesho {

	   static WebDriver driver;
	public static void main(String args[]) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		     driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://meesho.com/");
		    Thread.sleep(3000);
		    Screenshot("Application open meesho");
		    
		    driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("skidding shoes");
		    driver.findElement(By.xpath("//span[@class=\"TextSearch__IconWrapper-sc-n7qqmw-1 blmLPO\"]")).click();
		    Screenshot("skidding shoes click");
		    List<WebElement> ele = driver.findElements(By.xpath("//div[@class=\"search-results\"]"));
		       Thread.sleep(3000);
		       
		       String expected = "skidding shoes";
		       for(WebElement s:ele)
		       {
		    	   String actual = s.getText();
		    	   if (expected.equalsIgnoreCase(actual))
		    	   {
		    		   s.click();
		    		   break;
		    	   }
		    	   
		       }
		       Thread.sleep(3000);
		       
		       driver.findElement(By.xpath("//img[@src=\"https://images.meesho.com/images/products/83819161/zu0uf_400.jpg\"]")).click();
		       Thread.sleep(3000);
		       
		    driver.findElement(By.xpath("//span[text()=\"IND-7\"]")).click();
		    Screenshot("size chek");
		    driver.findElement(By.xpath("//span[text()=\"Buy Now\"]")).click();
		    
		  }
	             public static void Screenshot(String filename) throws IOException
	             {
	            	 TakesScreenshot screen =(TakesScreenshot) driver;
	            	 
	            	File src = screen.getScreenshotAs(OutputType.FILE);
	            	
	            	File dest = new File("C:\\Users\\Yogeshwar\\Desktop\\selenium\\Screenshot"+filename+"PNG");
	            	
	            	 FileHandler .copy(src, dest);
	            	 
	            	 }
}
