package POM_DDF_TestNG_withmandatory_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_Log_out {

	
	//Step1:Data member should be declared globaly with access level private using @findBy Annotation

		// WebDriver driver;
		
		@FindBy(xpath="(//div[@class=\"exehdJ\"])[1]")private WebElement name;
		@FindBy(xpath="//div[text()=\"Logout\"]")private WebElement logout;
		//Step2:. Initialize within a constructor with access level public using pagefactory class
	   
		public Flipkart_Log_out(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		
		public void verifyname(WebDriver driver)
		{
			Actions act = new Actions (driver);
			act.moveToElement(name).perform();		
		}
			

		
		
		public void logout() throws InterruptedException
		{
			Thread.sleep(3000);
			logout.click();
		}
		
		
		
}
