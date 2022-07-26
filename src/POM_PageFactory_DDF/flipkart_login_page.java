package POM_PageFactory_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkart_login_page {

	//Step1: Declare variable globaly with private access specifier using @FindBy annotation
	
	@FindBy(xpath="//input[@class=\"_2IX_2- VJZDxU\"]")private WebElement user;
	
	//private WebElement user=driver.findElement(By.xpath(""));
	
	@FindBy(xpath="//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")private WebElement pass;
	
	@FindBy(xpath="//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]/span")private WebElement login;
	
	//Step2: create constructor with public
	
	public flipkart_login_page (WebDriver driver)
	{
		PageFactory.initElements(driver, this); 
		
	}
	
	//Step3:Utilize within a method with access level public
	
	public void enteremail(String email)
	{
		user.sendKeys(email);
	}
	public void enterpassword(String p)
	{
		pass.sendKeys(p);
		
	}
	public void loginclick()
	{
		login.click();
	}
}
