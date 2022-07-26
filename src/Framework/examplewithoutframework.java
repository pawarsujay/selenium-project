package Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class examplewithoutframework {

	public static void main (String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("8482809373");
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys("Hello@1234");
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]/span[text()=\"Login\"]")).click();
		Thread.sleep(1000);
		WebElement login=driver.findElement(By.xpath("(//div[@class=\"exehdJ\"])[1]"));
		String actualID=login.getText();
		System.out.println(actualID);
		String expectedID="Pooja";
		if(actualID.equalsIgnoreCase(expectedID))
		{
			System.out.println("Test case  passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
	}

}