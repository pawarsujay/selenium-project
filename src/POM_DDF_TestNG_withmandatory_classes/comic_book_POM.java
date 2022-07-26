package POM_DDF_TestNG_withmandatory_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class comic_book_POM {

	
	  @FindBy (xpath="//h3[text()=\"Wonder Woman Vol 1 Blood by B. Azzarello (2013, Trade Paperback)\"]")private WebElement book;


     public  comic_book_POM(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }


     public void comicbook() throws InterruptedException
     {
    	 Thread.sleep(5000);
    	 book.click();
     }



}
