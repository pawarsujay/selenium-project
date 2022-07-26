package POM_DDF_TestNG_withmandatory_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Ebay_Home {

	//Step1:Data member should be declared globaly with access level private using @findBy Annotation

	@FindBy (xpath="(//a[text()=\"Collectibles and Art\"])[1]") private WebElement art;
	@FindBy (xpath="//a[text()=\"Comics\"]") private WebElement comi;
	//Step2:. Initialize within a constructor with access level public using pagefactory class
	
	public POM_Ebay_Home (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void collectionart(WebDriver driver)
	{
		Actions act = new Actions (driver);
		act.moveToElement(art).perform();
	}
	
	//Step3:Utilize within a method with access level public

	public void comics() throws InterruptedException
	{
		comi.click();
		Thread.sleep(3000);
	}
}
