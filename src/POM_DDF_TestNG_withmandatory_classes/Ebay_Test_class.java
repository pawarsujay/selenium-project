package POM_DDF_TestNG_withmandatory_classes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ebay_Test_class extends BaseClass

{
	
	POM_Ebay_Home hp;
	comic_book_POM cb;
	Add_to_cart_POM_ebay ac;
	
	@BeforeClass
	public void openapp() throws IOException
	{
		configurebrowser();
		
		//created and initialized objects of POM classes
		hp=new POM_Ebay_Home(driver);
		cb=new comic_book_POM(driver);
		ac=new Add_to_cart_POM_ebay(driver);
	}
	@BeforeMethod
	public void loginapp() throws IOException
	{
		
		
		
		
		UtilityClass.screenShot(driver, "login");
	}
	@Test
	public void gotoart() throws IOException, InterruptedException
	{
		hp.collectionart(driver);
		hp.comics();
		
		UtilityClass.screenShot(driver, "login");
	}
	
	public void comicsbook() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		cb.comicbook();
		UtilityClass.screenShot(driver, "login");
	}
	
	public void cart() throws IOException
	{
		ac.addtocart(driver);
		
		UtilityClass.screenShot(driver, "login");
		
	}
	@AfterMethod
	public void purchase()
	{
		System.out.println("You Have SucessFully Place Your Order");
	}
	//@AfterClass
	//public void closeapp()
	{
		//driver.quit();
		
//		cb=null;
//		ac=null;
//		driver=null;
//		hp=null;
	}

}
