package webtabledemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Website_apex {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www2.asx.com.au/");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h5[text()=\"S&P ASX200 top 5\"]")).click();
		
		//get no of rows
		List<WebElement> r=driver.findElements(By.xpath("(//table[@class=\"md-bootstrap-tooltip\"])[1]//tr"));
		int rs=r.size();
		System.out.println("No of rows :- "+rs);
		
		//get no of column
		List<WebElement> c=driver.findElements(By.xpath("(//table[@class=\"md-bootstrap-tooltip\"])[1]//tr[1]/th"));
		int cs=c.size();
		System.out.println("No of column :- "+cs);
		
		//get all heading table 1
		for(int k=1;k<=cs;k++)
		{
			WebElement h=driver.findElement(By.xpath("(//table[@class=\"md-bootstrap-tooltip\"])[1]//tr[1]/th["+k+"]"));
			System.out.print(h.getText()+"         ");
		}
		
		//get all remaining
		for(int i=2;i<=rs;i++)
		{
			System.out.println();
			for(int j=1;j<=cs;j++)
			{
				WebElement d=driver.findElement(By.xpath("(//table[@class=\"md-bootstrap-tooltip\"])[1]//tr["+i+"]/td["+j+"]"));
				System.out.print(d.getText()+"     ");
			}
	}
	}
}
