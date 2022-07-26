package ListHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselectablevalidation {

	//Testcase1: Verify that listbox is multiselectable
	public static void main(String args []) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
		Thread.sleep(5000);
		
		//Step1: Identify listbox element
		WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		//Step2
		Select d= new Select(day);
		//Step3
		boolean output=d.isMultiple();
		if(output==true)
		{
			System.out.println("Test case passed: listbox is multiselectable");
		}
		else
		{
			System.out.println("test case fail: listbox is single selectable");
		}
	}

	}

