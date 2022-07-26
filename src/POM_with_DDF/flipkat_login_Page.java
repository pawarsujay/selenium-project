package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkat_login_Page {

	//Step1: Declare variable globaly with private access specifier using @FindBy annotation
	
	@FindBy(xpath="//input[@class=\"_2IX_2- VJZDxU\"]")private WebElement user;
	//private WebElement user=driver.findElement(By.xpath(""));
	
	@FindBy(xpath="//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")private WebElement pass;
	
	@FindBy(xpath="//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]/span[text()=\"Login\"]")private WebElement login;
	
	         //Step2: create constructor with public
	
	public flipkat_login_Page (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Step3:Utilize within a method with access level public
	
	public void EnterEmail()
	{
		user.sendKeys("8482809373");
	}
	
	public void Enterpassword()
	{
		pass.sendKeys("Hello@1234");
	}
	
	public void login()
	{
		login.click();
	}
	
	
	
	
	
	
	
	
	
	
}
