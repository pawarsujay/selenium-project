package webtabledemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Website_apex2 {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www2.asx.com.au/");
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h5[text()=\"S&P ASX200 top 5\"]")).click();
		
		//get number of rowsize
		
		List<WebElement> row= driver.findElements(By.xpath("(//table[@class=\"md-bootstrap-tooltip\"])[2]//tr"));
	  int rowsize = row.size();
	  System.out.println("Number of Rowsize"+ rowsize); 
	  
	  //get column size
	  
	  List<WebElement> col = driver.findElements(By.xpath("(//table[@class=\"md-bootstrap-tooltip\"])[2]//tr[1]//th"));
	  int colsize = col.size();
	  System.out.println("number of Columnsize"+ colsize);
	  
	  // get all data from table
	  
	  for(int k=1;k<=colsize;k++)
		{
			WebElement h=driver.findElement(By.xpath("(//table[@class=\"md-bootstrap-tooltip\"])[2]//tr[1]/th["+k+"]"));
			System.out.print(h.getText()+"         ");
		}
	  for(int i=2;i<=rowsize;i++)
		{
	
		for(int j=1;j<=colsize;j++)
		{
			 WebElement d= driver.findElement(By.xpath("(//table[@class=\"md-bootstrap-tooltip\"])[2]//tr["+i+"]//td["+j+"]"));
			System.out.println(d.getText()+"        ");
		}
		
		
		
		
		
		
	}
	}
}	
	
		