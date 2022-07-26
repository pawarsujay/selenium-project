package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class nyka_soap_Page {

	//Step1: Declare variable globaly with private access specifier using @FindBy annotation

	@FindBy (xpath="//img[@alt=\"Pears Soft & Fresh Bathing Bar Super Saver Pack Of 4\"]")private WebElement pears;
    @FindBy (xpath="(//span[text()=\"Add to Bag\"])[1]")private WebElement AddToCart;
	//Step2: create constructor with public

	public nyka_soap_Page (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Step3:Utilize within a method with access level public
	
	public void soapPears()
	{
		pears.click();
	}
	
	public void AddToBag()
	{
		AddToCart.click();
	}
}
