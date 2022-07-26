package ParallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting_class2 {

	@Test
	 public void m1() throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.close();
	 }
}
