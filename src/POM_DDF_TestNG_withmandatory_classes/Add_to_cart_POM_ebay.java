package POM_DDF_TestNG_withmandatory_classes;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_to_cart_POM_ebay {

	
	@FindBy (xpath="//div[@id=\"s0-0-18-5-11-26-77-2[1]\"]")private WebElement cart;


	public Add_to_cart_POM_ebay(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

    public void addtocart(WebDriver driver)
    {
    	String parentId = driver.getWindowHandle();
    	Set <String> childId = driver.getWindowHandles();
    	ArrayList a = new ArrayList (childId);
    	driver.switchTo().window((String)a.get(1));		
    	cart.click();
    }

}
