package webtabledemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rowsize {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Yogeshwar\\Desktop\\selenium\\Tabledemo.HTML");
		Thread.sleep(2000);
		
		List<WebElement> row=driver.findElements(By.xpath("//table[@id=\"’1234’\"]//tr"));
		
		int sizeofrow= row.size();
		
		System.out.println("No of Rows present in the table"+sizeofrow);
	}
}
