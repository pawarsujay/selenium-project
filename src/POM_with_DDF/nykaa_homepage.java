package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class nykaa_homepage {

	//Step1: Declare variable globaly with private access specifier using @FindBy annotation

	@FindBy (xpath="//a[text()=\"men\"]")  private WebElement men;
	 @FindBy (xpath="//a[@href=\"/mens/bath-body/soaps/c/1312?ptype=lst&id=1312&root=nav_3&dir=desc&order=popularity\"]") private WebElement soap;
	//Step2: create constructor with public
	
	public nykaa_homepage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		Actions Act = new Actions (driver);
		Act.moveToElement(men).perform();
       
	}
	
	
	//Step3:Utilize within a method with access level public
	
	public void clickmen()
	{
		
	}
	public void soapclick()
	{
		soap.click();
	}
	
}
