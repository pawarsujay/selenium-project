package webtabledemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CherCher_Website {

	public static void main(String args[]) throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chercher.tech/practice/table");
	Thread.sleep(3000);
	
	// get number of rows 
	List <WebElement> rs = driver.findElements(By.xpath("//table[@id=\"webtable\"]//tr"));
	 int rowsize = rs.size();
	 System.out.println(" number of rowsize "+rowsize);
	 
	 // get number of column
	 List<WebElement> cs = driver.findElements(By.xpath("//table[@id=\"webtable\"]//tr[1]//th"));
	 int columnsize = cs.size();
	 System.out.println(" number of column "+columnsize);
	 
	 
	// get all heading in table
	 
	 for (int k=1; k<=columnsize;k++)
	 {
		 WebElement head= driver.findElement(By.xpath("//table[@id=\"webtable\"]//tr[1]//th["+k+"]"));
	       System.out.print(head.getText()+"      ");
	 }
	 // get all remaining
	 for (int i=2;i<=rowsize;i++)
	 {
		 System.out.println();
		 for (int j=1;j<=columnsize;j++)
		 {
			 WebElement alldata= driver.findElement(By.xpath("//table[@id=\"webtable\"]//tbody//tr["+i+"]//td["+j+"]"));
		      System.out.print(alldata.getText()+"       ");
		 }
	 }
	
}
}