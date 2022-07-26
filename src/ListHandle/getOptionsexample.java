package ListHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptionsexample {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
		Thread.sleep(3000);
		WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));

		Select m = new Select(month);
		
		List<WebElement> ele = m.getOptions();
		
		for(WebElement s:ele)
		{
			System.out.println(s.getText());
		}
}
}