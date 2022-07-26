package ListHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamiclistexample2 {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		          WebDriver driver = new ChromeDriver();
		          driver.manage().window().maximize();
		          driver.get("https://www.spicejet.com/");
		          Thread.sleep(3000);
		          
		          driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers\"]")).click();
		          Thread.sleep(5000);
		        WebElement adult  =driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]"));
		          int i=1;
		          while(i<5)
		          {
		        	 adult.click();
		        	 i++;
		          }
		          WebElement child=driver.findElement(By.xpath("//div[@data-testid=\"Children-testID-plus-one-cta\"]"));
		          for (int k=1;k<3;k++)
		          {
		        	  child.click();
		        	  
		          }
		          Thread.sleep(3000);
		          WebElement infant=driver.findElement(By.xpath("//div[@data-testid=\"Infant-testID-plus-one-cta\"]"));
		          for(int j=1;j<4;j++)
		          {
		        	 infant.click(); 
		          }
		          
		          
		          
	}
}
