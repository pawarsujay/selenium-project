package ListHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllselectedOptionsexample {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Yogeshwar\\Desktop\\Velocity\\HTMLCODE.html");
		Thread.sleep(1000);

		// step 1 
		
		WebElement L = driver.findElement(By.tagName("Select"));
		
		// step 2
		
		Select o = new Select(L);
		
		o.selectByIndex(1);
		o.selectByIndex(3);
		o.selectByIndex(4);
		
		List<WebElement> sel = o.getAllSelectedOptions();
		for (WebElement w: sel)
		{
			System.out.println(w.getText());
		}
		
		
		
}
}