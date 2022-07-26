package webtabledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getdataofwholerow {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Yogeshwar\\Desktop\\selenium\\Tabledemo.HTML");
		
		for(int i=1;i<=3;i++)
		{
		String rowdata= driver.findElement(By.xpath("//table[@id=\"’1234’\"]//tr[2]//td["+i+"]")).getText();
		System.out.println(rowdata+" ");
	}
}
}
