package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example_with_DDF {

	public static void main (String args []) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		FileInputStream file = new FileInputStream ("C:\\Users\\Yogeshwar\\Desktop\\Parameterization\\demo.xlsx");
	    XSSFWorkbook book = new XSSFWorkbook(file);
	    XSSFSheet sh = book.getSheet("Sheet2");
	    
	    driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
		
		String user = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys(user);

	     String pass = sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys(pass);

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

