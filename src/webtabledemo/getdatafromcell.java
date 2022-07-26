package webtabledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getdatafromcell {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Yogeshwar\\Desktop\\selenium\\Tabledemo.HTML");
		
		WebElement cell=driver.findElement(By.xpath("//table[@id=\"’1234’\"]//tr[4]/td[2]"));
		String celldata=cell.getText();
		System.out.println(celldata);
		
		System.out.println(driver.findElement(By.xpath("//table[@id=\"’1234’\"]//tr[5]/td[3]")).getText());
	}


	}

