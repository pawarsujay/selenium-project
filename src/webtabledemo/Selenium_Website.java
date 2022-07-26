package webtabledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Website {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		Thread.sleep(2000);
		
	
		for(int i=1;i<=7;i++)
		{
			String all=driver.findElement(By.xpath("//table[@id=\"customers\"]//tr["+i+"]")).getText();
			System.out.println(all+ "     ");
			
		}
		System.out.println();
		Thread.sleep(10000);
		
		for(int j=1;j<=6;j++)
		{
			driver.findElement(By.xpath("(//input[@type=\"checkbox\"])["+j+"]")).click();
			Thread.sleep(2000);
		}
}
}
