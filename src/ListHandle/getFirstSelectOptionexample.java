package ListHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getFirstSelectOptionexample {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
		Thread.sleep(3000);
		
		//Step1: Identify listbox element
				WebElement mo=driver.findElement(By.xpath("//select[@id=\"month\"]"));
				
				//Step2: Create object of Select Class
				Select se= new Select(mo);
				
				
				se.selectByVisibleText("Jul");
				
				String expResult="Jul";
				
				//Verification
				
				String ActualResult=se.getFirstSelectedOption().getText();
				System.out.println(ActualResult);
				if(expResult.equalsIgnoreCase(ActualResult))
				{
					System.out.println("Test case passed");
				}
				else
				{
					System.out.println("test case failed");
				}


}
}