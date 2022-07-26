package ListHandle;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class autosuggesiondropdown {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		Options obj=driver.manage();
//		Window w=obj.window();
//		w.maximize();
		driver.get("https://www.google.com/");
		//step1: identify element and insert value
	driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("Selenium");
		Thread.sleep(2000);
		//Step2: retrive all Webelements
		List<WebElement> ele=driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]//ul/li"));
		Thread.sleep(2000);
		//step3: visit element one by one if match is there click on that webelement
		String expected="selenium download";
		for(WebElement s:ele)
		{
			String actual=s.getText();
			if(expected.equalsIgnoreCase(actual))
			{
				s.click();
				break;
			}
		}
		
//		Iterator<WebElement> var=ele.iterator();
//		while(var.hasNext())
//		{
//			//System.out.println(var.next().getText());
//			WebElement e=var.next();
//			String actual=e.getText();
//			if(expected.equalsIgnoreCase(actual))
//			{
//				e.click();
//				break;
//			}			
//		}
		driver.close();

}
}