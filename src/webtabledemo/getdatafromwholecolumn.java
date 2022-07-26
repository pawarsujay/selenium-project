package webtabledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getdatafromwholecolumn {
 
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Yogeshwar\\Desktop\\selenium\\Tabledemo.HTML");
		
		for(int i=1;i<=5;i++)
		{
			if (i==1)
			{
				String allcoldata= driver.findElement(By.xpath("//table[@id=\"’1234’\"]//tr["+i+"]//th[2]")).getText();
			       System.out.println(allcoldata);
			}
			else
			{
				String coldata = driver.findElement(By.xpath("//table[@id=\"’1234’\"]//tr["+i+"]//td[2]")).getText();
			      System.out.println(coldata);
			}
		}
	}
}
