package POM_PageFactory_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkart_home_page {

	//Step1:Data member should be declared globaly with access level private using @findBy Annotation

	@FindBy (xpath="(//div[@class=\"exehdJ\"])[1]")private WebElement username;

	//Step2:. Initialize within a constructor with access level public using pagefactory class
          
	        public flipkart_home_page (WebDriver driver)
	        {
	        	PageFactory.initElements(driver, this);
	        }
	        
			//Step3:Utilize within a method with access level public
	        
	        public void validateusername()
	        {
	             String actual =	username.getText();
	             String expected = "Pooja";
	             
	             if (actual.equalsIgnoreCase(expected))
	             {
	            	 System.out.println("Test case is Passed");
	             }
	             else 
	             {
	            	 System.out.println("Test case is Failed");
	             }
	        
	        }

}
